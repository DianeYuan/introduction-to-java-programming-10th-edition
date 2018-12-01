package com.company;
import java.util.Scanner;

public class Exercise_4_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String s = input.nextLine();
        char ch = Character.toLowerCase(s.charAt(0));
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o'|| ch=='u')
                System.out.println(ch + " is a vowel");
            else
                System.out.println(ch + " is a consonant");
        }
        else
            System.out.println(ch + " is an invalid input");
    }
}
