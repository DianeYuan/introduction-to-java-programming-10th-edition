package com.company;
import java.util.Scanner;

public class Exercise_5_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();
        System.out.print("Number of Years: ");
        int numberOfYears = input.nextInt();
        System.out.printf("%-18s%-18s%-18s\n","Interest Rate", "Monthly Payment", "Total Payment");
        for(int i = 0; i<= 24; i++){
            // calculate payment
            double annualInterestRate = 0.05 + 1.0/800*i;
            double monthlyInterestRate = annualInterestRate/12;
            double monthlyPayment = loanAmount * monthlyInterestRate/
                    (1- 1/ Math.pow(1+monthlyInterestRate,numberOfYears*12));
            double totalPayment = monthlyPayment * numberOfYears * 12;
            // display results
            System.out.printf("%-5.3f%%            %-18.2f%-18.2f\n",
                    annualInterestRate*100, monthlyPayment,totalPayment);
        }
    }
}
