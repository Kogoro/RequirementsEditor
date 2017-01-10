package de.tubs.cs.isf.requirementseditor.graphiti;

import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;

public class DiagramTypeProvider extends AbstractDiagramTypeProvider implements IDiagramTypeProvider {

	public DiagramTypeProvider() {
		super();
		setFeatureProvider(new RequirementsEditorFeatureProvider(this));
	}

}
