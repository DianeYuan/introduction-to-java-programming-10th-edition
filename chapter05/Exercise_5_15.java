package com.company;

public class Exercise_5_15 {
    public static void main(String[] args) {
        int start = (int) '!';
        int end = (int) '~';
        int count = 0;
        final int NUMBER_PER_LINE = 10;
        for (int i = start; i<= end; i++) {
            count++;
            if(count % NUMBER_PER_LINE == 0)
                System.out.println((char)i);
            else
                System.out.print((char)i + " ");
        }
    }
}
