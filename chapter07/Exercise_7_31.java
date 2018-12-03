package com.company;

import java.util.Scanner;

public class Exercise_7_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list1: ");
        int length1 = input.nextInt();
        int[] list1 = new int[length1];
        for (int i = 0; i < length1; i++)
            list1[i] = input.nextInt();

        System.out.print("Enter list2: ");
        int length2 = input.nextInt();
        int[] list2 = new int[length2];
        for (int i = 0; i < length2; i++)
            list2[i] = input.nextInt();

        int[] merged = merge(list1, list2);
        display(merged);
    }
    public static int[] merge(int[] list1, int[] list2) {
        int[] merged = new int[list1.length + list2.length];
        int i=0, j=0, k=0;
        while (k < merged.length) {
            if (i == list1.length) {
                merged[k] = list2[j];
                k++;
                j++;
            } else if (j == list2.length) {
                merged[k] = list1[i];
                k++;
                i++;
            } else if (list1[i] <= list2[j]) {
                merged[k] = list1[i];
                k++;
                i++;
            } else {
                merged[k] = list2[j];
                k++;
                j++;
            }
        }
        return merged;
    }
    public static void display(int[] list) {
        System.out.print("The merged list is ");
        for(int n: list)
            System.out.print(n+ " ");
    }
}
