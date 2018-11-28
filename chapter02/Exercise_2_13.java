package com.company;
import java.util.Scanner;

public class Exercise_2_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the monthly saving amount: ");
        double monthlySaving = input.nextDouble();
        double monthlyRate = 0.00417;
        double amount;
        amount = monthlySaving * (1 + monthlyRate);
        monthlySaving = 100 + amount;
        amount = monthlySaving * (1 + monthlyRate);
        monthlySaving = 100 + amount;
        amount = monthlySaving * (1 + monthlyRate);
        monthlySaving = 100 + amount;
        amount = monthlySaving * (1 + monthlyRate);
        monthlySaving = 100 + amount;
        amount = monthlySaving * (1 + monthlyRate);
        monthlySaving = 100 + amount;
        amount = monthlySaving * (1 + monthlyRate);
        monthlySaving = 100 + amount;
        System.out.println("After the sixth month, the account value is  $"+ amount);
    }
}
