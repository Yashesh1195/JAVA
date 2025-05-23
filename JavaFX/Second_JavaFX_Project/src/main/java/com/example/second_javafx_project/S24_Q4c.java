package com.example.second_javafx_project;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class S24_Q4c extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create UI controls
        Label label = new Label("Enter your name:");
        TextField textField = new TextField();
        Button button = new Button("Say Hello");

        // Button action event
        button.setOnAction(e -> {
            String name = textField.getText();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Greeting");
            alert.setHeaderText(null);
            alert.setContentText("Hello, " + name + "!");
            alert.showAndWait();
        });

        // Layout setup using VBox with spacing and padding
        VBox root = new VBox(10);
        root.setPadding(new javafx.geometry.Insets(20));
        root.getChildren().addAll(label, textField, button);

        // Create scene and set stage
        Scene scene = new Scene(root, 300, 150);
        primaryStage.setTitle("JavaFX Simple Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
