package com.company;
import java.util.Scanner;

public class Exercise_4_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side: ");
        double s = input.nextDouble();
        double area = 6 * s * s / (4 * Math.tan(Math.PI / 6));
        System.out.println("The area of the hexagon is " + area);
    }
}
