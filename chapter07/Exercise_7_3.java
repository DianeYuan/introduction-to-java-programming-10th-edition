package com.company;
import java.util.Scanner;

public class Exercise_7_3 {
    public static void main(String[] args) {
        // make a list to store numbers from 0 to 100, initiate the count to 0
        int[] list = new int[101];
        for(int i=0; i<101; i++)
            list[i] = 0;
        // prompt for inputs
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integers between 1 and 100 (the input ends if it is 0): ");
        int number = input.nextInt();
        // keep counting until the input is 0
        while(number > 0) {
            list[number]++;
            number = input.nextInt();
        }
        // display result
        for(int i=0; i<101; i++) {
            if(list[i]>0)
                System.out.printf("%d occurs %d %s\n", i, list[i], list[i]>1 ? "times":"time");
        }
    }
}
