package com.company;
import java.util.Scanner;

public class Exercise_2_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        long minutes = input.nextLong();
        long days = minutes/60/24;
        long years = days / 365;
        long remainingDays = days % 365;
        System.out.println(minutes + " minutes is approximately " + years + " years and " +
                remainingDays + " days");
    }
}
