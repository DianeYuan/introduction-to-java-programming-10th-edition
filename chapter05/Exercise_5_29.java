package com.company;
import java.util.Scanner;

public class Exercise_5_29 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = input.nextInt();
        System.out.print("Enter the first day of that year(1-7): ");
        int day = input.nextInt()%7;

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
        final int NUMBER_PER_LINE = 7;
        int daysInAMonth = 31;

        for(int i= 1; i<=12; i++){
            // get the first day of the month
            // February
            if(i==2) {
                if(isLeapYear) {
                    day = (day + 29) % 7;
                    daysInAMonth = 29;
                }

                else {
                    day = (day + 28) % 7;
                    daysInAMonth = 28;
                }
            }
            // month with 31 days
            else if (i==3 || i==5 || i==7 || i==8 || i==10 || i==12) {
                day = (day + 31) % 7;
                daysInAMonth = 31;
            }
            // month with 30 days
            else if (i==2 || i==4|| i==6|| i==9|| i==11){
                day = (day + 30) % 7;
                daysInAMonth = 30;
            }
            // print calender of that month
            System.out.printf("%20s %-20d\n",month[i-1],year);
            System.out.println("-----------------------------------------");
            System.out.printf("%-6s%-6s%-6s%-6s%-6s%-6s%-6s\n","Sun","Mon","Tue","Wed","Thu","Fri","Sat");
            int spaces = day;
            int count = spaces;
            // print spaces
            for (int k=1; k<= spaces; k++)
                System.out.print("      ");
            // print numbers
            for (int j=1; j <= daysInAMonth; j++) {
                count++;
                if (count % NUMBER_PER_LINE==0)
                    System.out.printf("%-6d\n",j);
                else
                    System.out.printf("%-6d",j);
            }
            // go to next line
            System.out.println("\n");
        }
    }
}
