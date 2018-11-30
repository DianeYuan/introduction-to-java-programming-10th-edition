package com.company;
import java.util.Scanner;
import java.text.DateFormatSymbols;

public class Exercise_3_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter month and year in numbers: ");
        int monthNumber = input.nextInt();
        int year = input.nextInt();
        // check leap year
        boolean isLeapYear = (year%4 == 0 && year%100 != 0) || (year%400 == 0);
        int days;
        switch (monthNumber) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: days = 31; break;
            case 2: {
                days = (isLeapYear) ? 29 : 28;
                break;
            }
            default: days = 30;
        }
        // make a list of 12 months in string
        String[] months = new DateFormatSymbols().getMonths();
        System.out.println(months[monthNumber-1]+ " "+ year + " has " + days + " days");
    }
}
