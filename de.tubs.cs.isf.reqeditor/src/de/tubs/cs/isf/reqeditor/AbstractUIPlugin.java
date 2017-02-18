package de.tubs.cs.isf.reqeditor;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.osgi.framework.BundleContext;


abstract public class AbstractUIPlugin extends org.eclipse.ui.plugin.AbstractUIPlugin {

	abstract public String getID();

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		logInfo("Starting plug-in '" + getID() + "'");
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		logInfo("Stopping plug-in '" + getID() + "'");
		super.stop(context);
	}

	public ImageDescriptor getImageDescriptor(String path) {
		return imageDescriptorFromPlugin(getID(), path);
	}

	public void openEditor(String editorID, IFile file) {
		IFileEditorInput editorInput = new FileEditorInput(file);
		IWorkbenchWindow window = PlatformUI.getWorkbench()
				.getActiveWorkbenchWindow();
		IWorkbenchPage page = window.getActivePage();

		try {
			page.openEditor(editorInput, editorID);
		} catch (PartInitException e) {
			logError("Unable to open file " + file + " in editor " + editorID, e);
		}
	}

	public void logInfo(String message) {
		log(IStatus.INFO, message, new Exception());
	}

	public void logWarning(String message) {
		log(IStatus.WARNING, message, new Exception());
	}

	public void logError(String message, Throwable exception) {
		log(IStatus.ERROR, message, exception);
	}

	public void logError(Throwable exception) {
		if (exception != null)
			logError(exception.getMessage(), exception);
	}

	private void log(int severity, String message, Throwable exception) {
		if (isDebugging())
			getLog().log(new Status(severity, getID(), message, exception));
	}

}
