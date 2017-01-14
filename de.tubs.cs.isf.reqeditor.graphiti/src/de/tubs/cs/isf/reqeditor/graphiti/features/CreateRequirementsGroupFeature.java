package de.tubs.cs.isf.reqeditor.graphiti.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;

import de.tubs.cs.isf.requirementseditor.RequirementsEditorFactory;
import de.tubs.cs.isf.requirementseditor.RequirementsGroup;
import de.tubs.cs.isf.requirementseditor.RequirementsModel;

public class CreateRequirementsGroupFeature extends AbstractCreateFeature {

	public CreateRequirementsGroupFeature(IFeatureProvider fp) {
		super(fp, "Group", "Create group");
	}

	@Override
	public boolean canCreate(ICreateContext context) {
		return context.getTargetContainer() instanceof Diagram;
	}

	@Override
	public Object[] create(ICreateContext context) {
		RequirementsGroup requirementsGroup = RequirementsEditorFactory.eINSTANCE.createRequirementsGroup();
		requirementsGroup.setName("NewRequirementsGroup");
		
		//TODO: Add to model
		
		addGraphicalRepresentation(context, requirementsGroup);
		
		return new Object[] {requirementsGroup};
	}

}
