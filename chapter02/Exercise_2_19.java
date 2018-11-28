package com.company;
import java.util.Scanner;

public class Exercise_2_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three points for a triangle: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        double side1 = Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2);
        side1 = Math.pow(side1, 0.5);
        double side2 = Math.pow((x2 - x3),2) + Math.pow((y2 - y3),2);
        side2 = Math.pow(side2, 0.5);
        double side3 = Math.pow((x1 - x3),2) + Math.pow((y1 - y3),2);
        side3 = Math.pow(side3, 0.5);
        double s = (side1 + side2 + side3)/2;
        double area = Math.pow(s*(s-side1)*(s-side2)*(s-side3), 0.5);
        System.out.printf("The area of the triangle is " + "%.1f",area);

    }
}
