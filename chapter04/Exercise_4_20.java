package com.company;
import java.util.Scanner;

public class Exercise_4_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        System.out.printf("The length of the string is %d, the first character is %c\n", s.length(), s.charAt(0));
    }
}
