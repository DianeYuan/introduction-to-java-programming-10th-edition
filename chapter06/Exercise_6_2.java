package com.company;
import java.util.Scanner;

public class Exercise_6_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        System.out.println("The sum of all digits is "+ sumDigits(n));
    }
    public static int sumDigits(long n) {
        long sum = 0, digit;
        while(n != 0) {
            digit = n % 10;
            sum += digit;
            n = n / 10;
        }
        return (int)sum;
    }
}
