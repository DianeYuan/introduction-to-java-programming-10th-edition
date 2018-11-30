package com.company;
import java.util.Scanner;

public class Exercise_3_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the weight in pounds: ");
        double weight = input.nextDouble();
        double cost = 0;
        if (weight <=1)
            cost = 3.5;
        else if (weight <= 3)
            cost = 5.5;
        else if (weight <= 10)
            cost = 8.5;
        else if (weight <= 20)
            cost = 10.5;
        else {
            System.out.println("The package cannot be shipped");
            System.exit(1);
        }
        // display result
        System.out.println("The cost in dollar is "+ cost);
    }
}
