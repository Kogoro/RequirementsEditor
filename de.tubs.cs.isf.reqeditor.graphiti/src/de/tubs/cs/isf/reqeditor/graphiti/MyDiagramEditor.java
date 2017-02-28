package de.tubs.cs.isf.reqeditor.graphiti;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.ui.editor.*;
import org.eclipse.swt.widgets.Composite;

public class MyDiagramEditor extends DiagramEditor {

	public static final String DIAGRAM_EDITOR_ID = "test.graphiti.nonemf.diagram.NonEmfDiagramEditor";
	
	public MyDiagramEditor(){
		super();
	}
	
	@Override
	public String getContributorId() {
		return "de.tubs.cs.isf.reqeditor.graphiti.propertyContributor";
	}
}
