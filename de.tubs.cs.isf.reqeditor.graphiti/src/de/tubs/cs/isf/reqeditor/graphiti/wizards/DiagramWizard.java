package de.tubs.cs.isf.reqeditor.graphiti.wizards;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramLink;
import org.eclipse.graphiti.mm.pictograms.PictogramsFactory;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;

import de.tubs.cs.isf.reqeditor.RequirementsEditingDomainFactory;
import de.tubs.cs.isf.requirementseditor.RequirementsEditorFactory;
import de.tubs.cs.isf.requirementseditor.RequirementsModel;
import de.tubs.cs.isf.requirementseditor.impl.RequirementsEditorFactoryImpl;

public class DiagramWizard extends BasicNewResourceWizard {

	public static final String ID = "de.tubs.cs.isf.reqeditor.graphiti.wizard.model";
	private WizardNewFileCreationPage mainPage;

	/**
	 * Creates a wizard for creating a new file resource in the workspace.
	 */
	public DiagramWizard() {
		super();
	}

	/*
	 * (non-Javadoc) Method declared on IWizard.
	 */
	public void addPages() {
		super.addPages();
		mainPage = new WizardNewFileCreationPage("newFilePage1", getSelection()) {
			@Override
			protected boolean validatePage() {
				boolean parentIsValid = super.validatePage();
				if (!parentIsValid)
					return parentIsValid;
				String projectFieldContents = super.getFileName();
				if (projectFieldContents.contains(" ")) {
					setErrorMessage("The file name must not contain spaces.");
					return false;
				}
				return true;
			}

		};

	mainPage.setTitle("Create a new Diagram");
	mainPage.setFileExtension("diagram");
	mainPage.setDescription("A diagram shows the structure of a requirement model.");
	mainPage.setFileName("model.diagram");

	addPage(mainPage);
	}

	/*
	 * (non-Javadoc) Method declared on IWorkbenchWizard.
	 */
	public void init(IWorkbench workbench, IStructuredSelection currentSelection) {
		super.init(workbench, currentSelection);
		setWindowTitle("Create new Requirement Model");
		setNeedsProgressMonitor(true);
	}

	/*
	 * (non-Javadoc) Method declared on IWizard.
	 */
	public boolean performFinish() {
		IFile file = mainPage.createNewFile();
		
		RequirementsEditingDomainFactory domain = new RequirementsEditingDomainFactory();
		Resource diagramFile = domain.getResourceSet().getResource(URI.createFileURI(file.getLocation().toOSString()), true);
		RequirementsModel oldModel = domain.getModel();
		RequirementsModel model;
		if (oldModel == null) {
			model = RequirementsEditorFactory.eINSTANCE.createRequirementsModel();
			model.setName("Default");
			model.setCreator("Tester");
			domain.setModel(model);
			domain.saveModel();
		} else {
			model = oldModel;
		}

		// create diagram
		Diagram diagram = Graphiti.getPeCreateService().createDiagram("de.tubs.cs.isf.reqeditor.graphiti.diagramType",
				"Model", true);

		// link diagram to network
		PictogramLink link = PictogramsFactory.eINSTANCE.createPictogramLink();
		link.getBusinessObjects().add(model);
		diagram.setLink(link);
		
		diagramFile.getContents().add(diagram);
		try {
			diagramFile.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return true;
	}

}