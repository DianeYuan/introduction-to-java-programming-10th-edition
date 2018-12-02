package com.company;
import java.util.Scanner;

public class Exercise_5_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int integer = input.nextInt();
        String binary = "";
        while (integer!=0) {
            int binaryValue = integer % 2;
            binary = binaryValue + binary;
            integer = integer/2;
        }
        System.out.println("The binary number is " + binary);
    }
}
