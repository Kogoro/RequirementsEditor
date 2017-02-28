package de.tubs.cs.isf.reqeditor.graphiti;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.ui.platform.GFPropertySection;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertyConstants;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetWidgetFactory;

import de.tubs.cs.isf.requirementseditor.Constraint;
import de.tubs.cs.isf.requirementseditor.Requirement;
import de.tubs.cs.isf.requirementseditor.RequirementModelElement;
import de.tubs.cs.isf.requirementseditor.RequirementsModel;

public class AbstractPropertySection extends GFPropertySection implements ITabbedPropertyConstants {

	private TableViewer tv;

	@Override
	public void createControls(Composite parent, TabbedPropertySheetPage tabbedPropertySheetPage) {
		super.createControls(parent, tabbedPropertySheetPage);

		TabbedPropertySheetWidgetFactory factory = getWidgetFactory();
		Composite composite = factory.createFlatFormComposite(parent);
		parent.setLayout(new GridLayout(1, false));
		composite.setLayout(new GridLayout(1, false));
		composite.setLayoutData(new GridData(GridData.FILL_BOTH));

		Table table = factory.createTable(composite, SWT.NONE);
		GridData gd = new GridData(GridData.FILL_BOTH);
		gd.grabExcessHorizontalSpace = true;
		gd.grabExcessVerticalSpace = true;
		table.setLayoutData(gd);
		table.setHeaderVisible(false);

		tv = new TableViewer(table);
		tv.setContentProvider(new IStructuredContentProvider() {

			public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
			}

			public void dispose() {
			}

			public Object[] getElements(Object inputElement) {
				List<String> strings = new ArrayList<String>();
				if (inputElement != null) {
					if (inputElement instanceof RequirementsModel) {
						RequirementsModel model = (RequirementsModel) inputElement;
						strings.add("Model-Name:" + model.getName());
						strings.add("Model-Creator:" + model.getCreator());
						strings.add("Model-Version:" + model.getVersion());
					}
					if (inputElement instanceof RequirementModelElement) {
						RequirementModelElement element = (RequirementModelElement) inputElement;
						strings.add("Element-Name:" + element.getName());
						strings.add("Element-Description:" + element.getDescription());
					}
					if (inputElement instanceof Requirement) {
						Requirement element = (Requirement) inputElement;
						strings.add("Element-Type:" + element.getType());
						strings.add("Element-Priority:" + element.getPriority());
					}
					if (inputElement instanceof Constraint) {
						Constraint constraint = (Constraint) inputElement;
						strings.add("Constraint-Name:" + constraint.getName());
						strings.add("Constraint-Expression:");
					}
				}
				return strings.toArray();
			}
		});

		TableViewerColumn names = new TableViewerColumn(tv, SWT.NONE);
		names.getColumn().setText("Name");
		names.getColumn().setWidth(200);
		names.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				String str = ((String) element);
				return str.substring(str.indexOf("-") + 1, str.indexOf(":"));
			}
		});

		TableViewerColumn values = new TableViewerColumn(tv, SWT.NONE);
		values.getColumn().setText("Value");
		values.getColumn().setWidth(400);
		values.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				String str = ((String) element);
				return str.substring(str.indexOf(":") + 1);
			}
		});

		values.setEditingSupport(new AttributeEditingSupport(tv));
	}

	@Override
	public void refresh() {
		PictogramElement pe = getSelectedPictogramElement();
		if (pe != null) {
			Object bo = Graphiti.getLinkService().getBusinessObjectForLinkedPictogramElement(pe);
			tv.setInput(bo);
		}
	}

	@Override
	public boolean shouldUseExtraSpace() {
		return true;
	}

}
