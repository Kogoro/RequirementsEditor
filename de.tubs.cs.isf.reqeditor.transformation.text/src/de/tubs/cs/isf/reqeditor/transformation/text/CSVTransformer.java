package de.tubs.cs.isf.reqeditor.transformation.text;

import java.io.File;
import org.eclipse.core.runtime.IPath;
import org.eclipse.epsilon.egl.EglFileGeneratingTemplateFactory;
import org.eclipse.epsilon.egl.EgxModule;
import org.eclipse.epsilon.emc.emf.EmfModel;

public class CSVTransformer {

	public static void generate(IPath path) throws Exception {
		// Get path of this class, important for locating Epsilon templates
		String transformerLocation = CSVTransformer.class.getProtectionDomain().getCodeSource().
				getLocation().getPath();
		// Pass
        // System.out.println(transformerLocation);

		// Parse
		EglFileGeneratingTemplateFactory factory = new EglFileGeneratingTemplateFactory();
		factory.setOutputRoot(path.toOSString());
		EgxModule module = new EgxModule(factory);
		// module.parse(new File("../workspace/RequirementsEditor/de.tubs.cs.isf.reqeditor.transformation.text/model/Output2CSV.egx").getAbsoluteFile());
		module.parse(new File(transformerLocation + "model/Output2CSV.egx").getAbsoluteFile());

		if (!module.getParseProblems().isEmpty()) {
			System.out.println("Syntax errors found. Exiting.");
			return;
		}

		// Load model
		EmfModel model = new EmfModel();
		model.setName("RequirementModel");
		model.setMetamodelUri("http://www.isf.cs.tu-bs.de/reqeditor");
		model.setModelFile(path.toOSString());
		model.setReadOnLoad(true);
		model.setStoredOnDisposal(true);
		model.load();

		// Make visible to the EGX program
		module.getContext().getModelRepository().addModel(model);
		// Execute
		module.execute();

	}

}
