package com.company;
import java.util.Scanner;

public class Exercise_6_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of millisecond: ");
        long millis = input.nextLong();
        System.out.println(convertMillis(millis));
    }
    public static String convertMillis(long millis) {
        long totalMilliseconds = millis;
        long totalSeconds = totalMilliseconds/1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        String time = "";
        time = time + currentHour + ":" + currentMinute + ":"+ currentSecond;
        return time;
    }
}
