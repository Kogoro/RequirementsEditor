package de.tubs.cs.isf.reqeditor.transformation.text;

import java.io.File;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.epsilon.egl.EglFileGeneratingTemplateFactory;
import org.eclipse.epsilon.egl.EgxModule;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.emc.plainxml.PlainXmlModel;

public class CreateCSV {

	private static File inputFile = new File("model/requirementsEditor.ecore");
	public static void main(String[] args) throws Exception {

		CreateCSV cc = new CreateCSV();
		cc.run1();

		PlainXmlModel model = new PlainXmlModel();
		model.setName("RM");
		model.setReadOnLoad(true);
		model.setStoredOnDisposal(true);
		model.load();
		System.out.println(model.getXml()); // pass
	}

	public void run() throws Exception {//failed
		inputFile = new File("model/FirstSample.reqs");
		System.out.println(inputFile.getAbsolutePath());
		EmfModel model = new EmfModel();
		model.setName("Ecore");
		EPackage.Registry.INSTANCE.put(EcorePackage.eINSTANCE.getNsURI(), EcorePackage.eINSTANCE);
		model.setMetamodelUri(EcorePackage.eINSTANCE.getNsURI());
		model.setModelFile(inputFile.getAbsolutePath());
		model.load();
		System.out.println(model.allContents());// pass, model loaded
		generate(model);
		model.disposeModel();
	}
	public void run1() throws Exception {//seems better, no! also failed
		EmfModel model = new EmfModel();
		model.setName("Ecore");
		EPackage.Registry.INSTANCE.put(EcorePackage.eINSTANCE.getNsURI(), EcorePackage.eINSTANCE);
		model.setMetamodelUri(EcorePackage.eINSTANCE.getNsURI());
		System.out.println("meta:" + model.getMetamodelUris());
		model.setModelFile(inputFile.getAbsolutePath());
		model.load();
		System.out.println(model.allContents());// pass, model loaded
		generate(model);
		model.disposeModel();
	}

	protected void generate(EmfModel model) throws Exception {
		
		EglFileGeneratingTemplateFactory templateFactory = new EglFileGeneratingTemplateFactory();
		//templateFactory.setOutputRoot(directory.getAbsolutePath());

		EgxModule module = new EgxModule(templateFactory);
		module.parse(new File("model/Output2CSV.egx").getAbsoluteFile());
		System.out.println(module.getChildren());// pass, parse finished
		if (!module.getParseProblems().isEmpty()) {
			System.out.println("Syntax errors found. Exiting.");
			return;
		}
		model.setReadOnLoad(true);
		model.setStoredOnDisposal(true);
		module.getContext().getModelRepository().addModel(model);

/*		PlainXmlModel reqs = new PlainXmlModel();
		reqs.setFile(new File("model/FirstSample.reqs"));
		reqs.setName("RM");
		reqs.setReadOnLoad(true);
		reqs.setStoredOnDisposal(true);
		System.out.println(reqs.getXml()); // pass
		reqs.load();
		module.getContext().getModelRepository().addModel(reqs);*/
		module.execute();
		module.getContext().getModelRepository().dispose();
	}

}
