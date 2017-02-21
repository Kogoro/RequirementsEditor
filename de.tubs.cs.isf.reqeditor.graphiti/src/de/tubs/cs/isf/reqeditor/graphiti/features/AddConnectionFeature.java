package de.tubs.cs.isf.reqeditor.graphiti.features;

import java.awt.Color;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddConnectionContext;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.features.impl.AbstractAddFeature;
import org.eclipse.graphiti.mm.algorithms.Ellipse;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.algorithms.styles.LineStyle;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.IColorConstant;

public class AddConnectionFeature extends AbstractAddFeature {

	public AddConnectionFeature(IFeatureProvider fp) {
		super(fp);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canAdd(IAddContext context) {
		AddConnectionContext conContext = (AddConnectionContext) context;
		for (Connection c : conContext.getSourceAnchor().getOutgoingConnections()) {
			if (c.getStart().equals(conContext.getSourceAnchor()) && c.getEnd().equals(conContext.getTargetAnchor())) return false;
			if (c.getStart().equals(conContext.getTargetAnchor()) && c.getEnd().equals(conContext.getSourceAnchor())) return false;
		}
		for (Connection c : conContext.getSourceAnchor().getIncomingConnections()) {
			if (c.getStart().equals(conContext.getSourceAnchor()) && c.getEnd().equals(conContext.getTargetAnchor())) return false;
			if (c.getStart().equals(conContext.getTargetAnchor()) && c.getEnd().equals(conContext.getSourceAnchor())) return false;
		}
		return true;
	}

	@Override
	public PictogramElement add(IAddContext context) {
		IAddConnectionContext addConContext = (IAddConnectionContext) context;
		IPeCreateService peCreateService = Graphiti.getPeCreateService();

		// CONNECTION WITH POLYLINE
		Connection connection = peCreateService.createFreeFormConnection(getDiagram());
		connection.setStart(addConContext.getSourceAnchor());
		connection.setEnd(addConContext.getTargetAnchor());

		IGaService gaService = Graphiti.getGaService();

		Polyline polyline = gaService.createPolyline(connection);
		polyline.setLineWidth(2);
		polyline.setLineStyle(LineStyle.SOLID);
		polyline.setForeground(manageColor(IColorConstant.GRAY));

		// create link and wire it
		// link(connection, addedEReference);

		ConnectionDecorator cd;
		cd = peCreateService.createConnectionDecorator(connection, false, 0.0, true);
		Ellipse deco = gaService.createEllipse(cd);
		deco.setForeground(manageColor(IColorConstant.GRAY));
		deco.setFilled(true);
		deco.setLineWidth(4);
		deco.setHeight(16);
		deco.setWidth(16);
		

		// add a chopbox anchor to the connection
		peCreateService.createChopboxAnchor(connection);

		return connection;
	}

}
