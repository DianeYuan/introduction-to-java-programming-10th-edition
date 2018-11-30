package com.company;
import java.util.Scanner;

public class Exercise_3_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int ibsn = input.nextInt();
        int number = ibsn;
        int sum = 0, digit;
        for (int i = 9; i > 0; i--) {
            digit = number % 10;
            number /= 10;
            sum += digit*i;
        }
        sum = sum % 11;
        System.out.print("0" + ibsn);
        System.out.println((sum==10)? "X":sum);
    }
}
