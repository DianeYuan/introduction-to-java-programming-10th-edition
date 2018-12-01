package com.company;
import java.util.Scanner;

public class Exercise_4_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first city: ");
        String s1 = input.nextLine();
        System.out.print("Enter the second city: ");
        String s2 = input.nextLine();
        System.out.print("Enter the third city: ");
        String s3 = input.nextLine();
        if (s2.compareTo(s1) < 0) {
            String temp = s1;
            s1 = s2;
            s2 = temp;
        }
        if (s3.compareTo(s2) < 0) {
            String temp = s2;
            s2 = s3;
            s3 = temp;
        }
        if (s2.compareTo(s1) < 0) {
            String temp = s1;
            s1 = s2;
            s2 = temp;
        }
        System.out.printf("The three cities in alphabetical order are %s %s %s\n", s1, s2, s3);
    }
}
