package com.company;
import java.util.Scanner;

public class Exercise_7_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 integers: ");
        int[] list = new int[10];
        for (int i = 0; i < 10; i++)
            list[i] = input.nextInt();
        System.out.println("The combinations of 2 numbers are: ");
        displayCombinations(list);
    }
    public static void displayCombinations(int[] list) {
        for(int i=0; i<list.length; i++) {
            int n1 = list[i];
            for(int j= i+1; j< list.length; j++) {
                int n2 = list[j];
                System.out.printf("%d, %d\n", n1, n2);
            }
        }
    }
}
