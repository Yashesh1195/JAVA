package com.example.second_javafx_project;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class S22_Q5c extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create controls
        Label nameLabel = new Label("Enter your name:");
        TextField nameInput = new TextField();
        Button greetButton = new Button("Greet");

        // Button action
        greetButton.setOnAction(e -> {
            String name = nameInput.getText();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Greeting");
            alert.setHeaderText(null);
            alert.setContentText("Hello, " + name + "!");
            alert.showAndWait();
        });

        // Layout
        VBox layout = new VBox(10); // 10 px spacing
        layout.getChildren().addAll(nameLabel, nameInput, greetButton);

        // Scene
        Scene scene = new Scene(layout, 300, 150);
        primaryStage.setTitle("Simple JavaFX App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
