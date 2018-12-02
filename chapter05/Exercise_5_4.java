package com.company;

public class Exercise_5_4 {
    public static void main(String[] args) {
        System.out.printf("%-5s %6s\n","mile", "km");
        for(int i = 1; i <= 10; i++){
            System.out.printf("%-5d %6.3f\n",i, i*1.609);
        }
    }
}
