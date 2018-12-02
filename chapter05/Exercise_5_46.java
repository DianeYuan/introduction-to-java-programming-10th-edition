package com.company;
import java.util.Scanner;

public class Exercise_5_46 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.next();
        String reversed = "";
        int length = s.length();
        for(int i=0; i<length; i++) {
            reversed = s.charAt(i) + reversed;
        }
        System.out.println("The reversed string is " + reversed);
    }
}
