package com.example.second_javafx_project;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class TextFieldDemo extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            Label l = new Label("Enter Name : ");
            TextField tf = new TextField();
            HBox root = new HBox();
            Scene scene = new Scene(root, 500, 500);
            root.getChildren().addAll(l, tf);
            primaryStage.setTitle("Text Field Demo");
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
