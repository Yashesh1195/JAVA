package com.example.second_javafx_project;

import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class ButtonDemo extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            VBox root = new VBox();
            Label l = new Label("User Name");
            Button b = new Button("Click ME!!");
            Scene scene = new Scene(root, 500, 500);
            root.getChildren().addAll(l, b);
            primaryStage.setTitle("Button Demo");
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


