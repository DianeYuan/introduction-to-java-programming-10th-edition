package com.company;
import java.util.*;

public class Exercise_7_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list: ");
        int length = input.nextInt();
        int[] list = new int[length];
        for(int i=0; i< length; i++)
            list[i] = input.nextInt();
        System.out.println("The list is " + (isSorted(list)? "already sorted":"not sorted"));
    }
    public static boolean isSorted(int[] list) {
        for(int i=0; i< list.length-1; i++) {
            if (list[i+1] < list[i])
                return false;
        }
        return true;
    }
}
