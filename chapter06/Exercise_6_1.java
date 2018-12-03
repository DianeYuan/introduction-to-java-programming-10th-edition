package com.company;

public class Exercise_6_1 {
    public static void main(String[] args) {
        final int NUMBERS = 100;
        final int NUMBERS_PER_LINE = 10;
        // print numbers
        for(int i=1; i<= NUMBERS; i++) {
            int n = getPentagonalNumber(i);
            if (i % NUMBERS_PER_LINE == 0)
                System.out.println(n);
            else
                System.out.print(n + " ");
        }
    }
    public static int getPentagonalNumber(int n) {
        return n*(3*n-1)/2;
    }
}
