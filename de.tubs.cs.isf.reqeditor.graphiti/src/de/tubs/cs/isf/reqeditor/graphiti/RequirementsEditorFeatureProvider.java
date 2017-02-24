package de.tubs.cs.isf.reqeditor.graphiti;

import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IUpdateFeature;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.ui.features.DefaultFeatureProvider;

import de.tubs.cs.isf.reqeditor.graphiti.features.AddConnectionFeature;
import de.tubs.cs.isf.reqeditor.graphiti.features.AddRequirementFeature;
import de.tubs.cs.isf.reqeditor.graphiti.features.AddRequirementsGroupFeature;
import de.tubs.cs.isf.reqeditor.graphiti.features.AddRequirementsModelFeature;
import de.tubs.cs.isf.reqeditor.graphiti.features.CreateConnectionFeature;
import de.tubs.cs.isf.reqeditor.graphiti.features.CreateRequirementFeature;
import de.tubs.cs.isf.reqeditor.graphiti.features.CreateRequirementsGroupFeature;
import de.tubs.cs.isf.reqeditor.graphiti.features.CreateRequirementsModelFeature;
import de.tubs.cs.isf.reqeditor.graphiti.features.RequirementsModelUpdateFeature;
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
		if (context.getNewObject() instanceof AddConnectionFeature) {
			return new AddConnectionFeature(this);
		}
		return super.getAddFeature(context);
	}

	@Override
	public ICreateFeature[] getCreateFeatures() {
		return new ICreateFeature[] {new CreateRequirementsModelFeature(this), 
				new CreateRequirementsGroupFeature(this),
				new CreateRequirementFeature(this) };
	}

	@Override
	public ICreateConnectionFeature[] getCreateConnectionFeatures() {
		return new ICreateConnectionFeature[] {new CreateConnectionFeature(this)};
	}

	@Override
	public IUpdateFeature getUpdateFeature(IUpdateContext context) {
		 PictogramElement pictogramElement = context.getPictogramElement();
		   if (pictogramElement instanceof ContainerShape) {
		       Object bo = getBusinessObjectForPictogramElement(pictogramElement);
		       if (bo instanceof RequirementsModel) {
		           return new RequirementsModelUpdateFeature(this);
		       }
		   }
		   return super.getUpdateFeature(context);
	}
	
}
