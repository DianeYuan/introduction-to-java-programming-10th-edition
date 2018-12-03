package com.company;
import java.util.Scanner;

public class Exercise_6_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        System.out.print("Enter a character: ");
        char ch = input.nextLine().charAt(0);
        System.out.printf("The occurrence number of %c is %d", ch, count(s, ch));
    }
    public static int count(String str, char a) {
        int count = 0;
        if (str.indexOf(a) == -1)
            return 0;
        for(int i = 0; i< str.length(); i++) {
            if (str.charAt(i) == a)
                count++;
        }
        return count;
    }
}
