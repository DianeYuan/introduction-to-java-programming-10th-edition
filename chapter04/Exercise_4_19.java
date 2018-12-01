package com.company;
import java.util.Scanner;

public class Exercise_4_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        String s = input.nextLine();
        int sum = 0, digit;
        for (int i= 1; i< 10; i++) {
            digit = Character.getNumericValue(s.charAt(i-1));
            sum += digit*i;
        }
        sum = sum % 11;
        System.out.print(s);
        System.out.println((sum==10)? "X":sum);
    }
}
