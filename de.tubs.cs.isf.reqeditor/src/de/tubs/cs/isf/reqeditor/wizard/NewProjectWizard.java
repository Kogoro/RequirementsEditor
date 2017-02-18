package de.tubs.cs.isf.reqeditor.wizard;

import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;

import de.tubs.cs.isf.reqeditor.ReqEditorPlugin;

import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;

public class NewProjectWizard extends BasicNewProjectResourceWizard {

	protected WizardNewProjectCreationPage page;

	@Override
	public void addPages() {
		setWindowTitle("New Requirements Project");

		page = new WizardNewProjectCreationPage("New Requirements Project");
		page.setTitle("New Requirements Project");
		page.setDescription("Creates a new requirements project");
		page.setInitialProjectName("MyRequirementProject");

		addPage(page);
	}

	@Override
	public boolean canFinish() {
		if (page.isPageComplete()) {
			return true;
		}
		return false;
	}

	public boolean performFinish() {
		if (!page.isPageComplete()) {
			return false;
		}

		// TODO: Create Project folders and files here

		return true;
	}
}
