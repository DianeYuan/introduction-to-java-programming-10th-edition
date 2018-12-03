package com.company;
import java.util.Scanner;

public class Exercise_6_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an string: ");
        String s = input.nextLine();
        String result = "";
        for(int i = 0; i< s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isLetter(ch))
                result += getNumber(ch);
            else
                result += ch;
        }
        System.out.println(result);
    }
    public static int getNumber(char letter) {
        char ch = Character.toLowerCase(letter);
        if (ch >= 'a' && ch <= 'c')
            return 2;
        else if (ch >= 'd' && ch <= 'f')
            return 3;
        else if (ch >= 'g' && ch <= 'i')
            return 4;
        else if (ch >= 'j' && ch <= 'l')
            return 5;
        else if (ch >= 'm' && ch <= 'o')
            return 6;
        else if (ch >= 'p' && ch <= 's')
            return 7;
        else if (ch >= 't' && ch <= 'v')
            return 8;
        else
            return 9;
    }
}
