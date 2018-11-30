package com.company;
import java.util.Scanner;

public class Exercise_3_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer with last 2 digits as cents, for example, 1156: ");
        int amount = input.nextInt();
        int remainingAmount = amount;
        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;
        int numberOfPennis = remainingAmount;
        System.out.println("Your amount " + amount / 100.0 + " consists of");
        if (numberOfOneDollars > 0) {
            System.out.print("   " + numberOfOneDollars + " dollar");
            System.out.println((numberOfOneDollars > 1) ? "s" : "");
        }
        if (numberOfQuarters > 0) {
            System.out.print("   " + numberOfQuarters + " quarter");
            System.out.println((numberOfQuarters > 1) ? "s" : "");
        }
        if (numberOfDimes > 0) {
            System.out.print("   " + numberOfDimes + " dime");
            System.out.println((numberOfDimes > 1) ? "s" : "");
        }
        if (numberOfNickels > 0) {
            System.out.print("   " + numberOfNickels + " nickel");
            System.out.println((numberOfNickels > 1) ? "s" : "");
        }
        if (numberOfPennis > 0) {
            System.out.println("   " + numberOfPennis + " penni");
            System.out.println((numberOfPennis > 1) ? "s" : "");
        }
    }
}
