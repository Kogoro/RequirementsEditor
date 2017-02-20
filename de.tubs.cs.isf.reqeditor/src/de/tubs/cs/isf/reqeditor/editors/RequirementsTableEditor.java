package de.tubs.cs.isf.reqeditor.editors;

import org.eclipse.ui.editors.text.TextEditor;

public class RequirementsTableEditor extends TextEditor {

	private ColorManager colorManager;

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

}
