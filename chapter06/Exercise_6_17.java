package com.company;
import java.util.Scanner;

public class Exercise_6_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        printMatrix(n);
    }
    public static void printMatrix(int n) {
        for(int row = 0; row < n; row++) {
            for(int col= 0; col < n; col++)
                System.out.print((int)(Math.random()*2) +" ");
            // go to next line
            System.out.println();
        }
    }
}
