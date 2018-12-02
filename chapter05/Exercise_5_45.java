package com.company;
import java.util.Scanner;

public class Exercise_5_45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        double sum = 0, sumOfSquares = 0;
        int n = 10;
        for(int i=0; i<n; i++) {
            double x = input.nextDouble();
            sum += x;
            sumOfSquares += x*x;
        }
        double mean = sum/n;
        double deviation = Math.sqrt((sumOfSquares - sum*sum/n)/(n-1));
        System.out.println("The mean is "+ mean);
        System.out.println("The standard deviation is "+ deviation);
    }
}
