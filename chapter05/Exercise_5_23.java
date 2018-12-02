package com.company;

public class Exercise_5_23 {
    public static void main(String[] args) {
        // compute from left to right
        double sum = 0;
        for(int n=1; n<=50000; n++) {
            sum += 1.0/n;
        }
        System.out.println("result is "+ sum);
        // compute from right to left
        sum = 0;
        for(int n=50000; n>=1; n--) {
            sum += 1.0/n;
        }
        System.out.println("result is "+ sum);
    }
}
