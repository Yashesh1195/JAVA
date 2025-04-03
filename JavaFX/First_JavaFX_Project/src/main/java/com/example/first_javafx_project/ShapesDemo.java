package com.example.first_javafx_project;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
//import javafx.scene.paint.Color;
//import javafx.scene.shape.Line;
//import javafx.scene.shape.Rectangle;
//import javafx.scene.shape.Circle;
//import javafx.scene.shape.Ellipse;
//import javafx.scene.shape.Arc;
import javafx.scene.shape.Polygon;

public class ShapesDemo extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            VBox root = new VBox();
//            Line l = new Line(0, 0, 100, 100);
//            Line l1 = new Line(10, 10, 150, 10);
//            Line l2 = new Line(150, 10, 10, 100);
//            Line l3 = new Line(10, 100, 150, 100);
//            Rectangle r = new Rectangle(20, 20, 300, 200);
//            Rectangle r = new Rectangle(20, 20, 300, 300);
//            r.setFill(Color.rgb(10, 20, 255));
//            Circle c = new Circle();
//            c.setCenterX(200);
//            c.setCenterY(200);
//            c.setRadius(150);
//            Ellipse e = new Ellipse();
//            e.setCenterX(200);
//            e.setCenterY(200);
//            e.setRadiusX(200);
//            e.setRadiusY(70);
//            Arc a = new Arc();
//            a.setCenterX(200);
//            a.setCenterY(200);
//            a.setRadiusX(100);
//            a.setRadiusY(100);
//            a.setStartAngle(120);
//            a.setLength(70);
            Polygon p = new Polygon();
//            p.getPoints().addAll(new Double[] {
//               50.0, 40.0,
//               30.0, 70.0,
//               50.0, 100.0,
//               150.0, 100.0,
//               170.0, 70.0,
//               150.0, 40.0
//            });
            p.getPoints().addAll(new Double[] {
               10.0, 10.0,
               10.0, 100.0,
               100.00, 10.0
            });
            Scene scene = new Scene(root, 500,  500);
//            root.getChildren().addAll(l1, l2, l3);
//            root.getChildren().add(r);
//            root.getChildren().add(c);
//            root.getChildren().add(e);
//            root.getChildren().add(a);
            root.getChildren().add(p);
            primaryStage.setTitle("Shapes Demo");
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