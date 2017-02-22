package de.tubs.cs.isf.reqeditor.transformation.text;

import java.io.File;

import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.epsilon.egl.EglFileGeneratingTemplateFactory;
import org.eclipse.epsilon.egl.EgxModule;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.emc.emf.tools.EmfTool;
import org.eclipse.epsilon.emc.plainxml.PlainXmlModel;
import org.eclipse.epsilon.eol.models.IModel;

import de.tubs.cs.isf.reqeditor.RequirementsEditingDomainFactory;

public class CSVTransformer {

	public static void generate(IPath path) throws Exception {
		
		// Parse 
		EglFileGeneratingTemplateFactory factory = new EglFileGeneratingTemplateFactory();
		factory.setOutputRoot(path.toOSString());
		EgxModule module = new EgxModule(factory);
	    module.parse(new File("../workspace/RequirementsEditor/de.tubs.cs.isf.reqeditor.transformation.text/model/Output2CSV.egx").getAbsoluteFile());

	    if (!module.getParseProblems().isEmpty()) {
	      System.out.println("Syntax errors found. Exiting.");
	      return;
	    }

	    // Load the XML document
//	    PlainXmlModel model = new PlainXmlModel();
//	    model.setFile(new File("model.reqs"));
//	    model.setName("L");
//	    model.load();
	    
	    RequirementsEditingDomainFactory domain = new RequirementsEditingDomainFactory();
	    
//	    EmfTool tool = new EmfTool();
//	    IModel model = tool.createModel2(domain.getModel(), "RequirementsModel", "http://www.isf.cs.tu-bs.de/reqeditor");
	    
	    EmfModel model = new EmfModel();
	    model.setName("RequirementModel");
	    model.setMetamodelUri("http://www.isf.cs.tu-bs.de/reqeditor");
	    model.setModelFile("model.reqs");
	    model.setReadOnLoad(true);
	    model.setStoredOnDisposal(true);
	    model.load();
	    
	    // Make the document visible to the EGX program
	    module.getContext().getModelRepository().addModel(model);
	    // ... and execute
	    module.execute();
		
	}

}
