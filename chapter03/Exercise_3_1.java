package com.company;
import java.util.Scanner;

public class Exercise_3_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double r1, r2;
        if (b*b > 4*a*c) {
            r1 = (-b + Math.pow(b*b - 4*a*c, 0.5))/(2*a);
            r2 = (-b - Math.pow(b*b - 4*a*c, 0.5))/(2*a);
            System.out.println("The equation has two roots " + r1 + " and " + r2);
        }
        else if (b*b == 4*a*c) {
            r1 = (-b)/(2*a);
            System.out.println("The equation has one root " + r1);
        }
        else {
            System.out.println("The equation has no real roots");
        }
    }
}
