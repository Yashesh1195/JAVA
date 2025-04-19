//package com.example.first_javafx_project;
//
//import javafx.application.Application;
//import javafx.geometry.Insets;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.control.TextField;
//import javafx.scene.layout.GridPane;
//import javafx.scene.layout.VBox;
//import javafx.stage.Stage;
//
//public class Calculator extends Application {
//
//    private Label expressionLabel;
//    private TextField inputField;
//
//    private double num1 = 0;
//    private String operator = "";
//    private boolean startNewInput = false;
//
//    @Override
//    public void start(Stage primaryStage) {
//        expressionLabel = new Label();
//        expressionLabel.setStyle("-fx-font-size: 14px; -fx-text-fill: grey;");
//
//        inputField = new TextField();
//        inputField.setEditable(false);
//        inputField.setStyle("-fx-font-size: 20px;");
//
//        VBox displayBox = new VBox(5, expressionLabel, inputField);
//        displayBox.setPadding(new Insets(10));
//
//        GridPane grid = new GridPane();
//        grid.setPadding(new Insets(10));
//        grid.setVgap(5);
//        grid.setHgap(5);
//
//        String[] buttons = {
//                "7", "8", "9", "/",
//                "4", "5", "6", "*",
//                "1", "2", "3", "-",
//                "0", "C", "=", "+"
//        };
//
//        int row = 0, col = 0;
//        for (String text : buttons) {
//            Button btn = new Button(text);
//            btn.setPrefSize(50, 50);
//            btn.setOnAction(e -> handleButton(text));
//            grid.add(btn, col, row);
//            col++;
//            if (col > 3) {
//                col = 0;
//                row++;
//            }
//        }
//
//        VBox root = new VBox(10, displayBox, grid);
//        Scene scene = new Scene(root, 240, 300);
//        primaryStage.setTitle("Calculator");
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }
//
//    private void handleButton(String text) {
//        switch (text) {
//            case "C":
//                inputField.clear();
//                expressionLabel.setText("");
//                num1 = 0;
//                operator = "";
//                break;
//            case "=":
//                calculate();
//                break;
//            case "+": case "-": case "*": case "/":
//                try {
//                    num1 = Double.parseDouble(inputField.getText());
//                    operator = text;
//                    expressionLabel.setText(num1 + " " + operator);
//                    inputField.clear();
//                    startNewInput = false;
//                } catch (NumberFormatException e) {
//                    inputField.setText("Error");
//                }
//                break;
//            default: // numbers
//                if (startNewInput) {
//                    inputField.clear();
//                    startNewInput = false;
//                }
//                inputField.appendText(text);
//        }
//    }
//
//    private void calculate() {
//        try {
//            double num2 = Double.parseDouble(inputField.getText());
//            double result = switch (operator) {
//                case "+" -> num1 + num2;
//                case "-" -> num1 - num2;
//                case "*" -> num1 * num2;
//                case "/" -> {
//                    if (num2 == 0) {
//                        inputField.setText("Cannot divide by 0");
//                        yield 0;
//                    }
//                        yield num1 / num2;
//                }
//                default -> 0;
//            };
//
//            expressionLabel.setText(num1 + " " + operator + " " + num2);
//            inputField.setText(String.valueOf(result));
//            startNewInput = true;
//
//        } catch (NumberFormatException e) {
//            inputField.setText("Error");
//        }
//    }
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//}

package com.example.first_javafx_project;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Calculator extends Application {

    private Label expressionLabel;
    private TextField inputField;

    private double num1 = 0;
    private String operator = "";
    private boolean startNewInput = false;

    @Override
    public void start(Stage primaryStage) {
        expressionLabel = new Label();
        expressionLabel.setStyle("-fx-font-size: 14px; -fx-text-fill: grey;");

        inputField = new TextField();
        inputField.setEditable(false);
        inputField.setStyle("-fx-font-size: 20px;");

        VBox displayBox = new VBox(5, expressionLabel, inputField);
        displayBox.setPadding(new Insets(10));

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10));
        grid.setVgap(5);
        grid.setHgap(5);

        String[] buttons = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", "C", "=", "+"
        };

        int row = 0, col = 0;
        for (String text : buttons) {
            Button btn = new Button(text);
            btn.setPrefSize(50, 50);
            btn.setOnAction(e -> handleButton(text));
            grid.add(btn, col, row);
            col++;
            if (col > 3) {
                col = 0;
                row++;
            }
        }

        VBox root = new VBox(10, displayBox, grid);
        Scene scene = new Scene(root, 240, 300);
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void handleButton(String text) {
        switch (text) {
            case "C":
                inputField.clear();
                expressionLabel.setText("");
                num1 = 0;
                operator = "";
                startNewInput = false;
                break;
            case "=":
                calculate();
                break;
            case "+": case "-": case "*": case "/":
                try {
                    if (!inputField.getText().isEmpty()) {
                        num1 = Double.parseDouble(inputField.getText());
                        operator = text;
                        expressionLabel.setText(num1 + " " + operator);
                        inputField.clear();
                        startNewInput = false;
                    }
                } catch (NumberFormatException e) {
                    inputField.setText("Error");
                }
                break;
            default: // numbers
                if (startNewInput) {
                    inputField.clear();
                    startNewInput = false;
                }
                inputField.appendText(text);
        }
    }

    private void calculate() {
        try {
            double num2 = Double.parseDouble(inputField.getText());
            double result = 0;

            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0) {
                        inputField.setText("Cannot divide by 0");
                        return;
                    } else {
                        result = num1 / num2;
                    }
                    break;
                default:
                    inputField.setText("Error");
                    return;
            }

            expressionLabel.setText(num1 + " " + operator + " " + num2);
            inputField.setText(String.valueOf(result));
            startNewInput = true;

        } catch (NumberFormatException e) {
            inputField.setText("Error");
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
