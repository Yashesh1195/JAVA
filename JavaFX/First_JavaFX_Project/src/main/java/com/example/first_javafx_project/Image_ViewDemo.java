package com.example.first_javafx_project;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;


public class Image_ViewDemo extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            StackPane root = new StackPane();
            FileInputStream inp = new FileInputStream("C:/Users/Admin/Desktop/YASHESH/New folder/REDMI NOTE 8 PRO/g.k/IMG-20201207-WA0054.jpg");
            Image img = new Image(inp);
            ImageView imgview = new ImageView(img);
            Label l = new Label("Snip is : ", imgview);
            Scene scene = new Scene(root, 800, 800);
            root.getChildren().add(l);
            primaryStage.setTitle("Image Class");
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
