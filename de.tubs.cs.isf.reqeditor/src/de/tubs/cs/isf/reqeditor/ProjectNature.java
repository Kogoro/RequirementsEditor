package de.tubs.cs.isf.reqeditor;

import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.resources.ProjectScope;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;

public class ProjectNature implements IProjectNature {

	public static final String NATURE_ID = "de.tubs.cs.isf.reqeditor.ProjectNature";
	protected IProject project;
	protected String name;
	protected List<String> models;
	
	@Override
	public void configure() throws CoreException {
	}

	@Override
	public void deconfigure() throws CoreException {
	}

	@Override
	public IProject getProject() {
		return project;
	}

	@Override
	public void setProject(IProject project) {
		this.project = project;
	}
	
	public void addModel(String filename) {
		models.add(filename);
		ProjectScope ps = new ProjectScope(project);
		IEclipsePreferences prefs = ps.getNode(NATURE_ID);
		prefs.put("models", models.toString());
	}
	
	public List<String> getModels() {
		return Collections.unmodifiableList(models);
	}

}
