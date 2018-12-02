package com.company;
import java.util.Scanner;

public class Exercise_5_47 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
        String s = input.nextLine();
        if (s.length() != 12) {
            System.out.println(s+ " is an invalid input");
            System.exit(1);
        }
        else {
            int sum = 0, digit;
            for (int i=0; i<12; i++) {
                digit = Character.getNumericValue(s.charAt(i));
                sum += ((i%2==0)? digit: 3*digit);
            }
            int lastDigit = 10 - sum % 10;
            lastDigit = ((lastDigit == 10) ? 0:lastDigit);
            System.out.println("The ISBN-13 number is "+ s + lastDigit);
        }
    }
}
