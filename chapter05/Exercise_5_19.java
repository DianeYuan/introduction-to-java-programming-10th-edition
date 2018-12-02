package com.company;

public class Exercise_5_19 {
    public static void main(String[] args) {
        for(int i = 0; i<= 7; i++) {
            int spaces = 7-i;
            // print spaces
            for (int j = 1; j <= spaces; j ++)
                System.out.printf("%4s", " ");
            // print left half
            for (int k = 0; k <= i; k++)
                System.out.printf("%4d", (int)Math.pow(2, k));
            // print right half
            for (int l = i-1; l >= 0; l--)
                System.out.printf("%4d", (int)Math.pow(2, l));
            System.out.println();
        }
    }
}
