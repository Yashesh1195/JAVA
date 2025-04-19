package com.example.first_javafx_project;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;
import javafx.animation.PathTransition;
import javafx.animation.FadeTransition;

public class Animation2 extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            VBox root = new VBox();

            Circle c = new Circle();
            c.setCenterX(70);
            c.setCenterY(70);
            c.setRadius(150);

            FadeTransition f = new FadeTransition();
            f.setDuration(Duration.millis(3000));
            f.setNode(c);
//            f.setFromValue(10);
//            f.setToValue(0);
            f.setFromValue(0);
            f.setToValue(10);
            f.play();

            Scene scene = new Scene(root, 500, 500);
            root.getChildren().addAll(c);
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
