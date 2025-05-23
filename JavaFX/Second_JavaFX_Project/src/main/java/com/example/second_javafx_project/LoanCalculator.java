//package com.example.second_javafx_project;
//
//import javafx.application.Application;
//import javafx.geometry.Pos;
//import javafx.geometry.HPos;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.control.Label;
//import javafx.scene.control.TextField;
//import javafx.scene.layout.GridPane;
//import javafx.stage.Stage;
//
//public class LoanCalculator extends Application {
//    private TextField tfAnnualInterestRate = new TextField();
//    private TextField tfNumberOfYears = new TextField();
//    private TextField tfLoanAmount = new TextField();
//    private TextField tfMonthlyPayment = new TextField();
//    private TextField tfTotalPayment = new TextField();
//    private Button btCalculate = new Button("Calculate");
//
//    @Override
//    public void start(Stage primaryStage) {
//        // Create GridPane and add components
//        GridPane gridPane = new GridPane();
//        gridPane.setHgap(10);
//        gridPane.setVgap(10);
//
//        gridPane.add(new Label("Annual Interest Rate:"), 0, 0);
//        gridPane.add(tfAnnualInterestRate, 1, 0);
//
//        gridPane.add(new Label("Number of Years:"), 0, 1);
//        gridPane.add(tfNumberOfYears, 1, 1);
//
//        gridPane.add(new Label("Loan Amount:"), 0, 2);
//        gridPane.add(tfLoanAmount, 1, 2);
//
//        gridPane.add(new Label("Monthly Payment:"), 0, 3);
//        gridPane.add(tfMonthlyPayment, 1, 3);
//
//        gridPane.add(new Label("Total Payment:"), 0, 4);
//        gridPane.add(tfTotalPayment, 1, 4);
//
//        gridPane.add(btCalculate, 1, 5);
//        GridPane.setHalignment(btCalculate, HPos.RIGHT);
//
//        // Align all text fields to right
//        tfAnnualInterestRate.setAlignment(Pos.BASELINE_RIGHT);
//        tfNumberOfYears.setAlignment(Pos.BASELINE_RIGHT);
//        tfLoanAmount.setAlignment(Pos.BASELINE_RIGHT);
//        tfMonthlyPayment.setAlignment(Pos.BASELINE_RIGHT);
//        tfTotalPayment.setAlignment(Pos.BASELINE_RIGHT);
//
//        tfMonthlyPayment.setEditable(false);
//        tfTotalPayment.setEditable(false);
//
//        // Align grid to center
//        gridPane.setAlignment(Pos.CENTER);
//
//        // Button action
//        btCalculate.setOnAction(e -> calculateLoanPayment());
//
//        // Set the scene
//        Scene scene = new Scene(gridPane, 400, 250);
//        primaryStage.setTitle("LoanCalculator");
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }
//
//    private void calculateLoanPayment() {
//        try {
//            double interest = Double.parseDouble(tfAnnualInterestRate.getText());
//            int year = Integer.parseInt(tfNumberOfYears.getText());
//            double loanAmount = Double.parseDouble(tfLoanAmount.getText());
//
//            Loan loan = new Loan(interest, year, loanAmount);
//
//            tfMonthlyPayment.setText(String.format("$%.2f", loan.getMonthlyPayment()));
//            tfTotalPayment.setText(String.format("$%.2f", loan.getTotalPayment()));
//        } catch (NumberFormatException ex) {
//            tfMonthlyPayment.setText("Invalid input");
//            tfTotalPayment.setText("Invalid input");
//        }
//    }
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//}

package com.example.second_javafx_project;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class LoanCalculator extends Application {

    @Override
    public void start(Stage primaryStage) {
        // UI Controls
        Label titleLabel = new Label("Simple EMI Calculator");
        titleLabel.setFont(new Font("Arial", 20));
        titleLabel.setTextFill(Color.DARKBLUE);

        Label interestLabel = new Label("Annual Interest Rate (%):");
        TextField interestField = new TextField();

        Label yearsLabel = new Label("Loan Term (Years):");
        TextField yearsField = new TextField();

        Label amountLabel = new Label("Loan Amount:");
        TextField amountField = new TextField();

        Label emiLabel = new Label("Monthly EMI:");
        TextField emiField = new TextField();
        emiField.setEditable(false);

        Label totalLabel = new Label("Total Payment:");
        TextField totalField = new TextField();
        totalField.setEditable(false);

        Button calculateButton = new Button("Calculate");

        // Layout using GridPane
        GridPane grid = new GridPane();
        grid.setVgap(10);
        grid.setHgap(10);
        grid.setStyle("-fx-padding: 20; -fx-background-color: #f4f4f4;");

        // Adding elements to grid
        grid.add(titleLabel, 0, 0, 2, 1);
        grid.add(interestLabel, 0, 1);
        grid.add(interestField, 1, 1);
        grid.add(yearsLabel, 0, 2);
        grid.add(yearsField, 1, 2);
        grid.add(amountLabel, 0, 3);
        grid.add(amountField, 1, 3);
        grid.add(emiLabel, 0, 4);
        grid.add(emiField, 1, 4);
        grid.add(totalLabel, 0, 5);
        grid.add(totalField, 1, 5);
        grid.add(calculateButton, 1, 6);

        // Event Handling
        calculateButton.setOnAction(e -> {
            try {
                double annualRate = Double.parseDouble(interestField.getText());
                int years = Integer.parseInt(yearsField.getText());
                double principal = Double.parseDouble(amountField.getText());

                double r = annualRate / 12 / 100;
                int n = years * 12;

                double emi = (principal * r * Math.pow(1 + r, n)) / (Math.pow(1 + r, n) - 1);
                double total = emi * n;

                emiField.setText(String.format("%.2f", emi));
                totalField.setText(String.format("%.2f", total));
            } catch (Exception ex) {
                emiField.setText("Invalid input");
                totalField.setText("Invalid input");
            }
        });

        // Scene and Stage
        Scene scene = new Scene(grid, 400, 350);
        primaryStage.setTitle("EMI Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
