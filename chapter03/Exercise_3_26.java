package com.company;
import java.util.Scanner;

public class Exercise_3_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        boolean check1 = (number % 5 == 0) && (number % 6 == 0);
        boolean check2 = (number % 5 == 0) || (number % 6 == 0);
        boolean check3 = (number % 5 == 0) ^ (number % 6 == 0);
        System.out.println("Is " + number + " divisible by 5 and 6? " + check1);
        System.out.println("Is " + number + " divisible by 5 or 6? " + check2);
        System.out.println("Is " + number + " divisible by 5 or 6, but not both? " + check3);
    }
}
