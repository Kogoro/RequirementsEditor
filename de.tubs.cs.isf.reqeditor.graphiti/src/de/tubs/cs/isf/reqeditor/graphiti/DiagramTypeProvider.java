package de.tubs.cs.isf.reqeditor.graphiti;

import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.platform.IDiagramBehavior;

public class DiagramTypeProvider extends AbstractDiagramTypeProvider implements IDiagramTypeProvider {

	public DiagramTypeProvider() {
		super();
		setFeatureProvider(new RequirementsEditorFeatureProvider(this));
	}

	@Override
	public boolean isAutoUpdateAtRuntime() {
		return true;
	}

	@Override
	public boolean isAutoUpdateAtRuntimeWhenEditorIsSaved() {
		return true;
	}

	@Override
	public boolean isAutoUpdateAtStartup() {
		return true;
	}

	@Override
	public boolean isAutoUpdateAtReset() {
		return true;
	}

	

}
