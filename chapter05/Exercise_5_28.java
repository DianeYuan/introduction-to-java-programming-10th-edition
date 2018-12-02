package com.company;
import java.util.Scanner;

public class Exercise_5_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = input.nextInt();
        System.out.print("Enter the first day of that year(1-7): ");
        int day = input.nextInt();
        // make weekday list
        String[] weekday = new String[7];
        weekday[1] = "Monday";
        weekday[2] = "Tuesday";
        weekday[3] = "Wednesday";
        weekday[4] = "Thursday";
        weekday[5] = "Friday";
        weekday[6] = "Saturday";
        weekday[0] = "Sunday";
        // make month list
        String[] month = new String[12];
        month[0] = "January";
        month[1] = "February";
        month[2] = "March";
        month[3] = "April";
        month[4] = "May";
        month[5] = "June";
        month[6] = "July";
        month[7] = "August";
        month[8] = "September";
        month[9] = "October";
        month[10] = "November";
        month[11] = "December";

        // check leap year
        boolean isLeapYear = (year%4==0 && year%100!=0)||(year%400==0);
        System.out.printf("%s 1, %d is %s\n", month[0],year,weekday[day]);
        for(int i=2; i<=12; i++){
            // February
            if(i==2) {
                if(isLeapYear)
                    day = (day + 29)%7;
                else
                    day = (day + 28)%7;
            }
            // month with 31 days
            else if (i==3 || i==5 || i==7 || i==8 || i==10 || i==12)
                day = (day + 31)%7;
            // month with 30 days
            else
                day = (day + 30)%7;
            System.out.printf("%s 1, %d is %s\n", month[i-1],year, weekday[day]);
        }
    }
}
