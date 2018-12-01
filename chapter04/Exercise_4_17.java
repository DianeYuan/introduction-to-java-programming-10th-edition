package com.company;
import java.util.Scanner;

public class Exercise_4_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        System.out.print("Enter a month: ");
        String month = input.next();
        if (month.equals("Jan") || month.equals("Mar") || month.equals("May")|| month.equals("Jul") ||
                month.equals("Aug")|| month.equals("Oct") || month.equals("Dec"))
            System.out.printf("%s %d has 31 days\n", month, year);
        else if (month.equals("Apr") || month.equals("Jun") || month.equals("Sep") || month.equals("Nov"))
            System.out.printf("%s %d has 30 days\n", month, year);
        // check leap year
        else if (month.equals("Feb")) {
            boolean isLeapYear = (year%4 == 0 && year%100 != 0) || (year%400 == 0);
            if (isLeapYear)
                System.out.printf("%s %d has 29 days\n", month, year);
            else
                System.out.printf("%s %d has 28 days\n", month, year);
        }
        else
            System.out.println(month + " is an invalid input");
    }
}
