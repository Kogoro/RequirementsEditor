//failed, abandoned

package de.tubs.cs.isf.reqeditor.transformation.text;

import java.io.File;

import org.eclipse.epsilon.egl.EglFileGeneratingTemplateFactory;
import org.eclipse.epsilon.egl.EglTemplate;
import org.eclipse.epsilon.egl.EglTemplateFactory;
import org.eclipse.epsilon.egl.EglTemplateFactoryModuleAdapter;
import org.eclipse.epsilon.egl.internal.EglModule;
import org.eclipse.epsilon.emc.plainxml.PlainXmlModel;

public class CreateBoth {

	static String path = "model/Output2Files.egl";

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		EglTemplateFactoryModuleAdapter module = new EglTemplateFactoryModuleAdapter(new EglFileGeneratingTemplateFactory());
		module.parse(new File(path).getAbsoluteFile()); //Not work @developer who said this would work
		System.out.println(module.getChildren());
		//System.out.println(module.execute());
	}

}
