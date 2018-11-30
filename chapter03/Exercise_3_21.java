package com.company;
import java.util.Scanner;

public class Exercise_3_21 {
    public static void main(String[] args) {
        // obtain year, month, day
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: (e.g., 2012): ");
        int year = input.nextInt();
        System.out.print("Enter month: 1-12: ");
        int month = input.nextInt();
        System.out.print("Enter the day of the month: 1-31: ");
        int day = input.nextInt();
        //
        int q = day;
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
        String dayOfWeek = "" ;
        switch (h) {
            case 0: {
                dayOfWeek = "Saturday";
                break;
            }
            case 1: {
                dayOfWeek = "Sunday";
                break;
            }
            case 2: {
                dayOfWeek = "Monday";
                break;
            }
            case 3: {
                dayOfWeek = "Tuesday";
                break;
            }
            case 4: {
                dayOfWeek = "Wednesday";
                break;
            }
            case 5: {
                dayOfWeek = "Thursday";
                break;
            }
            case 6: {
                dayOfWeek = "Friday";
                break;
            }

        }
        System.out.println("Day of the week is " + dayOfWeek);
    }
}
