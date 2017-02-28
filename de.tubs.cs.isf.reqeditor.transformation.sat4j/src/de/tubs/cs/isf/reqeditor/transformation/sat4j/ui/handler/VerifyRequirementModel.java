package de.tubs.cs.isf.reqeditor.transformation.sat4j.ui.handler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.sat4j.core.VecInt;
import org.sat4j.minisat.SolverFactory;
import org.sat4j.specs.ContradictionException;
import org.sat4j.specs.IProblem;
import org.sat4j.specs.ISolver;
import org.sat4j.specs.TimeoutException;

import de.tubs.cs.isf.reqeditor.transformation.text.Requirement2CNF;
import de.tubs.cs.isf.requirementseditor.Expression;
import de.tubs.cs.isf.requirementseditor.Literal;
import de.tubs.cs.isf.requirementseditor.NOT;
import de.tubs.cs.isf.requirementseditor.RequirementModelElement;
import de.tubs.cs.isf.requirementseditor.RequirementsEditorPackage;
import de.tubs.cs.isf.requirementseditor.RequirementsModel;
import de.tubs.cs.isf.requirementseditor.TwoOperandsExpression;

public class VerifyRequirementModel extends AbstractHandler{

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbenchWindow window = HandlerUtil.getActiveWorkbenchWindowChecked(event);
		//		MessageDialog.openInformation(
		//				window.getShell(),
		//				"ToCSV",
		//				"TODO: Export Constraints to cnf file");
		ISelection selection = window.getSelectionService().getSelection();
		if (selection instanceof IStructuredSelection) {
			Object selected = ((IStructuredSelection)selection).getFirstElement();
			if (selected instanceof IFile) {
				IFile file = (IFile) selected;
				RequirementsEditorPackage.eINSTANCE.eClass();
				Resource.Factory.Registry rfReg = Resource.Factory.Registry.INSTANCE;
				rfReg.getExtensionToFactoryMap().put("reqs", new XMIResourceFactoryImpl());

				ResourceSet rs = new ResourceSetImpl();
				Resource r = rs.getResource(URI.createFileURI((file.getLocation()).toString()), true);

				RequirementsModel model = (RequirementsModel) r.getContents().get(0);

				Expression cnf = Requirement2CNF.convertToCNF(model);
				if (cnf == null) {
					MessageDialog.openInformation(window.getShell(), "Success", "No Constraints Defined!\nTherefore, all Constraints are satisfiable and unsatisfiable...");
					return null;
				}
				List<Expression> clauses = Requirement2CNF.clausesForCNF(cnf);
				List<RequirementModelElement> vars;
				vars = new ArrayList<>(Requirement2CNF.literalElements(cnf));

				ISolver solver = SolverFactory.newDefault();

				// prepare the solver to accept MAXVAR variables. MANDATORY for MAXSAT solving
				solver.newVar(vars.size());
				solver.setExpectedNumberOfClauses(clauses.size());
				// Feed the solver using Dimacs format, using arrays of int
				// (best option to avoid dependencies on SAT4J IVecInt)
				for (int i=0; i < clauses.size();i++) {
					int [] clause = clauseToArray(clauses.get(i), vars);// get the clause from somewhere
					// the clause should not contain a 0, only integer (positive or negative)
					// with absolute values less or equal to MAXVAR
					// e.g. int [] clause = {1, -3, 7}; is fine
					// while int [] clause = {1, -3, 7, 0}; is not fine 

					try {
						solver.addClause(new VecInt(clause)); // adapt Array to IVecInt
					} catch (ContradictionException e) {
						// TODO Auto-generated catch block
						//e.printStackTrace();
						String reqElements = Arrays.stream(clause).mapToObj(j -> vars.get(Math.abs(j)-1).getName()).reduce("", (l,m) -> l + ", " + m);
						MessageDialog.openInformation(window.getShell(), "Shit Happened", "One of the following RequirementModelElements is part of a contradiction:\n" + reqElements.substring(2));
						return null;
					}
				}

				// we are done. Working now on the IProblem interface
				IProblem problem = solver;
				try {
					if (problem.isSatisfiable()) {
						MessageDialog.openInformation(window.getShell(), "Success", "Constraints are satisfiable");
					} else {
						MessageDialog.openInformation(window.getShell(), "Shit Happened", "Constraints are not satisfiable");
					}
				} catch (TimeoutException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return null;
	}

	private static int[] clauseToArray(Expression clause, List<RequirementModelElement> vars) {
		if (clause instanceof NOT) {
			NOT not = (NOT) clause;
			int [] i = clauseToArray(not.getOperand1(), vars);
			// if (i.length != 1) throw new IllegalArgumentException("Not in CNF")
			return Arrays.stream(i).map(v -> -v).toArray();
		} else if (clause instanceof Literal) {
			return new int[] {vars.indexOf(((Literal) clause).getElement()) + 1};
		} else if (clause instanceof TwoOperandsExpression) {
			TwoOperandsExpression twoOps = (TwoOperandsExpression) clause;
			int [] i, j, k;
			i = clauseToArray(twoOps.getOperand1(), vars);
			j = clauseToArray(twoOps.getOperand2(), vars);
			k = Arrays.copyOf(i, i.length + j.length);
			for (int l = 0; l < i.length; l++) {
				k[i.length+l] = j[l];
			}
			return k;
		}
		return null;
	}

}
