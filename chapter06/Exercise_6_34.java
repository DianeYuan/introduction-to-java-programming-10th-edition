package com.company;

public class Exercise_6_34 {
    /* get the start day of month/1/year */
    public static int getStartDay(int year, int month) {
        int q = 1;
        int m;
        if (month == 1) {
            m = 13;
            year -= 1;
        }
        else if (month == 2) {
            m = 14;
            year -= 1;
        }
        else {
            m = month;
        }
        int k = year % 100;
        int j = year / 100 ;
        int h = (q + 26*(m+1)/10 + k + k/4 + j/4 + 5*j) % 7;
        if(h == 0)
            return 6;
        if(h == 1)
            return 7;
        else
            return h-1;
    }
}
