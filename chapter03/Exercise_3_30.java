package com.company;
import java.util.Scanner;

public class Exercise_3_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the time zone offset to GMT: ");
        long offset = input.nextLong();
        // get current time
        long totalMilliSeconds = System.currentTimeMillis();
        long totalSeconds = totalMilliSeconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60 + offset;
        long currentHour = totalHours % 24;
        // display result
        if (currentHour < 12)
            System.out.println("The current time is " + currentHour + ":" + currentMinute + ":" +
                    currentSecond + " AM");
        else
            System.out.println("The current time is " + (currentHour - 12) + ":" + currentMinute + ":" +
                    currentSecond + " PM");
    }
}
