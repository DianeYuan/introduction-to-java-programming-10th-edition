package com.company;
import java.util.Scanner;

public class Exercise_2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a degree in Celsius: ");
        double celsius = input.nextDouble();
        //convert celsius to fahrenheit
        double fahrenheit = (9.0/5)*celsius + 32;
        System.out.println("Celsius " + celsius + " is " + fahrenheit + " in Fahrenheit");
    }
}
