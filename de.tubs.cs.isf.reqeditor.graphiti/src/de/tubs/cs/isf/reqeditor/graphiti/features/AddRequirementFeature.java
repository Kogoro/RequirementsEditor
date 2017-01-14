package de.tubs.cs.isf.reqeditor.graphiti.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddFeature;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;
import org.eclipse.graphiti.util.IColorConstant;

import de.tubs.cs.isf.requirementseditor.Requirement;

public class AddRequirementFeature extends AbstractAddFeature {

	private static final IColorConstant REQUIREMENT_TEXT_FOREGROUND = IColorConstant.BLACK;
	private static final IColorConstant REQUIREMENT_FOREGROUND = IColorConstant.BLUE;
	private static final IColorConstant REQUIREMENT_BACKGROUND = IColorConstant.LIGHT_LIGHT_GRAY;
	
	public AddRequirementFeature(IFeatureProvider fp) {
		super(fp);
	}
	
	@Override
	public boolean canAdd(IAddContext context) {
		return context.getNewObject() instanceof Requirement
				&& context.getTargetContainer() instanceof Diagram;
	}

	@Override
	public PictogramElement add(IAddContext context) {
		Requirement requirement = (Requirement) context.getNewObject();
		Diagram targetDiagram = (Diagram) context.getTargetContainer();
		
		IPeCreateService peCreateService = Graphiti.getPeCreateService();
		ContainerShape containerShape = peCreateService.createContainerShape(targetDiagram, true);
		
		int width = 100;
		int height = 60;
		IGaService gaService = Graphiti.getGaService();
		RoundedRectangle roundedRectangle;
		
		//Create and set graphics algorithm
		roundedRectangle = gaService.createRoundedRectangle(containerShape, 5, 5);
		roundedRectangle.setForeground(manageColor(REQUIREMENT_FOREGROUND));
		roundedRectangle.setBackground(manageColor(REQUIREMENT_BACKGROUND));
		roundedRectangle.setLineWidth(2);
		gaService.setLocationAndSize(roundedRectangle, context.getX(), context.getY(), width, height);
		
		link(containerShape, requirement);
		
		//Shape Text Name
		Shape shape_name = peCreateService.createShape(containerShape, false);
		Text text_name = gaService.createText(shape_name, requirement.getName());
		text_name.setForeground(manageColor(REQUIREMENT_TEXT_FOREGROUND));
		//text_name.setHorizontalAlignment(Orientation.ALIGNMENT_TOP);
		text_name.setFont(gaService.manageDefaultFont(targetDiagram, false, true));
		gaService.setLocationAndSize(text_name, 5, 0, width, 20);
		link(shape_name, requirement);
		
		//Shape Text Type
		Shape shape_type = peCreateService.createShape(containerShape, false);
		Text text_type = gaService.createText(shape_type, requirement.getType().getName());
		text_type.setForeground(manageColor(REQUIREMENT_TEXT_FOREGROUND));
		//text_type.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
		text_type.setFont(gaService.manageDefaultFont(targetDiagram, false, true));
		gaService.setLocationAndSize(text_type, 10, 20, width, 20);
		link(shape_type, requirement);
		
		//Shape Text Priority
		Shape shape_priority = peCreateService.createShape(containerShape, false);
		Text text_priority = gaService.createText(shape_priority, requirement.getPriority().getName());
		text_priority.setForeground(manageColor(REQUIREMENT_TEXT_FOREGROUND));
		//text_priority.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
		text_priority.setFont(gaService.manageDefaultFont(targetDiagram, false, true));
		gaService.setLocationAndSize(text_priority, 10, 40, width, 20);
		link(shape_priority, requirement);
		
		if (requirement.eResource() == null) {
			//TODO: Add to model
		}
		
		peCreateService.createChopboxAnchor(containerShape);
		
		layoutPictogramElement(containerShape);
		
		return containerShape;
	}


	
}
