package com.example.second_javafx_project;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Label;

public class LabelDemo extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            StackPane root = new StackPane();
            Label l = new Label("User Name");
            Scene scene = new Scene(root, 500, 500);
            root.getChildren().addAll(l);
            primaryStage.setTitle("Label Demo");
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

