package com.company;
import java.util.Scanner;

public class Exercise_6_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String s = input.nextLine();
        System.out.printf("There are %d letters in the string\n", countLetters(s));
    }
    public static int countLetters(String s) {
        int count = 0;
        for(int i=0; i< s.length(); i++) {
            if(Character.isLetter(s.charAt(i)))
                count++;
        }
        return count;
    }
}
