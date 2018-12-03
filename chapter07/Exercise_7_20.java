package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise_7_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        double[] array = new double[10];
        for (int i = 0; i < 10; i++)
            array[i] = input.nextDouble();
        selectionSort(array);
        System.out.println("List after sort: " + Arrays.toString(array));
    }
    public static void selectionSort(double[] list) {
        for(int i=list.length -1; i>0; i--) {
            // find the maximum in the list
            double currentMax = list[i];
            int currentMaxIndex = i;
            for(int j = i-1; j>=0; j--) {
                if(list[j] > currentMax) {
                    currentMax = list[j];
                    currentMaxIndex = j;
                }
            }
            // swap list[i] with list[currentMaxIndex] if necessary
            if (currentMaxIndex !=i) {
                list[currentMaxIndex] = list[i];
                list[i] = currentMax;
            }
        }
    }
}
