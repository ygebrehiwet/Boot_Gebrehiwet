package org.example;

import java.util.Scanner;

public class Calculator3 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.print("Enter monthly payout:$");
        double payment= scanner.nextDouble();

        System.out.print("Enter annual interest rate%:");
        double annualRate=scanner.nextDouble();

        System.out.print("Enter number of years:");
        int years =scanner.nextInt();

        double monthlyRate=annualRate/100/12;
        int n=years*12;
        double presentValue;

        if(monthlyRate==0){
            presentValue=payment*n;
        }
            else {
             presentValue=payment*
                (1 - Math.pow(1 + monthlyRate, -n)/ monthlyRate);
            }
            System.out.printf("Present value: $%.2f%n", presentValue);

            scanner.close();
            }
        }
