package com.company;

public class Exercise_6_38 {
    public static void main(String[] args) {
        final int NUMBER_OF_CHARS = 100;
        final int CHARS_PER_LINE = 10;
        // print 100 characters
        for(int i = 0; i< NUMBER_OF_CHARS; i++) {
            char ch = getRandomUpperCaseLetter();
            if((i+1) % CHARS_PER_LINE == 0)
                System.out.println(ch);
            else
                System.out.print(ch + " ");
        }
        // print 100 numbers
        for(int j = 0; j< NUMBER_OF_CHARS; j++) {
            char digit = getRandomDigitCharacter();
            if((j+1) % CHARS_PER_LINE == 0)
                System.out.println(digit);
            else
                System.out.print(digit + " ");
        }

    }
    public static char getRandomCharacter(char ch1, char ch2) {
        return (char)(ch1 + Math.random()*(ch2 - ch1 + 1));
    }
    public static char getRandomUpperCaseLetter() {
        return getRandomCharacter('A','Z');
    }
    public static char getRandomDigitCharacter() {
        return getRandomCharacter('0','9');
    }
}
