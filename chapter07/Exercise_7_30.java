package com.company;
import java.util.Scanner;

public class Exercise_7_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of values: ");
        int length = input.nextInt();
        int[] list = new int[length];
        System.out.print("Enter the values: ");
        for(int i=0; i< length; i++)
            list[i] = input.nextInt();
        if(isConsecutiveFour(list))
            System.out.println("The list has consecutive fours");
        else
            System.out.println("The list has no consecutive fours");
    }
    public static boolean isConsecutiveFour(int[] values) {
        for(int i=0; i< values.length; i++) {
            if(i+3 < values.length && values[i] == values[i+1] &&
                    values[i+1] == values[i+2] && values[i+2] == values[i+3])
                return true;
        }
        return false;
    }
}
