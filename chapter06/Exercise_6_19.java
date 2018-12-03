package com.company;
import java.util.Scanner;

public class Exercise_6_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the lengths of 3 sides in a triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        if (MyTriangle.isValid(side1, side2, side3)) {
            System.out.printf("The area of the triangle is %.3f\n",MyTriangle.area(side1, side2, side3));
        }
        else
            System.out.println("invalid inputs");
    }
}
