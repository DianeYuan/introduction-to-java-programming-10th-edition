package com.company;
import java.util.Scanner;

public class Exercise_4_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String s = input.nextLine();
        char ch = Character.toLowerCase(s.charAt(0));
        if (ch >= 'a' && ch <= 'z') {
            System.out.print("The corresponding number is ");
            if (ch >= 'a' && ch <= 'c')
                System.out.println(2);
            else if (ch >= 'd' && ch <= 'f')
                System.out.println(3);
            else if (ch >= 'g' && ch <= 'i')
                System.out.println(4);
            else if (ch >= 'j' && ch <= 'l')
                System.out.println(5);
            else if (ch >= 'm' && ch <= 'o')
                System.out.println(6);
            else if (ch >= 'p' && ch <= 's')
                System.out.println(7);
            else if (ch >= 't' && ch <= 'v')
                System.out.println(8);
            else
                System.out.println(9);
        }
        else
            System.out.println(ch + " is an invalid input");
    }
}
