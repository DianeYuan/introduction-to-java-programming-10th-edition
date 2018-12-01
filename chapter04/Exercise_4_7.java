package com.company;
import java.util.Scanner;

public class Exercise_4_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the bounding circle: ");
        double r = input.nextDouble();
        System.out.println("The coordinates of five points on the pentagon are: ");
        for (int i=0; i<5; i++) {
            double angle = 2*Math.PI / 5 * i;
            double x = r * Math.sin(angle);
            double y = r * Math.cos(angle);
            System.out.printf("(%7.4f, %7.4f)\n", x, y);
        }
    }
}
