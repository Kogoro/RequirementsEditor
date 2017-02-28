package de.tubs.cs.isf.reqeditor.graphiti;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TextCellEditor;

public class AttributeEditingSupport extends EditingSupport {

	public AttributeEditingSupport(ColumnViewer viewer) {
		super(viewer);
	}

	@Override
	protected CellEditor getCellEditor(Object element) {
		return new TextCellEditor(((TableViewer)getViewer()).getTable());			
	}

	@Override
	protected boolean canEdit(Object element) {
		return true;
	}

	@Override
	protected Object getValue(Object element) {
		return "";
	}

	@Override
	protected void setValue(Object element, Object value) {
		if (value != null) {
			String str = ((String) element);
			element = str.substring(0, str.indexOf(":"))+value;
			getViewer().update(element, null);
		}
		
	}

}
