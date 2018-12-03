package com.company;

public class Exercise_6_28 {
    public static void main(String[] args) {
        System.out.printf("%-4s%-5s\n", "p","2^p-1");
        System.out.println("---------");
        for(int p = 2; p<= 31; p++) {
            int n = (int)Math.pow(2, p)-1;
            // check if n is prime
            if(isPrime(n))
                System.out.printf("%-5d%-5d\n", p, n);
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
