package com.company;
import java.util.Scanner;

public class Exercise_2_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter investment amount: ");
        double investment = input.nextDouble();
        System.out.print("Enter annual interest rate in percentage: ");
        double monthlyRate = input.nextDouble()/1200;
        System.out.print("Enter number of years: ");
        int year = input.nextInt();
        double futureValue = investment*Math.pow((1 + monthlyRate), year*12);
        System.out.println("Accumulated value is $" + (int) (futureValue*100)/100.0);
    }
}
