package com.company;

public class Exercise_5_24 {
    public static void main(String[] args) {
        double sum = 0;
        for(int i=1; i<=97; i++) {
            sum += 1.0*i/(i+2);
        }
        System.out.println(sum);
    }
}
