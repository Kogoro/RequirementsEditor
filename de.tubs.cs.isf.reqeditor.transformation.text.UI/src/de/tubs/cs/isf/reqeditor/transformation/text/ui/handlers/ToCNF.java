package de.tubs.cs.isf.reqeditor.transformation.text.ui.handlers;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.dialogs.SaveAsDialog;
import org.eclipse.ui.handlers.HandlerUtil;
import de.tubs.cs.isf.reqeditor.transformation.text.Requirement2CNF;
import de.tubs.cs.isf.requirementseditor.RequirementsEditorPackage;
import de.tubs.cs.isf.requirementseditor.RequirementsModel;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;

/**
 * Handler for M2CSV, will call CreateCSV.java.
 * @see org.eclipse.core.commands.IHandler
 * @see org.eclipse.core.commands.AbstractHandler
 */
public class ToCNF extends AbstractHandler {

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
//				System.out.println(""+file.getLocationURI()+"\n"+file.getRawLocationURI());
//				Resource r = rs.getResource(URI.createFileURI((file.getRawLocationURI()).toString()), true);
				Resource r = rs.getResource(URI.createFileURI((file.getLocation()).toString()), true);
				
				RequirementsModel model = (RequirementsModel) r.getContents().get(0);
				
				CharSequence cnf = Requirement2CNF.convertToCNF(model);
				
				org.eclipse.ui.dialogs.SaveAsDialog dialog = new SaveAsDialog(window.getShell());
				dialog.setTitle("To DIMACS CNF format");
				dialog.setBlockOnOpen(true);
				dialog.open();
				
				IPath path = dialog.getResult();
				if (path != null) {
					IFile out = ResourcesPlugin.getWorkspace().getRoot().getFile(path);
					try {
						InputStream cnfStream = new ByteArrayInputStream(cnf.toString().getBytes());
						if (out.exists()) {
						out.setContents(cnfStream, 0, null);
						} else {
							out.create(cnfStream, false, null);
						}
					} catch (CoreException e) {
						e.printStackTrace();
					}
				}
				 
				
				//org.eclipse.ui.file.saveAs
				
			}
		}
		return null;
	}
}
