package com.example.second_javafx_project;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class TextAreaDemo extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            Label l = new Label("Enter Name : ");
            TextArea ta = new TextArea();
            double height = 10;
            double width = 50;
            ta.setPrefHeight(height);
            ta.setPrefWidth(width);
            HBox root = new HBox();
            Scene scene = new Scene(root, 500, 500);
            root.getChildren().addAll(l, ta);
            primaryStage.setTitle("Text Area Demo");
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
