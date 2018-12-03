package com.company;

import java.util.Scanner;

public class Exercise_7_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int length = 5;
        System.out.printf("Enter %d integers: ", length);
        int[] array = new int[length];
        for (int i = 0; i < length; i++)
            array[i] = input.nextInt();
        System.out.println("The greatest common divisor is "+ gcd(array));
    }

    public static int gcd(int... numbers) {
        // initial gcd
        int gcd = 1;
        // possible gcd
        int k = 2;
        while(k <= min(numbers)) {
            boolean found = true;
            for(int n: numbers) {
                if(n % k != 0) {
                    found = false;
                    break;
                }
            }
            if(found)
                gcd = k;
            k++;
        }
        return gcd;
    }
    public static int min(int... numbers) {
        int min = numbers[0];
        for(int n:numbers) {
            if(n < min)
                min = n;
        }
        return min;
    }
}
