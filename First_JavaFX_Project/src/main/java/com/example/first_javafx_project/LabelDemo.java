package com.example.first_javafx_project;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class LabelDemo extends Application{
    @Override
    public void start(Stage primaryStage) {
        try {
            StackPane root = new StackPane();
            Label l = new Label("Firstname");
            Button b = new Button("Click Me!!");
            Scene scene = new Scene(root, 500,  500);
            root.getChildren().add(l);
            root.getChildren().add(b);
            primaryStage.setTitle("Layout Panes Demo");
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
