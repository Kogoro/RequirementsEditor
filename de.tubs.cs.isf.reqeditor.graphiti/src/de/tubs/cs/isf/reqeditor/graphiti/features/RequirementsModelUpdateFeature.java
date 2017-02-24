package de.tubs.cs.isf.reqeditor.graphiti.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.impl.AbstractUpdateFeature;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;

import de.tubs.cs.isf.requirementseditor.RequirementsModel;

public class RequirementsModelUpdateFeature extends AbstractUpdateFeature {

	public RequirementsModelUpdateFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canUpdate(IUpdateContext context) {
		Object bo = getBusinessObjectForPictogramElement(context.getPictogramElement());
	        return (bo instanceof RequirementsModel);
	}

	@Override
	public IReason updateNeeded(IUpdateContext context) {
		// TODO Auto-generated method stub
		return Reason.createTrueReason();
	}

	@Override
	public boolean update(IUpdateContext context) {
		String name = null;
		String createdBy = null;
		String version = null;
        PictogramElement pictogramElement = context.getPictogramElement();
        Object bo = getBusinessObjectForPictogramElement(pictogramElement);
        if (bo instanceof RequirementsModel) {
        	RequirementsModel requirementsModel = (RequirementsModel) bo;
            name = requirementsModel.getName();
            createdBy = requirementsModel.getCreator();
            version = requirementsModel.getVersion();
        }
        
        // Set name in pictogram model
        if (pictogramElement instanceof ContainerShape) {
            ContainerShape cs = (ContainerShape) pictogramElement;
            for (Shape shape : cs.getChildren()) {
                if (shape.getGraphicsAlgorithm() instanceof Text) {
                    Text text = (Text) shape.getGraphicsAlgorithm();
                    text.setValue(name);
                    return true;
                }
            }
        }
        
		return false;
	}

}
