package com.company;
import java.util.Scanner;

public class Exercise_5_32 {
    public static void main(String[] args) {
        // generate lottery number
        int lotteryDigit1 = (int)(Math.random()*10);
        int lotteryDigit2;
        do {
            lotteryDigit2 = (int) (Math.random() * 10);
        } while (lotteryDigit1 == lotteryDigit2);
        int lottery = lotteryDigit1*10+lotteryDigit2;
        // prompt the user to enter a guess
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (two digits): ");
        int guess = input.nextInt();
        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;
        System.out.println("The lottery number is "+ lotteryDigit1 + lotteryDigit2);
        // check the guess
        if (guess == lottery)
            System.out.println("Exact match: you win $10,000");
        else if (guessDigit2 == lotteryDigit1 && guessDigit1==lotteryDigit2)
            System.out.println("Match all digits: you win $3,000");
        else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 ||
                 guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2)
            System.out.println("Match one digit: you win $1,000");
        else
            System.out.println("Sorry, no match");
    }
}
