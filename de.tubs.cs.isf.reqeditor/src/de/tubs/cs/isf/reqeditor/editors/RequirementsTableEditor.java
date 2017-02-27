package de.tubs.cs.isf.reqeditor.editors;

import org.eclipse.ui.editors.text.TextEditor;
import org.eclipse.ui.views.contentoutline.IContentOutlinePage;

public class RequirementsTableEditor extends TextEditor {

	private ColorManager colorManager;
	private RequirementEditorOutlinePage outlinePage;

	public RequirementsTableEditor() {
		super();
		colorManager = new ColorManager();
		setSourceViewerConfiguration(new XMLConfiguration(colorManager));
		setDocumentProvider(new XMLDocumentProvider());
	}
	@Override
	public void dispose() {
		colorManager.dispose();
		super.dispose();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public <T> T getAdapter(Class<T> adapter) {
		if (IContentOutlinePage.class.equals(adapter)) {
			if (outlinePage == null) {
	            outlinePage = new RequirementEditorOutlinePage(
	                           getDocumentProvider(), this);
	            outlinePage.setInput(getEditorInput());
	         }
	         return (T) outlinePage;
		}
		return super.getAdapter(adapter);
	}
}
