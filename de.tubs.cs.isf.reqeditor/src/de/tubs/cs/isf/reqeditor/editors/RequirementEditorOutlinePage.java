package de.tubs.cs.isf.reqeditor.editors;

import java.util.Arrays;

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITypedRegion;
import org.eclipse.jface.viewers.IContentProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.texteditor.IDocumentProvider;
import org.eclipse.ui.views.contentoutline.ContentOutlinePage;

public class RequirementEditorOutlinePage extends ContentOutlinePage {
	
	private Object input;
	private IDocumentProvider documentProvider;
	private RequirementsTableEditor requirementsTableEditor;

	public RequirementEditorOutlinePage(IDocumentProvider documentProvider,
			RequirementsTableEditor requirementsTableEditor) {
		this.documentProvider = documentProvider;
		this.requirementsTableEditor = requirementsTableEditor;
	}
	
	void setInput(Object input) {
		this.input = input;
	}

	@Override
	public void createControl(Composite parent) {
		super.createControl(parent);
		TreeViewer viewer = getTreeViewer();
		viewer.setContentProvider(new XMLContentProvider());
		// TODO replace Label Provider
		viewer.setLabelProvider(new LabelProvider());
		viewer.addSelectionChangedListener(this);
		if (input != null) {
			viewer.setInput(input);
		}
	}

	private class XMLContentProvider implements ITreeContentProvider {

		@Override
		public Object[] getElements(Object inputElement) {
			// TODO Auto-generated method stub
			System.out.println("getElements "+ inputElement);
			IDocument document = documentProvider.getDocument(inputElement);
			if (document != null) {
				try {
					ITypedRegion[] partitions = document.computePartitioning(0, document.getLength());
					String[] elements = new String[partitions.length];
					for (int i = 0; i< partitions.length; i++) {
						elements[i] = document.get(partitions[i].getOffset(), partitions[i].getLength());
					}
					return elements;
				} catch (BadLocationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return null;
		}

		@Override
		public Object[] getChildren(Object parentElement) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Object getParent(Object element) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean hasChildren(Object element) {
			// TODO Auto-generated method stub
			return false;
		}
		
	}
}
