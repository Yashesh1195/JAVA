package com.example.second_javafx_project;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;

public class SliderDemo extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            Label l = new Label("Slider: ");
            Slider s = new Slider();
            s.setMin(0);
            s.setMax(100);
            s.setShowTickLabels(true);
            s.setShowTickMarks(true);
            s.setValue(25);
            VBox root = new VBox();
            Scene scene = new Scene(root, 500, 300);
            root.getChildren().addAll(l, s);
            primaryStage.setTitle("Slider Demo");
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
