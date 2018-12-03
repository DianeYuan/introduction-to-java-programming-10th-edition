package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise_7_27 {
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

        System.out.println(equals(list1, list2)? "Two lists are identical":
                "Two lists are not identical");
    }
    public static boolean equals(int[] list1, int[] list2) {
        if(list1.length != list2.length)
            return false;
        // sort two lists
        Arrays.sort(list1);
        Arrays.sort(list2);
        for(int i=0; i< list1.length; i++) {
            if(list1[i] != list2[i])
                return false;
        }
        return true;
    }
}
