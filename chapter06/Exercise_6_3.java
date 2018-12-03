package com.company;
import java.util.Scanner;

public class Exercise_6_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        if (isPalindrome(n))
            System.out.println(n + " is a palindrome");
        else
            System.out.println(n + " is not a palindrome");
    }
    public static int reverse(int number) {
        String n = ""+number;
        String reverse = "";
        for (int i=0; i < n.length(); i++) {
            reverse = Character.getNumericValue(n.charAt(i)) + reverse;
        }
        return Integer.parseInt(reverse);
    }
    public static boolean isPalindrome(int number) {
        return (number == reverse(number)) ? true: false;
    }
}
