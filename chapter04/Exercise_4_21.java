package com.company;
import java.util.Scanner;

public class Exercise_4_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a SSN: ");
        String s = input.nextLine();
        if (s.length() != 11) {
            System.out.println(s + " is an invalid social security number");
            System.exit(1);
        }
        for (int i=0; i<s.length(); i++) {
            // check dash
            if (i == 3 || i == 6) {
                if (s.charAt(i) != '-') {
                    System.out.println(s + " is an invalid social security number");
                    System.exit(1);
                }
            }
            // check digit
            else if (! Character.isDigit(s.charAt(i))) {
                System.out.println(s + " is an invalid social security number");
                System.exit(1);
            }
        }
        System.out.println(s + " is a valid social security number");
    }
}
