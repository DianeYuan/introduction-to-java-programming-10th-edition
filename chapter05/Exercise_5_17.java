package com.company;
import java.util.Scanner;

public class Exercise_5_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        for(int i = 1; i<= n; i++) {
            int spaces = n-i;
            // print spaces
            for (int j = 1; j <= spaces; j ++)
                System.out.print("  ");
            // print left half except 1
            int left_max = i;
            for (int k = left_max; k > 1; k--)
                System.out.print(k + " ");
            // print right half including 1
            for (int l=1; l<= i; l++)
                System.out.print(l + " ");
            // go to next line
            System.out.println();
        }
    }
}
