package com.company;
import java.util.Scanner;

public class Exercise_6_37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        System.out.print("Enter a width: ");
        int width = input.nextInt();
        System.out.println(format(number, width));
    }
    public static String format(int number, int width) {
        String s = "" + number;
        int length = s.length();
        if(length > width)
            return s;
        else {
            for(int i = 0; i < length; i++)
                s = "0" + s;
            return s;
        }
    }
}
