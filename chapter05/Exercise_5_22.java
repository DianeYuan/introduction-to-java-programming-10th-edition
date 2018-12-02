package com.company;
import java.util.Scanner;

public class Exercise_5_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();
        System.out.print("Number of Years: ");
        int numberOfYears = input.nextInt();
        System.out.print("Number of Years: ");
        double annualInterestRate = input.nextDouble();
        double monthlyInterestRate = annualInterestRate / 1200;
        // calculate payment
        double monthlyPayment = loanAmount * monthlyInterestRate/
                (1- 1/ Math.pow(1+monthlyInterestRate,numberOfYears*12));
        double totalPayment = monthlyPayment * numberOfYears * 12;

        System.out.printf("\nMonthly Payment: %.2f\n", monthlyPayment);
        System.out.printf("Total Payment: %.2f\n\n", totalPayment);
        System.out.printf("%-12s%-12s%-12s%-12s\n","Payment#", "Interest", "Principal", "Balance");
        double balance = loanAmount, interest, principal;
        for (int i = 1; i<= numberOfYears*12; i++) {
            interest = balance*monthlyInterestRate;
            principal = monthlyPayment - interest;
            balance = balance * (1+monthlyInterestRate) - monthlyPayment;
            // display result
            System.out.printf("%-12d%-12.2f%-12.2f%-12.2f\n", i, interest, principal, balance);
        }
    }
}
