package com.example.first_javafx_project;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;
import javafx.animation.PathTransition;

public class Animation1 extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            VBox root = new VBox();
//            Rectangle r = new Rectangle(200, 100, 100, 100);

            Circle c2 = new Circle(150, 150, 70);
            Circle c = new Circle();
            c.setCenterX(50);
            c.setCenterY(50);
            c.setRadius(30);

            PathTransition pathTransition = new PathTransition();
            pathTransition.setDuration(Duration.millis(2000));
            pathTransition.setNode(c);
//            pathTransition.setPath(r);
            pathTransition.setPath(c2);
            pathTransition.setCycleCount(5);
            pathTransition.play();

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
