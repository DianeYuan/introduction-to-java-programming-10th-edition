package com.company;
import java.util.Scanner;

public class Exercise_6_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        displayPattern(n);
    }
    public static void displayPattern(int n) {
        for (int i = 1; i<= n; i++) {
            // print spaces
            int spaces = n-i;
            for (int j=1; j<= spaces; j++)
                System.out.print("  ");
            // print numbers
            for (int k=i; k>= 1; k--)
                System.out.print(k +" ");
            // go to next line
            System.out.println();
        }
    }
}
