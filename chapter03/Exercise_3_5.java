package com.company;
import java.util.Scanner;

public class Exercise_3_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter today's day: ");
        int numberOfToday = input.nextInt();
        System.out.print("Enter the number of days elapsed since today: ");
        int numberOfDays = input.nextInt();
        int numberOfFuture = (numberOfToday + numberOfDays) % 7;
        String[] days = new String[7];
        days[0] = "Sunday";
        days[1] = "Monday";
        days[2] = "Tuesday";
        days[3] = "Wednesday";
        days[4] = "Thursday";
        days[5] = "Friday";
        days[6] = "Saturday";
        System.out.println("Today is " + days[numberOfToday] + " and the future day is " + days[numberOfFuture]);

    }
}
