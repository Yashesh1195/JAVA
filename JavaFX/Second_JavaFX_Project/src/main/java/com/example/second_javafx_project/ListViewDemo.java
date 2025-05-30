package com.example.second_javafx_project;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

public class ListViewDemo extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            Label l = new Label("Select programming language: ");
            ListView lv = new ListView();
            lv.getItems().add("Java");
            lv.getItems().add("C");
            lv.getItems().add("C++");
            lv.getItems().add("JS");
            lv.getItems().add("Python");
            HBox root = new HBox();
            Scene scene = new Scene(root, 500, 300);
            root.getChildren().addAll(l, lv);
            primaryStage.setTitle("List View Demo");
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
