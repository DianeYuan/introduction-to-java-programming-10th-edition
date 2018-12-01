package com.company;

public class Exercise_4_25 {
    public static void main(String[] args) {
        // generate 3 random characters
        char ch1 = (char) ('A' + (int)(Math.random()*26));
        char ch2 = (char) ('A' + (int)(Math.random()*26));
        char ch3 = (char) ('A' + (int)(Math.random()*26));
        // generate 4 random digits
        int d1 = (int)(Math.random()*9);
        int d2 = (int)(Math.random()*9);
        int d3 = (int)(Math.random()*9);
        int d4 = (int)(Math.random()*9);
        System.out.printf("The registration number is %c%c%c%d%d%d%d", ch1,ch2,ch3,d1,d2,d3,d4);
    }
}
