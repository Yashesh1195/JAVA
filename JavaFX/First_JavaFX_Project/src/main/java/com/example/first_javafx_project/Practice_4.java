package com.example.first_javafx_project;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.beans.property.Property;

public class Practice_4 extends Application{
    @Override
    public void start(Stage primaryStage) {
        try {
            Pane root = new Pane();
//            Circle c = new Circle();
//            c.centerXProperty().bind(root.widthProperty().divide(2));
//            c.centerYProperty().bind(root.heightProperty().divide(2));
//            c.setRadius(100);
//            c.setStroke(Color.RED);
//            c.setFill(Color.BLUE);
            Rectangle r = new Rectangle();
            r.xProperty().bind(root.widthProperty().subtract(r.widthProperty()).divide(2));
            r.yProperty().bind(root.heightProperty().subtract(r.heightProperty()).divide(2));
            r.setWidth(400);
            r.setHeight(250);
            r.setStroke(Color.BLACK);
            r.setFill(Color.BEIGE);
            Scene scene = new Scene(root, 600, 600);
            root.getChildren().addAll( r);
            primaryStage.setTitle("Practice_4");
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
