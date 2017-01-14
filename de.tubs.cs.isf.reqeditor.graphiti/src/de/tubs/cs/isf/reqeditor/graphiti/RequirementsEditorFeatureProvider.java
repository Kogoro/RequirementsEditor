package de.tubs.cs.isf.reqeditor.graphiti;

import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.ui.features.DefaultFeatureProvider;

import de.tubs.cs.isf.reqeditor.graphiti.features.AddRequirementFeature;
import de.tubs.cs.isf.reqeditor.graphiti.features.AddRequirementsGroupFeature;
import de.tubs.cs.isf.reqeditor.graphiti.features.AddRequirementsModelFeature;
import de.tubs.cs.isf.reqeditor.graphiti.features.CreateRequirementFeature;
import de.tubs.cs.isf.reqeditor.graphiti.features.CreateRequirementsGroupFeature;
import de.tubs.cs.isf.reqeditor.graphiti.features.CreateRequirementsModelFeature;
import de.tubs.cs.isf.requirementseditor.Requirement;
import de.tubs.cs.isf.requirementseditor.RequirementsGroup;
import de.tubs.cs.isf.requirementseditor.RequirementsModel;

public class RequirementsEditorFeatureProvider extends DefaultFeatureProvider {

	public RequirementsEditorFeatureProvider(IDiagramTypeProvider dtp) {
		super(dtp);
		
	}
	
	@Override
	public IAddFeature getAddFeature(IAddContext context) {
		if (context.getNewObject() instanceof Requirement) {
			return new AddRequirementFeature(this);
		}
		if (context.getNewObject() instanceof RequirementsModel) {
			return new AddRequirementsModelFeature(this);
		}
		if (context.getNewObject()instanceof RequirementsGroup) {
			return new AddRequirementsGroupFeature(this);
		} 
		return super.getAddFeature(context);
	}

	@Override
	public ICreateFeature[] getCreateFeatures() {
		return new ICreateFeature[] {new CreateRequirementsModelFeature(this), 
				new CreateRequirementsGroupFeature(this),
				new CreateRequirementFeature(this) };
	}
	
}
