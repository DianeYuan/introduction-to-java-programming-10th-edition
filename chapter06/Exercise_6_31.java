package com.company;
import java.util.Scanner;

public class Exercise_6_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a credit card number as a string: ");
        String s = input.nextLine();
        if(isValid(s))
            System.out.println(s + " is valid");
        else
            System.out.println(s + " is invalid");
    }
    /* return true if the card number is valid */
    public static boolean isValid(String s) {
        if(getSize(s) < 13 ||getSize(s) > 16)
            return false;

        if((sumOfDoubleEvenPlace(s) + sumOfOddPlace(s)) %10 == 0)
            return true;
        return false;
    }
    /* get the result from step 2 */
    public static int sumOfDoubleEvenPlace(String s) {
        int sum = 0;
        for(int i=0; i < s.length(); i += 2) {
            int number = Character.getNumericValue(s.charAt(i));
            sum += getDigit(number);
        }
        return sum;
    }
    /* double the digit, if the doubled number is two digits, return the sum of the two digits */
    public static int getDigit(int number) {
        if(2*number < 10)
            return 2*number;
        int digit1 = 2 * number / 10;
        int digit2 = 2 * number % 10;
        return digit1 + digit2;
    }
    /* return sum of odd-place digits in number */
    public static int sumOfOddPlace(String s) {
        int sum = 0;
        for(int i=1; i< s.length(); i += 2)
            sum += Character.getNumericValue(s.charAt(i));
        return sum;
    }

    /* return the number of digits ind d */
    public static int getSize(String s) {
        return s.length();
    }
}
