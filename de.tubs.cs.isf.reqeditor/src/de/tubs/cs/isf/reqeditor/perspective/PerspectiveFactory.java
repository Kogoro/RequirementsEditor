package de.tubs.cs.isf.reqeditor.perspective;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

import de.tubs.cs.isf.reqeditor.wizard.NewModelWizard;

public class PerspectiveFactory implements IPerspectiveFactory {

	@Override
	public void createInitialLayout(IPageLayout layout) {
		String editorArea = layout.getEditorArea();
		
		layout.addNewWizardShortcut(NewModelWizard.ID);
		
		IFolderLayout left = layout.createFolder("LEFT", IPageLayout.LEFT, (float) 0.23, editorArea);
		IFolderLayout down = layout.createFolder("DOWN", IPageLayout.BOTTOM, (float) 0.80, editorArea);
		IFolderLayout right = layout.createFolder("RIGHT", IPageLayout.RIGHT, (float) 0.75, editorArea);
		
		left.addView(IPageLayout.ID_PROJECT_EXPLORER);
		
		down.addView(IPageLayout.ID_PROP_SHEET);
		down.addView(IPageLayout.ID_PROBLEM_VIEW);
		
		right.addView(IPageLayout.ID_OUTLINE);
		right.addView(IPageLayout.ID_TASK_LIST);
		right.addView(IPageLayout.ID_BOOKMARKS);
		right.addView("org.eclipse.ui.cheatsheets.views.CheatSheetView");
	}

}
