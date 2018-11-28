package com.company;
import java.util.Scanner;

public class Exercise_2_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double rate = input.nextDouble()/100;
        double gratuity = subtotal*rate;
        double total = subtotal + gratuity;
        System.out.println("The gratuity is $"+ gratuity + " and total is $" + total);
    }
}
