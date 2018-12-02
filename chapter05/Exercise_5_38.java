package com.company;
import java.util.Scanner;

public class Exercise_5_38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int integer = input.nextInt();
        String octal = "";
        while (integer!=0) {
            int octalValue = integer % 8;
            octal = octalValue + octal;
            integer = integer/8;
        }
        System.out.println("The octal number is " + octal);
    }
}
