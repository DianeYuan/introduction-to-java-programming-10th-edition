package com.company;

import java.util.Scanner;

public class Exercise_7_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        double[] array = new double[10];
        for(int i=0; i<10; i++)
            array[i] = input.nextDouble();
        System.out.println("The minimum number is "+ min(array));
    }
    public static double min(double[] array) {
        double min = array[0];
        for(int i=1; i< array.length; i++) {
            if(array[i] < min)
                min = array[i];
        }
        return min;
    }
}
