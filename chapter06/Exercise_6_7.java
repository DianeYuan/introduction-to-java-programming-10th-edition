package com.company;
import java.util.Scanner;

public class Exercise_6_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount invested: ");
        double investment = input.nextDouble();
        System.out.print("Enter annual interest rate in percentage: ");
        double monthlyRate = input.nextDouble() / 1200;
        printFutureValue(investment, monthlyRate);
    }

    public static void printFutureValue(double investment, double monthlyRate) {
        // print head
        System.out.printf("\n%-8s%12s\n","Years","Future Value");
        final int NUMBER_OF_YEARS = 30;
        for(int year =1; year <= NUMBER_OF_YEARS; year++)
            System.out.printf("%-8d%12.2f\n", year, futureValue(investment, monthlyRate, year));
    }

    public static double futureValue(double investment, double monthlyRate, double year) {
        double futureValue = investment*Math.pow((1 + monthlyRate), year*12);
        return futureValue;
    }
}
