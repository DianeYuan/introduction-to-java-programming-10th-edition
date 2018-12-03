package com.company;
import java.util.Scanner;

public class Exercise_6_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        double n1 = input.nextInt();
        double n2 = input.nextInt();
        double n3 = input.nextInt();
        displaySortedNumbers(n1, n2, n3);
    }
    public static void displaySortedNumbers(double num1, double num2, double num3) {
        if (num1 > num2) {
            double temp = num1;
            num1 = num2;
            num2 = temp;
        }

        if (num2 > num3) {
            double temp = num2;
            num2 = num3;
            num3 = temp;
        }

        if (num1 > num2) {
            double temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.println("The sorted numbers are "
                + num1 + " " + num2 + " " + num3);
    }
}
