package com.company;
import java.util.Scanner;

public class Exercise_6_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        reverse(n);
    }
    public static void reverse(int number) {
        String n = ""+number;
        String reverse = "";
        for (int i=0; i < n.length(); i++) {
            reverse = Character.getNumericValue(n.charAt(i)) + reverse;
        }
        System.out.println(reverse);
    }
}
