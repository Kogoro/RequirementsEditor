package de.tubs.cs.isf.reqeditor.transformation.text;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.common.util.StringProperties;
import org.eclipse.epsilon.egl.EglTemplateFactory;
import org.eclipse.epsilon.egl.EglTemplateFactoryModuleAdapter;
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
	public void run() throws URISyntaxException, Exception{
		EglTemplateFactoryModuleAdapter module = new EglTemplateFactoryModuleAdapter(new EglTemplateFactory()); 
		module.parse(new File("model/RM2CSV.egl").getAbsoluteFile());
		System.out.println(module.execute());
		if (module.getParseProblems().size() > 0) {
			System.err.println("Parse errors occured...");
			for (ParseProblem problem : module.getParseProblems()) {
				System.err.println(problem.toString());
			}
			return;
		}
		List<IModel> models = new ArrayList<IModel>();
		models.add(createEmfModel("Model", "ab", "models/FirstSample.reqs", true, true));
		for (IModel model : models) {
			module.getContext().getModelRepository().addModel(model);
		}
		
		for (Variable parameter : parameters) {
			module.getContext().getFrameStack().put(parameter);
		}
		
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
		return "model/RM2CSV.egl";
	}

	protected EmfModel createEmfModel(String name, String model, 
			String metamodel, boolean readOnLoad, boolean storeOnDisposal) 
					throws EolModelLoadingException, URISyntaxException {
		EmfModel emfModel = new EmfModel();
		StringProperties properties = new StringProperties();
		properties.put(EmfModel.PROPERTY_NAME, name);
		properties.put(EmfModel.PROPERTY_FILE_BASED_METAMODEL_URI,
				getFileURI(metamodel).toString());
		properties.put(EmfModel.PROPERTY_MODEL_URI, 
				getFileURI(model).toString());
		properties.put(EmfModel.PROPERTY_READONLOAD, readOnLoad + "");
		properties.put(EmfModel.PROPERTY_STOREONDISPOSAL, 
				storeOnDisposal + "");
		emfModel.load(properties, (IRelativePathResolver) null);
		return emfModel;
	}
	
	protected URI getFileURI(String fileName) throws URISyntaxException {
		
		URI binUri = EpsilonStandaloneExample.class.
				getResource(fileName).toURI();
		URI uri = null;
		
		if (binUri.toString().indexOf("bin") > -1) {
			uri = new URI(binUri.toString().replaceAll("bin", "src"));
		}
		else {
			uri = binUri;
		}
		
		return uri;
	}
}
