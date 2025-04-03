package com.example.first_javafx_project;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Practice_1 extends Application {
    @Override
    public void start(Stage primaryStage) {
        Button bt = new Button("OK!!");
        Scene s = new Scene(bt, 400, 400);
        primaryStage.setTitle("Practice_1");
        primaryStage.setScene(s);
        primaryStage.show();

        Stage ss = new Stage();
//        ss.set.Scene(new Button("OKAY"), (bt, 200, 250));
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}
