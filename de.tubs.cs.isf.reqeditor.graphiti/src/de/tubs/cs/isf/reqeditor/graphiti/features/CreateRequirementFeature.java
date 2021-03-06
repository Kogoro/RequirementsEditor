package de.tubs.cs.isf.reqeditor.graphiti.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;
import org.eclipse.graphiti.features.impl.AbstractCreateFeature;
import org.eclipse.graphiti.mm.pictograms.Diagram;

import de.tubs.cs.isf.reqeditor.RequirementsEditingDomainFactory;
import de.tubs.cs.isf.requirementseditor.Requirement;
import de.tubs.cs.isf.requirementseditor.RequirementsEditorFactory;
import de.tubs.cs.isf.requirementseditor.RequirementsModel;

public class CreateRequirementFeature extends AbstractCreateFeature {

	public CreateRequirementFeature(IFeatureProvider fp) {
		super(fp, "Requirement", "Create Requirement");
	}

	@Override
	public boolean canCreate(ICreateContext context) {
		return context.getTargetContainer() instanceof Diagram;
	}

	@Override
	public Object[] create(ICreateContext context) {
		RequirementsEditingDomainFactory factory = new RequirementsEditingDomainFactory();
		
		Requirement requirement = RequirementsEditorFactory.eINSTANCE.createRequirement();
		requirement.setName("NewRequirement");
		
		factory.getModel().getElements().add(requirement);
		factory.saveModel();
		
		addGraphicalRepresentation(context, requirement);
		
		return new Object[] {requirement};
	}

}
