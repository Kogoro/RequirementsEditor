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

import de.tubs.cs.isf.requirementseditor.RequirementsModel;

public class AddRequirementsModelFeature extends AbstractAddFeature {

	private static final IColorConstant REQUIREMENTS_MODEL_TEXT_FOREGROUND = IColorConstant.BLACK;
	private static final IColorConstant REQUIREMENTS_MODEL_FOREGROUND = IColorConstant.RED;
	private static final IColorConstant REQUIREMENTS_MODEL_BACKGROUND = IColorConstant.LIGHT_LIGHT_GRAY;
	
	public AddRequirementsModelFeature(IFeatureProvider fp) {
		super(fp);
	}
	
	@Override
	public boolean canAdd(IAddContext context) {
		return context.getNewObject() instanceof RequirementsModel
				&& context.getTargetContainer() instanceof Diagram;
	}

	@Override
	public PictogramElement add(IAddContext context) {
		RequirementsModel requirementsModel = (RequirementsModel) context.getNewObject();
		Diagram targetDiagram = (Diagram) context.getTargetContainer();
		
		IPeCreateService peCreateService = Graphiti.getPeCreateService();
		ContainerShape containerShape = peCreateService.createContainerShape(targetDiagram, true);
		
		int width = 100;
		int height = 100;
		IGaService gaService = Graphiti.getGaService();
		RoundedRectangle roundedRectangle;
		
		//Create and set graphics algorithm
		roundedRectangle = gaService.createRoundedRectangle(containerShape, 5, 5);
		roundedRectangle.setForeground(manageColor(REQUIREMENTS_MODEL_FOREGROUND));
		roundedRectangle.setBackground(manageColor(REQUIREMENTS_MODEL_BACKGROUND));
		roundedRectangle.setLineWidth(2);
		gaService.setLocationAndSize(roundedRectangle, context.getX(), context.getY(), width, height);
		
		link(containerShape, requirementsModel);
		
		//Shape Text Name
		Shape shape_name = peCreateService.createShape(containerShape, false);
		Text text_name = gaService.createText(shape_name, requirementsModel.getName());
		text_name.setForeground(manageColor(REQUIREMENTS_MODEL_TEXT_FOREGROUND));
		//text_name.setHorizontalAlignment(Orientation.ALIGNMENT_TOP);
		text_name.setFont(gaService.manageDefaultFont(targetDiagram, false, true));
		gaService.setLocationAndSize(text_name, 5, 0, width, 20);
		link(shape_name, requirementsModel);
		
		//Shape Text Creator
		Shape shape_creator = peCreateService.createShape(containerShape, false);
		Text text_creator = gaService.createText(shape_creator, requirementsModel.getCreator());
		text_creator.setForeground(manageColor(REQUIREMENTS_MODEL_TEXT_FOREGROUND));
		text_creator.setHorizontalAlignment(Orientation.ALIGNMENT_LEFT);
		text_creator.setFont(gaService.manageDefaultFont(targetDiagram, false, true));
		gaService.setLocationAndSize(text_creator, 10, 20, width, 20);
		link(shape_creator, requirementsModel);
		
		//Shape Text Version
		Shape shape_version = peCreateService.createShape(containerShape, false);
		Text text_version = gaService.createText(shape_version, requirementsModel.getVersion());
		text_version.setForeground(manageColor(REQUIREMENTS_MODEL_TEXT_FOREGROUND));
		text_version.setHorizontalAlignment(Orientation.ALIGNMENT_RIGHT);
		text_version.setFont(gaService.manageDefaultFont(targetDiagram, false, true));
		gaService.setLocationAndSize(text_version, 10, 40, width, 20);
		link(shape_version, requirementsModel);
		
		if (requirementsModel.eResource() == null) {
			getDiagram().eResource().getContents().add(requirementsModel);
		}
		
		peCreateService.createChopboxAnchor(containerShape);
		
		layoutPictogramElement(containerShape);
		
		return containerShape;
	}


	
}
