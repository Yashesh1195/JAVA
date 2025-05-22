package com.example.second_javafx_project;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollBar;

public class ScrollBarDemo extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            Label l = new Label("Scroll Bar: ");
            ScrollBar sb = new ScrollBar();
            sb.setOrientation(Orientation.HORIZONTAL);
//            sb.setMin(0);
//            sb.setMax(100);
//            sb.setValue(5);
//            sb.setOrientation(Orientation.VERTICAL);
            HBox root = new HBox();
            Scene scene = new Scene(root, 500, 300);
            root.getChildren().addAll(l, sb);
            primaryStage.setTitle("Scroll Bar Demo");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch(Exception exception) {
            exception.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
