package com.company;

public class Exercise_6_33 {
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
        // get the day
        long day;
        if(!(currentHour == 0 && currentMinute == 0 && currentSecond == 0))
            day = leftDays +1;
        else
            day = leftDays;

        System.out.printf("Current date and time is %s %d, %d %d:%d:%d",
                getMonthName(month), day, year, currentHour, currentMinute, currentSecond);
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
    public static String getMonthName(int month) {
        String[] months = new String[12];
        months[0] = "January";
        months[1] = "February";
        months[2] = "March";
        months[3] = "April";
        months[4] = "May";
        months[5] = "June";
        months[6] = "July";
        months[7] = "August";
        months[8] = "September";
        months[9] = "October";
        months[10] = "November";
        months[11] = "December";
        return months[month-1];
    }
}
