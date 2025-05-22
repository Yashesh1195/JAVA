package com.example.second_javafx_project;

public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
    }

    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        int numberOfMonths = numberOfYears * 12;

        if (monthlyInterestRate == 0) {
            return loanAmount / numberOfMonths;
        }

        return loanAmount * monthlyInterestRate /
                (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfMonths));
    }

    public double getTotalPayment() {
        return getMonthlyPayment() * numberOfYears * 12;
    }
}
