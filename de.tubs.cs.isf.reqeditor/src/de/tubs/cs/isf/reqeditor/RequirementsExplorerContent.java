package de.tubs.cs.isf.reqeditor;

import org.eclipse.jface.viewers.ITreeContentProvider;

public class RequirementsExplorerContent implements ITreeContentProvider {

	@Override
	public Object[] getElements(Object inputElement) {
		return new String[] {"Test", "Test 2"};
	}

	@Override
	public Object[] getChildren(Object parentElement) {
		return new String[] {"Test", "Test 2"};
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
