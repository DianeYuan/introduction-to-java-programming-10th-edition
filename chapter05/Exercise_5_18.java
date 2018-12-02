package com.company;
import java.util.Scanner;

public class Exercise_5_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number from 1 to 4 to choose a picture: ");
        int n = input.nextInt();
        if (n == 1) {
            // print picture 1
            for (int i = 1; i<=6; i++) {
                for(int j = 1; j <= i; j++)
                    System.out.print(j + " ");
                System.out.println();
            }
        }
        else if (n == 2) {
            // print picture 2
            for (int i = 1; i <= 6; i++) {
                for (int j=1; j <= 7-i; j++)
                    System.out.print(j + " ");
                System.out.println();
            }
        }
        else if (n == 3) {
            // print picture 3
            for (int i = 1; i<= 6; i ++) {
                int spaces = 6-i;
                // print spaces
                for (int j = 1; j <= spaces; j ++)
                    System.out.print("  ");
                // print numbers
                for (int k = i; k >= 1; k--)
                    System.out.print(k + " ");
                System.out.println();
            }
        }
        else {
            // print picture 4
            for (int i = 1; i<= 6; i ++) {
                int spaces = i-1;
                // print spaces
                for (int j=1; j<= spaces; j++)
                    System.out.print("  ");
                // print numbers
                for (int k = 1; k <= 7-i; k++)
                    System.out.print(k + " ");
                System.out.println();
            }
        }
    }
}
