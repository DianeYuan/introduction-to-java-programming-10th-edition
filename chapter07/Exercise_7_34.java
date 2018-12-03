package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise_7_34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        System.out.println("The sorted string is "+ sort(s));
    }
    public static String sort(String s) {
        char[] list = new char[s.length()];
        for(int i=0; i< list.length; i++)
            list[i] = s.charAt(i);
        Arrays.sort(list);
        String sorted = "";
        for(int j=0; j< list.length; j++)
            sorted += list[j];
        return sorted;
    }
}
