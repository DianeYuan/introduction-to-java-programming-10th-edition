package com.company;
import java.util.Scanner;

public class Exercise_4_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex digit: ");
        String s = input.nextLine();
        char ch = Character.toUpperCase(s.charAt(0));
        if ((ch >= 'A' && ch <= 'F') || Character.isDigit(ch)) {
            int n = Integer.parseInt(s, 16);
            System.out.println("The binary value is " + Integer.toBinaryString(n));
        }
        else
            System.out.println(s+" is an invalid input");
    }
}
