package com.company;

public class Exercise_5_25 {
    public static void main(String[] args) {
        for(int i=10000; i<= 100000; i+=10000){
            // compute pi
            double pi = 0;
            for (int n=1; n<=i; n++) {
                pi += Math.pow(-1,n+1)/(2*n-1);
            }
            pi = 4*pi;
            System.out.printf("when i = %d, pi = %f\n", i, pi);
        }
    }
}
