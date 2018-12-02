package com.company;

public class Exercise_5_27 {
    public static void main(String[] args) {
        final int NUMBER_PER_LINE = 10;
        int count = 0;
        for(int year=101; year <= 2100; year++) {
            boolean isLeapYear = (year%4==0 && year%100!=0 )|| (year%400==0);
            if (isLeapYear) {
                count++;
                if(count % NUMBER_PER_LINE == 0)
                    System.out.println(year);
                else
                    System.out.print(year + " ");
            }
        }
        System.out.printf("\n\nThere are %d leap years between 101 and 2100",count);
    }
}
