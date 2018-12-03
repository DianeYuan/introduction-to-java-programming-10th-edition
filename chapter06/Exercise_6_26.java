package com.company;

public class Exercise_6_26 {
    public static void main(String[] args) {
        final int NUMBER_PER_LINE = 10;
        int count = 0;
        int number = 2;
        // repeatly find prime and palindrome numbers
        while (count <100) {
            if(isPrime(number) && isPalindrome(number)) {
                count++;
                if (count % NUMBER_PER_LINE == 0)
                    System.out.println(number);
                else
                    System.out.print(number + " ");
            }
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
    public static boolean isPalindrome(int number) {
        String s = ""+number;
        String reverse = "";
        for(int i=0; i< s.length(); i++)
            reverse = s.charAt(i) + reverse;
        if(s.equals(reverse))
            return true;
        return false;
    }
}
