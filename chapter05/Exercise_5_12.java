package com.company;

public class Exercise_5_12 {
    public static void main(String[] args) {
        int n = (int) Math.sqrt(12000);
        while (n*n <= 12000) {
            n++;
        }
        System.out.println("The minimal integer is "+ n);
    }
}
