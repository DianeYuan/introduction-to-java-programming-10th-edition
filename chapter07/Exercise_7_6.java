package com.company;


public class Exercise_7_6 {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIMES = 50;
        final int NUMBER_OF_PRIMES_PER_LINE = 10;
        int count = 0;
        System.out.println("The first 50 prime numbers are: ");
        // initiate the prime list
        int[] primes = new int[50];
        primes[0] = 2;
        count++;
        // start checking at number 3
        int number = 3;
        while(count < NUMBER_OF_PRIMES) {
            boolean isPrime = true;
            for(int i=0; primes[i] <= Math.sqrt(number); i++) {
                if(number % primes[i] == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                primes[count] = number;
                count++;
            }
            number++;
        }
        // display numbers
        for(int i=0; i< 50; i++) {
            if((i+1) % NUMBER_OF_PRIMES_PER_LINE == 0)
                System.out.println(primes[i]);
            else
                System.out.print(primes[i] + " ");
        }

    }
}
