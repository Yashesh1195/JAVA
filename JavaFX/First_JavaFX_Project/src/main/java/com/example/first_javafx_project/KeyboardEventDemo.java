package com.example.first_javafx_project;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.control.TextField;

public class KeyboardEventDemo extends Application{
    @Override
    public void start(Stage primaryStage) {
        try {
            Text t2 = new Text(50, 50, "");
            TextField t = new TextField();

            t.setOnKeyPressed(e -> {
                System.out.println("HELLO!!!!");
                String newValue = t2.getText() + e.getText();
                t2.setText(newValue);
            });

            Group root = new Group();
            root.getChildren().addAll(t, t2);
            Scene scene = new Scene(root, 600,  600);
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
