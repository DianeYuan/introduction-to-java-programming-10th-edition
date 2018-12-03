package com.company;

public class Exercise_6_12 {
    public static void main(String[] args) {
        printChars('1', 'Z', 10);
    }
    public static void printChars(char ch1, char ch2, int numberPerLine) {
        final int NUMBERS_PER_LINE = numberPerLine;
        int count = 0;
        for(char ch = ch1; ch <= ch2; ch++) {
            count++;
            if(count % NUMBERS_PER_LINE == 0)
                System.out.println(ch);
            else
                System.out.print(ch + " ");
        }
    }
}
