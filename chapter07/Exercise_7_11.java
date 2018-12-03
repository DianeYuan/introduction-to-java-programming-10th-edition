package com.company;

import java.util.Scanner;

public class Exercise_7_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        double[] array = new double[10];
        for (int i = 0; i < 10; i++)
            array[i] = input.nextDouble();
        System.out.printf("The mean is %.2f\n", mean(array));
        System.out.printf("The standard deviation is %.5f", Math.sqrt(deviation(array)/(10-1)));
    }
    public static double mean(double[] x) {
        double sum = 0;
        for(double n: x)
            sum += n;
        return sum / x.length;
    }
    public static double deviation(double[] x) {
        double deviation = 0;
        for(double n:x)
            deviation += Math.pow(n - mean(x), 2);
        return deviation;
    }
}
