package com.example.first_javafx_project;
import javafx.application.Application;
import javafx.scene.Scene;
//import javafx.scene.layout.HBox;
//import javafx.scene.layout.VBox;
//import javafx.scene.layout.StackPane;
//import javafx.scene.layout.GridPane;
//import javafx.scene.layout.FlowPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

import java.util.concurrent.Flow;

// HBox - arranges all nodes horizontally
// VBox - arranges all nodes vertically
// StackPane - arranges all nodes on top of each other (like placed in stack)
// GridPane - arranges nodes in 2D grid
// FlowPane - arranges nodes row by row horizontally or column by column vertically
// BorderPane - arranges nodes at top, bottom, right, left or at center regions

public class LayoutPanesDemo extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
//            HBox root = new HBox();
//            VBox root = new VBox();
//            StackPane root = new StackPane();
//            GridPane root = new GridPane();
//            FlowPane root = new FlowPane();
            BorderPane root = new BorderPane();
            Button b1 = new Button("B1");
            Button b2 = new Button("B2");
            Button b3 = new Button("B3");
            Button b4 = new Button("B4");
            Button b5 = new Button("B5");
//            root.add(b1, 0, 0);
//            root.add(b2, 0, 1);
//            root.add(b3, 0, 2);
//            root.add(b4, 1, 0);
//            root.add(b5, 1, 1);
            Scene scene = new Scene(root, 400,  400);
            root.setBottom(b1);
            root.setTop(b2);
            root.setLeft(b3);
            root.setRight(b4);
            root.setCenter(b5);
//            root.getChildren().addAll(b1, b2, b3, b4, b5);
            primaryStage.setTitle("Layout Panes Demo");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
