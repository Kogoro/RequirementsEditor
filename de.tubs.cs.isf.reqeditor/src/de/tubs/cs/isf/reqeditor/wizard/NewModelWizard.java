package de.tubs.cs.isf.reqeditor.wizard;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramLink;
import org.eclipse.graphiti.mm.pictograms.PictogramsFactory;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.internal.dialogs.DialogUtil;

import de.tubs.cs.isf.reqeditor.RequirementsEditingDomainFactory;
import de.tubs.cs.isf.requirementseditor.RequirementsEditorFactory;
import de.tubs.cs.isf.requirementseditor.RequirementsEditorPackage;
import de.tubs.cs.isf.requirementseditor.RequirementsModel;

import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;

public class NewModelWizard extends BasicNewResourceWizard {

	public static final String ID = "de.tubs.cs.isf.reqeditor.wizard.model";
	private WizardNewFileCreationPage mainPage;

	/**
	 * Creates a wizard for creating a new file resource in the workspace.
	 */
	public NewModelWizard() {
		super();
	}

	/*
	 * (non-Javadoc) Method declared on IWizard.
	 */
	public void addPages() {
		super.addPages();
		mainPage = new WizardNewFileCreationPage("newFilePage1", getSelection()){
			@Override
			protected boolean validatePage() {
				boolean parentIsValid =  super.validatePage();
				if(!parentIsValid) return parentIsValid;
				 String projectFieldContents = super.getFileName();
					if (projectFieldContents.contains(" ")) {
						setErrorMessage("The file name must not contain spaces.");
						return false;
					}
				return true;
			}
		};
		
		mainPage.setTitle("Create a new Requirement Model");
		mainPage.setFileExtension("reqs");
		mainPage.setDescription("Requirement Models store informations about requirements in a project.");
		mainPage.setFileName("model.reqs");
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
		// create diagram
		Diagram diagram = Graphiti.getPeCreateService().createDiagram("de.tubs.cs.isf.reqeditor.graphiti.diagramType", "Requirement Model", true);

		RequirementsEditingDomainFactory domain = new RequirementsEditingDomainFactory();
		
		//get object which represents the workspace  
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IPath path = workspace.getRoot().getRawLocation().append(mainPage.getContainerFullPath()).append(mainPage.getFileName());
		//get location of workspace (java.io.File)  
		IFile file = workspace.getRoot().getFile(path);

		domain.createResource(file.getFullPath().toString());
		
		// link diagram to network
		PictogramLink link = PictogramsFactory.eINSTANCE.createPictogramLink();
		link.getBusinessObjects().add(domain.getModel());
		diagram.setLink(link);
		
		return true;
	}


}
