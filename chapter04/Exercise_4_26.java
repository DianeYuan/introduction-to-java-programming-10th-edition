package com.company;
import java.util.Scanner;

public class Exercise_4_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an amount in double , for example 11.56: ");
        String s = input.nextLine();
        int k = s.indexOf('.');
        String dollars = s.substring(0, k);
        String cents = s.substring(k + 1);
        // compute the number of quarters, dimes, nickels, pennies
        int remainingAmount = Integer.parseInt(cents);
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;
        int numberOfPennies = remainingAmount;
        // display results
        System.out.printf("Your amount %s consists of\n", s);
        System.out.printf("     %s dollars\n", dollars);
        System.out.printf("     %d quarters\n", numberOfQuarters);
        System.out.printf("     %d dimes\n", numberOfDimes);
        System.out.printf("     %d nickels\n", numberOfNickels);
        System.out.printf("     %d pennies\n", numberOfPennies);
    }
}
