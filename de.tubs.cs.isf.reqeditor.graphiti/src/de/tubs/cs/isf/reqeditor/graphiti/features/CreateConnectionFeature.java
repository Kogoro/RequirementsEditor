package de.tubs.cs.isf.reqeditor.graphiti.features;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateConnectionContext;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.features.impl.AbstractCreateConnectionFeature;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;

import de.tubs.cs.isf.requirementseditor.Requirement;
import de.tubs.cs.isf.requirementseditor.RequirementModelElement;
import de.tubs.cs.isf.requirementseditor.RequirementsGroup;
import de.tubs.cs.isf.requirementseditor.RequirementsModel;

public class CreateConnectionFeature extends AbstractCreateConnectionFeature {

	public CreateConnectionFeature(IFeatureProvider fp) {
		super(fp, "Connection", "Create Connection");
	}

	@Override
	public boolean canCreate(ICreateConnectionContext context) {
		Anchor source = context.getSourceAnchor();
		Anchor target = context.getTargetAnchor();
		if (source != null && target != null && source != target) {
			return true;
		}
		return false;
	}

	@Override
	public Connection create(ICreateConnectionContext context) {
		Connection newConnection = null;

		if (context.getSourceAnchor() != null && context.getTargetAnchor() != null) {
			
			EObject sourceObject = (EObject) getBusinessObjectForPictogramElement(context.getSourceAnchor().getParent());
			EObject targetObject = (EObject) getBusinessObjectForPictogramElement(context.getTargetAnchor().getParent());
			
			if (sourceObject instanceof RequirementsModel) {
				if (targetObject instanceof RequirementsGroup)
					((RequirementsModel) sourceObject).getElements().add((RequirementsGroup)targetObject);
				else
					((RequirementsModel) sourceObject).getElements().add((Requirement)targetObject);
			} else if (sourceObject instanceof RequirementsGroup) {
				if (targetObject instanceof RequirementsGroup)
					((RequirementsGroup) sourceObject).getElements().add((RequirementsGroup)targetObject);
				else
					((RequirementsGroup) sourceObject).getElements().add((Requirement)targetObject);
			}
			
			
			AddConnectionContext addContext = new AddConnectionContext(context.getSourceAnchor(),
					context.getTargetAnchor());
			addContext.setNewObject(new AddConnectionFeature(getFeatureProvider()));
			newConnection = (Connection) getFeatureProvider().addIfPossible(addContext);
			addContext.setTargetConnection(newConnection);
		}

		return newConnection;
	}

	@Override
	public boolean canStartConnection(ICreateConnectionContext context) {
		if (context.getSourceAnchor() != null && context.getSourceAnchor().getParent() != null) {
			Object obj = getBusinessObjectForPictogramElement(context.getSourceAnchor().getParent());
			if (obj != null)
				if (obj instanceof RequirementsModel || obj instanceof RequirementsGroup)
					return true;
		}
		return false;
	}

}
