package com.example.first_javafx_project;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Practice_2 extends Application{
    @Override
    public void start(Stage primaryStage) {
        try{
            StackPane root = new StackPane();
            root.getChildren().add(new Button("OK!!"));
            Scene scene = new Scene(root, 600,  600);
            primaryStage.setTitle("Practice_2");
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
