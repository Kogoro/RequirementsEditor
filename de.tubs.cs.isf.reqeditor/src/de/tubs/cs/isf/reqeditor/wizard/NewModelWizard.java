package de.tubs.cs.isf.reqeditor.wizard;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import de.tubs.cs.isf.reqeditor.RequirementsEditingDomainFactory;
import org.eclipse.ui.IWorkbench;

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
		RequirementsEditingDomainFactory domain = new RequirementsEditingDomainFactory();
		
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IPath path = workspace.getRoot().getRawLocation().append(mainPage.getContainerFullPath()).append(mainPage.getFileName());
		IFile file = workspace.getRoot().getFile(path);

		domain.createResource(file.getFullPath().toString());
		
		return true;
	}


}
