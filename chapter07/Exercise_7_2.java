package com.company;
import java.util.Scanner;

public class Exercise_7_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 integers: ");
        int[] list = new int[10];
        for (int i = 0; i < 10; i++)
            list[i] = input.nextInt();
        // display list in reverse order
        for (int j = 9; j >= 0; j--)
            System.out.print(list[j] + " ");
    }
}
