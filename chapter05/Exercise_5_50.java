package com.company;
import java.util.Scanner;

public class Exercise_5_50 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        int numberOfCapitals = 0;
        for (int i=0; i< s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch)) {
                numberOfCapitals++;
            }
        }
        System.out.println("The number of uppercase letters is "+numberOfCapitals);
    }
}
