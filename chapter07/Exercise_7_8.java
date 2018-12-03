package com.company;
import java.util.Scanner;

public class Exercise_7_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 float numbers: ");
        double[] array = new double[10];
        for(int i=0; i<10; i++)
            array[i] = input.nextDouble();
        System.out.println("The average is "+ average(array));
    }
    public static int average(int[] array) {
        int sum = 0;
        for(int n:array)
            sum += n;
        return sum / array.length;
    }
    public static double average(double[] array) {
        double sum = 0;
        for(double n: array)
            sum += n;
        return sum / array.length;
    }
}
