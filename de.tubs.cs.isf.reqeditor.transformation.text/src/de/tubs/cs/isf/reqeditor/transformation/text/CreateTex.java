package de.tubs.cs.isf.reqeditor.transformation.text;

import java.io.File;

import org.eclipse.epsilon.egl.EglFileGeneratingTemplateFactory;
import org.eclipse.epsilon.egl.EgxModule;
import org.eclipse.epsilon.emc.plainxml.PlainXmlModel;

public class CreateTex {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		EgxModule module = new EgxModule(new EglFileGeneratingTemplateFactory());
		module.parse(new File("model/Output2Tex.egx").getAbsoluteFile());
		System.out.println(module.getChildren());//pass
		if (!module.getParseProblems().isEmpty()) {
			System.out.println("Syntax errors found. Exiting.");
			return;
		}

		PlainXmlModel model = new PlainXmlModel();
		model.setFile(new File("model/FirstSample.reqs"));
		model.setName("RM");
		model.setReadOnLoad(true);
		model.setStoredOnDisposal(true);
		model.load();
		System.out.println(model.getXml()); // pass

		module.getContext().getModelRepository().addModel(model);
		module.execute();
	}

}
