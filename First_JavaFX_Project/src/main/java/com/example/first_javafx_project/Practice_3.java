package com.example.first_javafx_project;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Practice_3 extends Application{
    @Override
    public void start(Stage primaryStage) {
        try {
            Pane root = new Pane();
            Circle c = new Circle();
            c.setCenterX(200);
            c.setCenterY(200);
            c.setRadius(100);
            c.setStroke(Color.RED);
            c.setFill(Color.BLUE);
            Scene scene = new Scene(root, 600, 600);
            root.getChildren().addAll(c);
            primaryStage.setTitle("Practice_3");
            primaryStage.setScene(scene);
            primaryStage.show();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
