package com.company;
import java.util.Scanner;

public class Exercise_4_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal value (0 to 15): ");
        int number = input.nextInt();
        if (number >= 0 && number <= 15) {
            if (number < 10)
                System.out.println("The hex value is "+ number);
            else {
                char ch = (char)((int)'A' + number - 10);
                System.out.println("The hex value is "+ ch);
            }
        }
        else
            System.out.println( number + " is an invalid input");
    }
}
