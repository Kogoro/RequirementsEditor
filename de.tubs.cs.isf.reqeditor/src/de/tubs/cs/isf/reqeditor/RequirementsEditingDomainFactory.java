package de.tubs.cs.isf.reqeditor;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.OverrideableCommand;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.RunnableWithResult;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import de.tubs.cs.isf.requirementseditor.RequirementsEditorFactory;
import de.tubs.cs.isf.requirementseditor.RequirementsEditorPackage;
import de.tubs.cs.isf.requirementseditor.RequirementsModel;

public class RequirementsEditingDomainFactory implements TransactionalEditingDomain {

	static ResourceSet resourceSet;
	static CommandStack commandStack;
	static RequirementsModel model;
	static Resource modelResource;

	public RequirementsEditingDomainFactory() {
		super();
		resourceSet = getResourceSet();
		commandStack = new BasicCommandStack();
	}

	public RequirementsModel getModel() {
		if (modelResource == null)
			loadResource("model.reqs");
		if (model == null)
			model = (RequirementsModel) modelResource.getContents().get(0);
		return model;
	}

	public void setModel(RequirementsModel model) {
		RequirementsEditingDomainFactory.model = model;
	}
	
	public void saveModel() {
		saveModel(getModel());
	}

	public void saveModel(RequirementsModel model) {
		//Resource res = loadResource("model.reqs");
		//modelResource.getContents().clear();
		modelResource.getContents().add(model);
		try {
			modelResource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/*
	 * file must be the complete path to a file
	 */
	public Resource createResource(String file) {
		if (file != null) {

			RequirementsEditorPackage.eINSTANCE.eClass();
			RequirementsEditorFactory factory = RequirementsEditorFactory.eINSTANCE;

			RequirementsModel model = factory.createRequirementsModel();
			model.setName("Default");

			Map<String, String> options = new HashMap<String, String>();
			options.put(XMIResource.OPTION_ENCODING, "UTF-8");

			Resource resource = resourceSet.createResource(URI.createFileURI(file));
			if (resource != null) {
				modelResource = resource;
				resource.getContents().add(model);
				try {
					resource.save(options);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return resource;
		} else
			return null;
	}

	@Override
	public Resource loadResource(String fileNameURI) {
		if (resourceSet != null) {
			modelResource = resourceSet.getResource(URI.createFileURI(fileNameURI), true);
			return modelResource;
		}
		return null;
	}

	@Override
	public ResourceSet getResourceSet() {
		ResourceSet rs;
		if (resourceSet == null)
			rs = new ResourceSetImpl();
		else
			return resourceSet;
		resourceSet = rs;
		return rs;
	}

	@Override
	public Command createCommand(Class<? extends Command> commandClass, CommandParameter commandParameter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Command createOverrideCommand(OverrideableCommand command) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CommandStack getCommandStack() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<?> getChildren(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getParent(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getRoot(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<?> getNewChildDescriptors(Object object, Object sibling) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TreeIterator<?> treeIterator(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<?> getTreePath(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Object> getClipboard() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setClipboard(Collection<Object> clipboard) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean getOptimizeCopy() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isReadOnly(Resource resource) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isControllable(Object object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setID(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void addResourceSetListener(ResourceSetListener l) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeResourceSetListener(ResourceSetListener l) {
		// TODO Auto-generated method stub

	}

	@Override
	public Object runExclusive(Runnable read) throws InterruptedException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void yield() {
		// TODO Auto-generated method stub

	}

	@Override
	public RunnableWithResult<?> createPrivilegedRunnable(Runnable runnable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

}
