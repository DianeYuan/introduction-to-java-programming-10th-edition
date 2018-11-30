package com.company;
import java.util.Scanner;

public class Exercise_3_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit between -58F and 41F: ");
        double fahrenheit = input.nextDouble();
        System.out.print("Enter the wind speed (>=2)  in miles per hour: ");
        double speed = input.nextDouble();
        if (fahrenheit >= -58 && fahrenheit <= 41 && speed >= 2) {
            double index = 35.74 + 0.6215 * fahrenheit - 35.75 * Math.pow(speed, 0.16) +
                    0.4275 * fahrenheit * Math.pow(speed, 0.16);
            System.out.println("The wind chill index is " + index);
        }
        else
            System.out.println("The temperature or the wind speed is invalid input");
    }
}
