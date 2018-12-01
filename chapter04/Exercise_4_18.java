package com.company;
import java.util.Scanner;

public class Exercise_4_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two characters: ");
        String s = input.nextLine();
        if (s.length() != 2) {
            System.out.println("Invalid input");
            System.exit(1);
        }

        char ch1 = Character.toUpperCase(s.charAt(0));
        char ch2 = s.charAt(1);
        if ((ch1 == 'M' || ch1 == 'C' || ch1 == 'I') &&
                (Character.getNumericValue(ch2) >= 1 && Character.getNumericValue(ch2) <= 4)) {
            String major = "" ;
            String type = "";
            switch (ch1) {
                case ('M'): {
                    major = "Mathmatics";
                    break;
                }
                case ('C'): {
                    major = "Computer Science";
                    break;
                }
                case ('I'): {
                    major = "Information Technology";
                    break;
                }
            }
            switch (ch2) {
                case ('1'): {
                    type = "Freshman";
                    break;
                }
                case ('2'): {
                    type = "Sophomore";
                    break;
                }
                case ('3'): {
                    type = "Junior";
                    break;
                }
                case ('4'): {
                    type = "Senior";
                    break;
                }

            }
            System.out.println(major + " " + type);

        }
        else
            System.out.println("Invalid input");
    }
}
