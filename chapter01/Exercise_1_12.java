package com.company;

public class Exercise_1_12 {
    public static void main(String[] args) {
        double time = 1 + 40.0/60 + 35.0/60/60;
        double distance = 24;
        double speed = distance/time*1.6;
        System.out.println("speed in km is " + speed);
    }
}
