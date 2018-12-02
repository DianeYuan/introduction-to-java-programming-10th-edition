package com.company;
import java.util.Scanner;

public class Exercise_5_51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String s1 = input.nextLine();
        System.out.print("Enter the second string: ");
        String s2 = input.nextLine();
        int length1 = s1.length(), length2 = s2.length();
        String commonPrefix = "";
        for(int i=0; i < Math.min(length1,length2); i++) {
            if (s1.charAt(i) == s2.charAt(i))
                commonPrefix += s1.charAt(i);
            else
                break;
        }
        if (commonPrefix.length() == 0) {
            System.out.printf("%s and %s have no common prefix\n", s1, s2);
        }
        else
            System.out.println("The common prefix is "+ commonPrefix);
    }
}
