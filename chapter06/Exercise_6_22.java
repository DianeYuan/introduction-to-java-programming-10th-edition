package com.company;
import java.util.Scanner;

public class Exercise_6_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        double n = input.nextDouble();
        System.out.printf("The square root of %f is %f", n, sqrt(n));
    }
    public static double sqrt(double n) {
        double lastGuess = 1;
        double nextGuess = (lastGuess + n/ lastGuess)/2;
        while (Math.abs(lastGuess - nextGuess) >= 0.0001) {
            lastGuess = nextGuess;
            nextGuess = (lastGuess + n/ lastGuess)/2;
        }
        return nextGuess;
    }
}
