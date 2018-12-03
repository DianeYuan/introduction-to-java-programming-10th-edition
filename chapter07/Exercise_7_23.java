package com.company;

import java.util.Arrays;

public class Exercise_7_23 {
    public static void main(String[] args) {
        boolean[] lockers = new boolean[100];
        // initiate the lockers
        for(int i=0; i<100; i++)
            lockers[i] = false;
        for(int student = 1; student <= 100; student++) {
            int startIndex = student-1;
            int gap = student;
            for(int j = startIndex; j < 100; j += gap) {
                // change the status of the locker
                if(lockers[j]== true)
                    lockers[j] = false;
                else
                    lockers[j] = true;
            }
        }
        // display result
        System.out.println(Arrays.toString(lockers));
    }
}
