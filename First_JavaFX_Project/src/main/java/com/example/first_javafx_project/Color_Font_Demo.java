package com.example.first_javafx_project;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
//import javafx.scene.text.Font;
//import javafx.scene.text.FontWeight;
//import javafx.scene.text.FontPosture;

public class Color_Font_Demo extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            VBox root = new VBox();
            Label l = new Label(" I Am Rectangle!!!😎😎");
            l.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.ITALIC, 20));
            Rectangle r = new Rectangle(230, 180);
            int red = 50;
            int green = 50;
            int blue = 250;
//            double alpha = 0.9;
            r.setFill(Color.rgb(red, green, blue));
//            r.setFill(Color.rgb(red, green, blue, alpha));
            Scene scene = new Scene(root, 400,400);
            root.getChildren().addAll(l,r);
            primaryStage.setTitle("Color And Font Demo");
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