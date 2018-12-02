package com.company;
import java.util.Scanner;

public class Exercise_5_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter monthly saving amount: ");
        double savingAmount = input.nextDouble();
        System.out.print("Enter annual interest rate in percent: ");
        double monthlyInterestRate = input.nextDouble()/1200;
        System.out.print("Enter saving time in months: ");
        int months = input.nextInt();
        double value = 0;
        for(int i=1; i<=months; i++) {
            value = (value + savingAmount) * (1 + monthlyInterestRate);
        }
        System.out.printf("After %d months the saving amount will be %.2f",months,value);
    }
}
