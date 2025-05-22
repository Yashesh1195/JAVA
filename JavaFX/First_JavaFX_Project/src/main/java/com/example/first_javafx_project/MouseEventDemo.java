package com.example.first_javafx_project;

import javafx.application.Application;
import javafx.css.converter.FontConverter;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.control.Label;
//import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.text.*;

public class MouseEventDemo extends Application{
    @Override
    public void start(Stage primaryStage) {
        try {
            VBox root = new VBox();
            Label l = new Label("Firstname");
            l.setFont(Font.font(null, FontWeight.BOLD, 30));
//            l.setOnMouseClicked(e -> {
//                l.setTextFill(Color.GREEN);
//            });
//
//            l.setOnMousePressed(e -> {
//                l.setTextFill(Color.RED);
//            });
//
//            l.setOnMouseReleased(e -> {
//                l.setFont(Font.font(40));
//            });

            l.setOnMouseEntered(new EventHandler<MouseEvent>() {
                @Override
                public void handle(MouseEvent mouseEvent) {
                    l.setFont(Font.font(50));
                }
            });

//            l.setOnMouseEntered(e -> {
//                l.setFont(Font.font(50));
//            });
            l.setOnMouseExited(e -> {
                l.setFont(Font.font(80));
            });

            Scene scene = new Scene(root, 600,  600);
            root.getChildren().add(l);
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
