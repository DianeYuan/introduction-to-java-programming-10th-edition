package com.company;

public class Exercise_5_13 {
    public static void main(String[] args) {
        int n = 1;
        while (Math.pow(n,3) < 12000) {
            n++;
        }
        System.out.println("The maximal integer is "+ (n-1));
    }
}
