package de.tubs.cs.isf.reqeditor.graphiti;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.ui.editor.*;
import org.eclipse.swt.widgets.Composite;

public class MyDiagramEditor extends DiagramEditor {

	public static final String DIAGRAM_EDITOR_ID = "test.graphiti.nonemf.diagram.NonEmfDiagramEditor";

	MyDomainModelChangeListener nonEmfDomainModelListener;
	private TransactionalEditingDomain transactionalEditingDomain;
	
	public MyDiagramEditor(){
		super();
	}
	
	public MyDiagramEditor(TransactionalEditingDomain transactionalEditingDomain) {
		super();
		this.transactionalEditingDomain = transactionalEditingDomain;		
	}

	protected void registerBOListener() {
		nonEmfDomainModelListener = new MyDomainModelChangeListener(this);
		
		TransactionalEditingDomain eDomain = getEditingDomain();
		eDomain.addResourceSetListener(nonEmfDomainModelListener);
	}

	@Override
	public TransactionalEditingDomain getEditingDomain() {
		TransactionalEditingDomain result = super.getEditingDomain(); 
		if(result == null)
			result = transactionalEditingDomain;
		
		return result;
	}
	
	@Override
	public void doSave(IProgressMonitor monitor) {
		super.doSave(monitor);
		
		IDiagramTypeProvider diagramTypeProvider = this.getDiagramTypeProvider();
		if(diagramTypeProvider instanceof DiagramTypeProvider) {
//			DiagramTypeProvider dtp = (DiagramTypeProvider) diagramTypeProvider;
//			
//			DiagramFeatureProvider dfp = (DiagramFeatureProvider) dtp.getFeatureProvider();
//			POJOIndependenceSolver pojoIndependenceSolver = dfp.getPojoIndependenceSolver();
//			
//			DiagramEditorInput editorInput = (DiagramEditorInput) this.getEditorInput();
//			
//			RepositoryUtils.persistPOJOObjects(editorInput, pojoIndependenceSolver);	
		}
		
		
	}

	@Override
	public void createPartControl(Composite parent) {
		super.createPartControl(parent);
//		
//		this.getGraphicalViewer().addDropTargetListener(new NonEmfTransferDropTargetListener(this));
//		
//		getRefreshBehavior().refresh();
	}
	
	
	
}
