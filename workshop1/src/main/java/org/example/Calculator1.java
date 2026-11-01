package org.example;

import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your loan amount:  ");
        double Principal = scanner.nextDouble();
        System.out.println("inter the annual interest rate: ");
        double annualRate = scanner.nextDouble();
        System.out.println("Enter the length of the Loan:");
        int years = scanner.nextInt();

        Double monthRate = annualRate / 12 / 100;
        int monthlyPayment = years * 12;

        Double monthlyPayments = Principal * (monthRate * Math.pow(1 + monthRate, monthlyPayment))
                / (Math.pow((1 + monthRate), monthlyPayment) - 1);
        Double totalInterest = (monthlyPayment * monthlyPayments) - Principal;
        System.out.printf("The monthlyPayment is %.2f%n", monthlyPayment);
        System.out.printf("the total interest is $%.2f%n", totalInterest);
        scanner.close();
    }
}



