package com.company;

public class Exercise_5_11 {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES_PER_LINE = 10;
        int count = 0;
        System.out.println("The numbers that can be divided by 5 or 6 are: ");
        for(int i = 100; i<= 200; i++) {
            if(i%5==0 ^ i%6==0) {
                count++;
                if(count % NUMBER_OF_PRIMES_PER_LINE == 0)
                    System.out.println(i);
                else
                    System.out.print(i + " ");
            }
        }
    }
}
