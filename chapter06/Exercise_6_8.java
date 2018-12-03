package com.company;

public class Exercise_6_8 {
    public static void main(String[] args) {
        // print heading
        System.out.printf("%-10s%-15s%-15s%-10s\n","celsius", "fahrenheit", "fahrenheit", "celsius");
        System.out.println("-------------------------------------------------");
        for (int cel = 40, fah = 120; cel > 30; cel--, fah -= 10) {
            System.out.printf("%-10.1f%-15.1f%-15.1f%-10.2f\n",
                    cel*1.0,celsiusToFahrenheit(cel*1.0),fah*1.0, fahrenheitToCelsius(fah*1.0));
        }
    }
    public static double celsiusToFahrenheit(double celsius) {
        return (9.0/5)*celsius + 32;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0/9)*(fahrenheit - 32);
    }
}
