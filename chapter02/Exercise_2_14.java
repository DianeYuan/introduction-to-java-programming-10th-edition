package com.company;
import java.util.Scanner;

public class Exercise_2_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weightInKilograms = input.nextDouble()*0.45359237;
        System.out.print("Enter weight in inches: ");
        double heightInMeters = input.nextDouble()*0.0254;
        double bmi = weightInKilograms/(heightInMeters * heightInMeters);
        System.out.println("BMI is " + bmi);
    }
}
