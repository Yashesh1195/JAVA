package com.example.second_javafx_project;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.scene.control.CheckBox;

import java.awt.*;

public class CheckboxDemo extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            HBox root = new HBox();
            Label l = new Label("Choose Hobby: ");
            CheckBox b1 = new CheckBox("Cricket");
            CheckBox b2 = new CheckBox("Listening Music");
            CheckBox b3 = new CheckBox("Reading");
            CheckBox b4 = new CheckBox("Cycling");
            Scene scene = new Scene(root, 500,  500);
            root.getChildren().addAll(l, b1, b2, b3, b4);
            primaryStage.setTitle("Checkbox Demo");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
