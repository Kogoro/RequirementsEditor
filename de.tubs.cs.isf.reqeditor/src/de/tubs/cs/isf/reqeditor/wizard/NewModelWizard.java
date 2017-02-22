package de.tubs.cs.isf.reqeditor.wizard;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.internal.dialogs.DialogUtil;

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

			@Override
			protected InputStream getInitialContents() {
				String defaultContent = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><RequirementsEditor:RequirementsModel xmi:version=\"2.0\" xmlns:xmi=\"http://www.omg.org/XMI\" xmlns:RequirementsEditor=\"http://www.isf.cs.tu-bs.de/reqeditor\"/>";
				return new ByteArrayInputStream(defaultContent.getBytes(StandardCharsets.UTF_8));
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
		IFile file = mainPage.createNewFile();
		
		if (file == null) {
			return false;
		}

		selectAndReveal(file);

		// Open editor on new file.
		IWorkbenchWindow dw = getWorkbench().getActiveWorkbenchWindow();
		try {
			if (dw != null) {
				IWorkbenchPage page = dw.getActivePage();
				if (page != null) {
					IDE.openEditor(page, file, true);
				}
			}
		} catch (PartInitException e) {
			DialogUtil.openError(dw.getShell(),
					"File could not be created:", e.getMessage(),
					e);
		}

		return true;
	}


}
