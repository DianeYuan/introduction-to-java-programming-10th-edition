package com.company;
import java.util.Scanner;

public class Exercise_3_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 3 integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        if (number1 > number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        if (number2 > number3) {
            int temp = number2;
            number2 = number3;
            number3 = temp;
        }
        if (number1 > number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        System.out.println("The 3 numbers in ascending order: "+ number1 +" "+ number2 + " "+ number3);
    }
}
