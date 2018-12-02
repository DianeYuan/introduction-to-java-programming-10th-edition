package com.company;
import java.util.Scanner;

public class Exercise_5_41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int number = input.nextInt();
        int max = number;
        int count = 1;
        while (number != 0) {
            number = input.nextInt();
            if(number > max) {
                max = number;
                count = 1;
            }
            else if (number== max) {
                count += 1;
            }
        }
        System.out.println("The largest number is "+ max);
        System.out.println("The occurrence count of the largest number is "+ count);
    }
}
