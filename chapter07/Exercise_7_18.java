package com.company;
import java.util.*;

public class Exercise_7_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 double type numbers: ");
        double[] list = new double[10];
        for (int i = 0; i < 10; i++)
            list[i] = input.nextDouble();
        System.out.print("List before sorting: ");
        System.out.println(Arrays.toString(list));
        bubbleSort(list);
        System.out.print("List after sorting: ");
        System.out.println(Arrays.toString(list));

    }
    public static void bubbleSort(double[] list) {
        double temp;
        for(int i = 0; i < list.length-1; i++) {
            for(int j=0; j < list.length-1-i; j++) {
                if(list[j+1] < list[j]) {
                    temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }
    }
}
