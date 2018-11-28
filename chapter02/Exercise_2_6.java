package com.company;
import java.util.Scanner;

public class Exercise_2_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();
        int sum = 0;
        while(number!= 0) {
            int digit = number%10;
            sum += digit;
            number /= 10;
        }
        System.out.println("The sum of the digits is "+ sum);
    }
}
