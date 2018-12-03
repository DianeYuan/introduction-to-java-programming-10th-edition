package com.company;

import java.util.Scanner;
import java.util.Arrays;

public class Exercise_7_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 integers: ");
        int[] array = new int[10];
        for (int i = 0; i < 10; i++)
            array[i] = input.nextInt();
        System.out.print("The reversed list is: ");
        reverse(array);
        System.out.println(Arrays.toString(array));
    }
    public static void reverse(int[] list) {
        for(int i=0; i< list.length/2; i++) {
            int temp = list[i];
            list[i] = list[list.length-1-i];
            list[list.length-1-i] = temp;
        }
    }
}
