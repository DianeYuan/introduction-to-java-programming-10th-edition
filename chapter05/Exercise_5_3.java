package com.company;

public class Exercise_5_3 {
    public static void main(String[] args) {
        System.out.printf("%-5s %5s\n","kg", "Pound");
        for(int i = 1; i < 200; i++){
            System.out.printf("%-5d %5.1f\n",i, i*2.2);
        }
    }
}
