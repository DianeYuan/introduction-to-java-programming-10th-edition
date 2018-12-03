package com.company;

public class Exercise_6_29 {
    public static void main(String[] args) {
        int number = 2;
        while (number < 1000) {
            if(number+2 < 1000 && isPrime(number) && isPrime(number+2))
                System.out.printf("(%d, %d)\n", number, number+2);
            number++;
        }
    }
    public static boolean isPrime(int number) {
        for (int divisor=2; divisor <= number/2; divisor++) {
            if(number % divisor==0)
                return false;
        }
        return true;
    }
}
