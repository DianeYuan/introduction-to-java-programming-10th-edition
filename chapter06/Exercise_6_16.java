package com.company;

public class Exercise_6_16 {
    public static void main(String[] args) {
        // print heading
        System.out.printf("%-8s%-5s\n", "Year", "Days");
        System.out.println("-------------");
        // print body
        for (int year = 2000; year <=2020; year++)
            System.out.printf("%-8d%-5d\n", year,computeDays(year));

    }
    public static int computeDays(int year) {
        boolean isLeapYear = (year%4==0 && year%100!=0) || year%400==0;
        if (isLeapYear)
            return 366;
        else
            return 365;
    }
}
