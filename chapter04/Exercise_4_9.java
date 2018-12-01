package com.company;
import java.util.Scanner;

public class Exercise_4_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String s = input.nextLine();
        char ch = s.charAt(0);
        System.out.printf("The Unicode for the character %c is %d\n", ch, (int)ch);
    }
}
