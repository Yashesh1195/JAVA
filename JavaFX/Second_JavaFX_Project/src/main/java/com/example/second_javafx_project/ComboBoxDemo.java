package com.example.second_javafx_project;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.scene.control.ComboBox;

public class ComboBoxDemo extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            Label l = new Label("Select programming language: ");
            ComboBox cb = new ComboBox();
            cb.getItems().add("Java");
            cb.getItems().add("C");
            cb.getItems().add("C++");
            cb.getItems().add("JS");
            cb.getItems().add("Python");
            HBox root = new HBox();
            Scene scene = new Scene(root, 400, 300);
            root.getChildren().addAll(l, cb);
            primaryStage.setTitle("Combo Box Demo");
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
