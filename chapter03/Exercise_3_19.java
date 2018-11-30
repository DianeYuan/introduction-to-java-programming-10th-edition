package com.company;
import java.util.Scanner;

public class Exercise_3_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of 3 sides in a triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        if ((side1 + side2 > side3) && (side2 + side3 > side1) && (side3 + side1 > side2))
            System.out.println("Inputs are valid");
        else
            System.out.println("Error: illegal inputs");
    }
}
