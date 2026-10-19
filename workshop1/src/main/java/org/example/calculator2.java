package org.example;

public class calculator2 {
}
public class static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter deposit amount: $");
    double principal = scanner.nextDouble();

    System.out.print("Enter annual interest rate (%): ");
    double annualRate = scanner.nextDouble();

    System.out.print("Enter number of years: ");
    int years = scanner.nextInt();

    double rate = annualRate / 100;
    int daysPerYear = 365;
    int n = daysPerYear * years;

    double futureValue = principal *
            Math.pow(1 + rate / daysPerYear, n);

    double totalInterest = futureValue - principal;

    System.out.printf("Future value: $%.2f%n", futureValue);
    System.out.printf("Total interest earned: $%.2f%n", totalInterest);

    scanner.close();
}
}

