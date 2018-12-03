package com.company;
import java.util.Scanner;

public class Exercise_6_24 {
    public static void main(String[] args) {
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds/1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        long totalDays = totalHours / 24;
        // compute the date from midnight, Jan 1, 1970
        // get the year
        int year = 1970;
        long leftDays = totalDays;
        while(leftDays > 365) {
            // get the days of the year
            leftDays -= daysOfYear(year);
            year++;
        }
        // get the month
        int month = 1;
        while(leftDays > getNumberOfDaysInMonth(year, month)) {
            leftDays -= getNumberOfDaysInMonth(year,month);
            month ++;
        }
        long day = leftDays +1;

        System.out.printf("Current date is %d-%d-%d\n", year, month, day);
        System.out.printf("Current time is %d:%d:%d GMT\n", currentHour, currentMinute,currentSecond);
    }
    public static boolean isLeapYear(int year) {
        return year % 400==0||(year % 4==0 && year % 100!=0);
    }
    public static int daysOfYear(int year) {
        return isLeapYear(year)? 366: 365;
    }
    public static int getNumberOfDaysInMonth(int year, int month) {
        if(month==1 ||month==3 || month==5|| month==7 ||month==8||month==10 || month==12)
            return 31;
        if(month==4 || month==6 || month==9|| month==11)
            return 30;
        else
            return isLeapYear(year)? 29: 28;
    }
}
