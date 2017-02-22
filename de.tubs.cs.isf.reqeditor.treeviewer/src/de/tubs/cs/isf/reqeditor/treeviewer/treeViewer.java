package de.tubs.cs.isf.reqeditor.treeviewer;

import javafx.application.Application;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableColumn.CellDataFeatures;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeTableView;
import javafx.stage.Stage;
 
public class treeViewer extends Application {
 
    public static void main(String[] args) {
        Application.launch(args);
    }
    
    @Override
    public void start(Stage stage) {
        stage.setTitle("Tree Table View Samples");
        final Scene scene = new Scene(new Group(), 600, 400);
        Group sceneRoot = (Group)scene.getRoot();  
      
        final TreeItem<String> childNode1 = new TreeItem<>("Child Node 1");
        final TreeItem<String> childNode2 = new TreeItem<>("Child Node 2");
        final TreeItem<String> childNode3 = new TreeItem<>("Child Node 3");
        
        final TreeItem<String> requirementsModel = new TreeItem<>("Requirements Model");
        requirementsModel.setExpanded(true);
        
        
        requirementsModel.getChildren().setAll(childNode1, childNode2, childNode3);        

        TreeTableColumn<String,String> column = new TreeTableColumn<>("Column");
        column.setPrefWidth(400);   
     
        column.setCellValueFactory((CellDataFeatures<String, String> p) -> 
            new ReadOnlyStringWrapper(p.getValue().getValue()));  

        final TreeTableView<String> treeTableView = new TreeTableView<>(requirementsModel);
        treeTableView.getColumns().add(column);
        treeTableView.setPrefWidth(420);
        treeTableView.setShowRoot(true);             
        sceneRoot.getChildren().add(treeTableView);
        stage.setScene(scene);
        stage.show();
    }
    
    public TreeItem<String> requirementModelElement(String name, String id, String description) {
    	TreeItem<String> item = new TreeItem<>(name);
    	
    	return item;
	}
    
	public TreeItem<String> constraints(String name, String id, String description) {
		TreeItem<String> item = new TreeItem<>(name);
    	
    	return item;
	}
	
	public TreeItem<String> attribute(String name, String id, String description) {
		TreeItem<String> item = new TreeItem<>(name);
    	
    	return item;
	}
	
	public TreeItem<String> attributeValue(String name, String id, String description) {
		TreeItem<String> item = new TreeItem<>(name);
    	
    	return item;
	}
}