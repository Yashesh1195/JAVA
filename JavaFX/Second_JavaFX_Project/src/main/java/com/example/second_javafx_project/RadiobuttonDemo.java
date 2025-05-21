package com.example.second_javafx_project;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class RadiobuttonDemo extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            Label l = new Label("Choose Gender : ");
            ToggleGroup group = new ToggleGroup();
            RadioButton b1 = new RadioButton("Male");
            RadioButton b2 = new RadioButton("Female");
            RadioButton b3 = new RadioButton("Others");
            b1.setToggleGroup(group);
            b2.setToggleGroup(group);
            b3.setToggleGroup(group);
            HBox root = new HBox();
            Scene scene = new Scene(root, 500, 500);
            root.getChildren().addAll(l, b1, b2, b3);
            primaryStage.setTitle("Radio Button Demo");
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
