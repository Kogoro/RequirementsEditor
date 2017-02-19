package de.tubs.cs.isf.reqeditor.transformation.text;

import java.io.File;

import org.eclipse.epsilon.egl.EglFileGeneratingTemplateFactory;
import org.eclipse.epsilon.egl.EglTemplateFactoryModuleAdapter;
import org.eclipse.epsilon.emc.plainxml.PlainXmlModel;

public class CreateBoth {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		EglTemplateFactoryModuleAdapter module = new EglTemplateFactoryModuleAdapter(new EglFileGeneratingTemplateFactory()); 
		module.parse(new File("model/RM2CSV.egl"));
		PlainXmlModel model = new PlainXmlModel();
		model.setFile(new File("model/FirstSample.reqs"));
		model.setName("RM");
		model.setReadOnLoad(true);
		model.setStoredOnDisposal(true);
		model.load();
		System.out.println(model.getXml()); //pass
		
		module.getContext().getModelRepository().addModel(model);
		System.out.println();
		System.out.println(module.execute());
	}

}
