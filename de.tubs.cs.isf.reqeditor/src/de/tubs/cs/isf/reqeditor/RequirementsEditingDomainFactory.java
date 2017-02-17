package de.tubs.cs.isf.reqeditor;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.command.OverrideableCommand;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.RunnableWithResult;
import org.eclipse.emf.transaction.TransactionalEditingDomain;

public class RequirementsEditingDomainFactory implements TransactionalEditingDomain{

	@Override
	public Resource createResource(String fileNameURI) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Resource loadResource(String fileNameURI) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResourceSet getResourceSet() {
		// TODO Auto-generated method stub
		return null;
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
