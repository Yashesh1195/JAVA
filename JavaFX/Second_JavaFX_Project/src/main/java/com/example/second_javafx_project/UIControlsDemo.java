package com.example.second_javafx_project;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class UIControlsDemo extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Labels
        Label nameLabel = new Label("Name:");
        Label genderLabel = new Label("Gender:");
        Label interestsLabel = new Label("Interests:");
        Label countryLabel = new Label("Country:");
        Label languageLabel = new Label("Languages:");
        Label feedbackLabel = new Label("Feedback:");
        Label ratingLabel = new Label("Rate Us:");

        // TextField
        TextField nameField = new TextField();

        // RadioButtons for Gender
        ToggleGroup genderGroup = new ToggleGroup();
        RadioButton rbMale = new RadioButton("Male");
        rbMale.setToggleGroup(genderGroup);
        RadioButton rbFemale = new RadioButton("Female");
        rbFemale.setToggleGroup(genderGroup);

        HBox genderBox = new HBox(10, rbMale, rbFemale);

        // CheckBoxes for Interests
        CheckBox cbMusic = new CheckBox("Music");
        CheckBox cbSports = new CheckBox("Sports");
        CheckBox cbReading = new CheckBox("Reading");

        HBox interestBox = new HBox(10, cbMusic, cbSports, cbReading);

        // ComboBox for Country
        ComboBox<String> countryBox = new ComboBox<>();
        countryBox.getItems().addAll("India", "USA", "UK", "Australia");

        // ListView for Languages
        ListView<String> languageList = new ListView<>();
        languageList.getItems().addAll("English", "Hindi", "Gujarati", "Spanish");
        languageList.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        languageList.setPrefHeight(80);

        // TextArea for Feedback
        TextArea feedbackArea = new TextArea();
        feedbackArea.setPrefRowCount(3);

        // Slider for Rating
        Slider ratingSlider = new Slider(1, 5, 3);
        ratingSlider.setMajorTickUnit(1);
        ratingSlider.setMinorTickCount(0);
        ratingSlider.setSnapToTicks(true);
        ratingSlider.setShowTickMarks(true);
        ratingSlider.setShowTickLabels(true);

        // Button
        Button submitBtn = new Button("Submit");
        TextArea resultArea = new TextArea();
        resultArea.setEditable(false);
        resultArea.setPrefRowCount(5);

        // Event Handling
        submitBtn.setOnAction(e -> {
            StringBuilder sb = new StringBuilder();
            sb.append("Name: ").append(nameField.getText()).append("\n");

            RadioButton selectedGender = (RadioButton) genderGroup.getSelectedToggle();
            sb.append("Gender: ").append(selectedGender != null ? selectedGender.getText() : "None").append("\n");

            sb.append("Interests: ");
            if (cbMusic.isSelected()) sb.append("Music ");
            if (cbSports.isSelected()) sb.append("Sports ");
            if (cbReading.isSelected()) sb.append("Reading ");
            sb.append("\n");

            sb.append("Country: ").append(countryBox.getValue()).append("\n");

            sb.append("Languages: ").append(languageList.getSelectionModel().getSelectedItems()).append("\n");

            sb.append("Feedback: ").append(feedbackArea.getText()).append("\n");

            sb.append("Rating: ").append((int) ratingSlider.getValue()).append(" stars");

            resultArea.setText(sb.toString());
        });

        // Layout
        GridPane grid = new GridPane();
        grid.setVgap(10);
        grid.setHgap(10);
        grid.setPadding(new Insets(15));
        grid.setAlignment(Pos.TOP_LEFT);

        grid.add(nameLabel, 0, 0);
        grid.add(nameField, 1, 0);

        grid.add(genderLabel, 0, 1);
        grid.add(genderBox, 1, 1);

        grid.add(interestsLabel, 0, 2);
        grid.add(interestBox, 1, 2);

        grid.add(countryLabel, 0, 3);
        grid.add(countryBox, 1, 3);

        grid.add(languageLabel, 0, 4);
        grid.add(languageList, 1, 4);

        grid.add(feedbackLabel, 0, 5);
        grid.add(feedbackArea, 1, 5);

        grid.add(ratingLabel, 0, 6);
        grid.add(ratingSlider, 1, 6);

        grid.add(submitBtn, 1, 7);
        grid.add(resultArea, 0, 8, 2, 1);

        // Scene and Stage
        Scene scene = new Scene(grid, 500, 600);
        primaryStage.setTitle("JavaFX UI Controls Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

