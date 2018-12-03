package com.company;
import java.util.Scanner;

public class Exercise_6_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String password = input.nextLine();
        System.out.println(isValidPassword(password)? "Valid Password" : "Invalid Password");
    }
    public static boolean isValidPassword(String password) {
        if (password.length() < 8)
            return false;
        // every char must be letter or digit
        int countDigit = 0;
        for (int i=0; i<password.length(); i++) {
            if (Character.isLetterOrDigit(password.charAt(i))) {
                if (Character.isDigit(password.charAt(i)))
                    countDigit++;
            }
            else
                return false;
        }
        // password must have at least 2 digits
        if (countDigit < 2)
            return false;
        return true;
    }
}
