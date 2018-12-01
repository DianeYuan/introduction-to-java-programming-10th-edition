package com.company;
import java.util.Scanner;

public class Exercise_4_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an ASCII code: ");
        int number = input.nextInt();
        System.out.printf("The character for ASCII code %d is %c\n", number, (char) number);
    }
}
