package com.company;
import java.util.Scanner;

public class Exercise_5_49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine().toLowerCase();
        int numberOfVowels = 0, numberOfConsonants = 0;
        for(int i=0; i< s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == ' ')
                continue;
            else if (ch =='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
                numberOfVowels++;
            else
                numberOfConsonants++;
        }
        System.out.println("The number of vowels is "+numberOfVowels);
        System.out.println("The number of consonants is "+ numberOfConsonants);
    }
}
