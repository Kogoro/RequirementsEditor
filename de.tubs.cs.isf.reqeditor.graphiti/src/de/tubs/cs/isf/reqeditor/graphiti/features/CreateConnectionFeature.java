package de.tubs.cs.isf.reqeditor.graphiti.features;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateConnectionContext;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.features.impl.AbstractCreateConnectionFeature;
import org.eclipse.graphiti.mm.Property;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramLink;

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
			AddConnectionContext addContext = new AddConnectionContext(context.getSourceAnchor(), context.getTargetAnchor());
			addContext.setNewObject(new AddConnectionFeature(getFeatureProvider()));
			newConnection = (Connection) getFeatureProvider().addIfPossible(addContext);
			addContext.setTargetConnection(newConnection);
		}
		
		return newConnection;
	}

	@Override
	public boolean canStartConnection(ICreateConnectionContext context) {
		Object obj = getBusinessObjectForPictogramElement(context.getSourceAnchor().getParent());
		if (obj instanceof RequirementsModel || obj instanceof RequirementsGroup) return true;
		return false;
	}

}
