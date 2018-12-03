package com.company;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercise_7_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i<10; i++) {
            int number = input.nextInt();
            if(! list.contains(number))
                list.add(number);
        }
        System.out.println("The number of distinct number is "+ list.size());
        System.out.print("The distinct numbers are: ");
        for(int n:list)
            System.out.print(n + " ");
    }
}
