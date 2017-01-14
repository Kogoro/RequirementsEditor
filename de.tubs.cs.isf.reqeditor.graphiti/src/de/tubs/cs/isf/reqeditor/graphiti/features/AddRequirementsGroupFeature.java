package de.tubs.cs.isf.reqeditor.graphiti.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddFeature;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.IColorConstant;

import de.tubs.cs.isf.requirementseditor.RequirementsGroup;
import de.tubs.cs.isf.requirementseditor.RequirementsModel;

public class AddRequirementsGroupFeature extends AbstractAddFeature {

	private static final IColorConstant REQUIREMENTS_GROUP_TEXT_FOREGROUND = IColorConstant.BLACK;
	private static final IColorConstant REQUIREMENTS_GROUP_FOREGROUND = IColorConstant.GREEN;
	private static final IColorConstant REQUIREMENTS_GROUP_BACKGROUND = IColorConstant.LIGHT_LIGHT_GRAY;
	
	public AddRequirementsGroupFeature(IFeatureProvider fp) {
		super(fp);
	}
	
	@Override
	public boolean canAdd(IAddContext context) {
		return context.getNewObject() instanceof RequirementsGroup
				&& context.getTargetContainer() instanceof Diagram;
	}

	@Override
	public PictogramElement add(IAddContext context) {
		RequirementsGroup requirementsGroup = (RequirementsGroup) context.getNewObject();
		Diagram targetDiagram = (Diagram) context.getTargetContainer();
		
		IPeCreateService peCreateService = Graphiti.getPeCreateService();
		ContainerShape containerShape = peCreateService.createContainerShape(targetDiagram, true);
		
		int width = 100;
		int height = 100;
		IGaService gaService = Graphiti.getGaService();
		RoundedRectangle roundedRectangle;
		
		//Create and set graphics algorithm
		roundedRectangle = gaService.createRoundedRectangle(containerShape, 5, 5);
		roundedRectangle.setForeground(manageColor(REQUIREMENTS_GROUP_FOREGROUND));
		roundedRectangle.setBackground(manageColor(REQUIREMENTS_GROUP_BACKGROUND));
		roundedRectangle.setLineWidth(2);
		gaService.setLocationAndSize(roundedRectangle, context.getX(), context.getY(), width, height);
		
		link(containerShape, requirementsGroup);
		
		//Shape Text Name
		Shape shape_name = peCreateService.createShape(containerShape, false);
		Text text_name = gaService.createText(shape_name, requirementsGroup.getName());
		text_name.setForeground(manageColor(REQUIREMENTS_GROUP_TEXT_FOREGROUND));
		//text_name.setHorizontalAlignment(Orientation.ALIGNMENT_TOP);
		text_name.setFont(gaService.manageDefaultFont(targetDiagram, false, true));
		gaService.setLocationAndSize(text_name, 5, 0, width, 20);
		link(shape_name, requirementsGroup);
		
		if (requirementsGroup.eResource() == null) {
			//TODO: Add to model
		}
		
		peCreateService.createChopboxAnchor(containerShape);
		
		layoutPictogramElement(containerShape);
		
		return containerShape;
	}


	
}
