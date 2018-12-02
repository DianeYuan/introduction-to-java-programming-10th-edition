package com.company;
import java.util.Scanner;

public class Exercise_5_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the initial deposit amount: ");
        double depositAmount = input.nextDouble();
        System.out.print("Enter annual percentage yield: ");
        double monthlyInterestRate = input.nextDouble()/1200;
        System.out.print("Enter maturity period (number of months): ");
        int months = input.nextInt();
        double value = depositAmount;
        System.out.printf("%-7s%-10s\n","Month", "CD Value");
        for(int i=1; i<=months; i++) {
            value = value*(1+monthlyInterestRate);
            System.out.printf("%-7d%-10.2f\n", i, value);
        }
    }
}
