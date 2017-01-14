package de.tubs.cs.isf.reqeditor.graphiti.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;

import de.tubs.cs.isf.requirementseditor.RequirementsEditorFactory;
import de.tubs.cs.isf.requirementseditor.RequirementsModel;

public class CreateRequirementsModelFeature extends AbstractCreateFeature {

	public CreateRequirementsModelFeature(IFeatureProvider fp) {
		super(fp, "Model", "Create Model");
	}

	@Override
	public boolean canCreate(ICreateContext context) {
		return context.getTargetContainer() instanceof Diagram;
	}

	@Override
	public Object[] create(ICreateContext context) {
		RequirementsModel requirementsModel = RequirementsEditorFactory.eINSTANCE.createRequirementsModel();
		requirementsModel.setName("NewRequirementsModel");
		
		//TODO: Add to model
		
		addGraphicalRepresentation(context, requirementsModel);
		
		return new Object[] {requirementsModel};
	}

}
