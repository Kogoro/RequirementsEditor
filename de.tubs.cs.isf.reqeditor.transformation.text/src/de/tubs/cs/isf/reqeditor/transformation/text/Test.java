//Probe to do Output2CSV.
package de.tubs.cs.isf.reqeditor.transformation.text;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.egl.EglFileGeneratingTemplateFactory;
import org.eclipse.epsilon.egl.EglTemplateFactory;
import org.eclipse.epsilon.egl.EglTemplateFactoryModuleAdapter;
import org.eclipse.epsilon.egl.EgxModule;
import org.eclipse.epsilon.emc.emf.EmfModel;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.execute.context.Variable;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.eol.models.IRelativePathResolver;

public class Test {

	protected List<Variable> parameters = new ArrayList<Variable>();
	protected Object result;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Test t1 = new Test();
		t1.run();

	}

	public void run() throws URISyntaxException, Exception {
		EglFileGeneratingTemplateFactory templateFactory = new EglFileGeneratingTemplateFactory();
		EgxModule module = new EgxModule(templateFactory);
		module.parse(new File("model/Output2CSV.egx").getAbsoluteFile());
		System.out.println(module.getChildren());// pass, rule parse finished
		if (module.getParseProblems().size() > 0) {
			System.err.println("Parse errors occured...");
			for (ParseProblem problem : module.getParseProblems()) {
				System.err.println(problem.toString());
			}
			return;
		}
		List<IModel> models = new ArrayList<IModel>();
		models.add(createEmfModel_test("RM1", "model/FirstSample.reqs", "model/requirementsEditor.ecore", true, true));
		for (IModel model : models) {
			module.getContext().getModelRepository().addModel(model);
			System.out.println(model);
		}

		for (Variable parameter : parameters) {
			module.getContext().getFrameStack().put(parameter);
		}
		System.out.println();
		preProcess();
		module.execute();
		postProcess();

		module.getContext().getModelRepository().dispose();
	}

	private void preProcess() {
		// TODO Auto-generated method stub

	}

	private void postProcess() {
		System.out.println(result);

	}

	public String getSource() throws Exception {
		return "model/Output2CSV.egx";
	}

	protected EmfModel createEmfModel(String name, String model, String metamodel, boolean readOnLoad,
			boolean storeOnDisposal) throws EolModelLoadingException, URISyntaxException {
		EmfModel emfModel = new EmfModel();
		StringProperties properties = new StringProperties();
		properties.put(EmfModel.PROPERTY_NAME, name);
		properties.put(EmfModel.PROPERTY_FILE_BASED_METAMODEL_URI, getFileURI(metamodel).toString());
		properties.put(EmfModel.PROPERTY_MODEL_URI, getFileURI(model).toString());
		properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad + "");
		properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, storeOnDisposal + "");
		emfModel.load(properties, (IRelativePathResolver) null);
		System.out.println("Success>>>" + emfModel.allContents());
		return emfModel;
	}

	protected EmfModel createEmfModel_test(String name, String model, String metamodel, boolean readOnLoad,
			boolean storeOnDisposal) throws EolModelLoadingException, URISyntaxException {
		EmfModel emfModel = new EmfModel();
		StringProperties properties = new StringProperties();
		properties.put(EmfModel.PROPERTY_NAME, name);
		properties.put(EmfModel.PROPERTY_FILE_BASED_METAMODEL_URI, metamodel);
		properties.put(EmfModel.PROPERTY_MODEL_URI, model);
		properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad + "");
		properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, storeOnDisposal + "");
		emfModel.load(properties, (IRelativePathResolver) null);
		System.out.println("Success>>>" + emfModel.allContents().toString());//dunno if correct
		System.out.println("Meta:" + emfModel.getMetamodelFileUris());//pass
		return emfModel;
	}

	protected URI getFileURI(String fileName) throws URISyntaxException {

		URI binUri = EpsilonStandaloneExample.class.getResource(fileName).toURI();
		URI uri = null;

		if (binUri.toString().indexOf("bin") > -1) {
			uri = new URI(binUri.toString().replaceAll("bin", "src"));
		} else {
			uri = binUri;
		}

		return uri;
	}
}
