package com.company;
import java.util.*;

public class Exercise_3_15 {
    public static void main(String[] args) {
        // generate a lottery number
        int lottery = (int) (Math.random()*1000);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (three digits): ");
        int guess = input.nextInt();
        // get digit from lottery
        int lotteryDigit1 = lottery/100;
        int lotteryDigit2 = lottery%100/10;
        int lotteryDigit3 = lottery%100%10;
        // get digit from guess
        int guessDigit1 = guess/100;
        int guessDigit2 = guess%100/10;
        int guessDigit3 = guess%100%10;

        // make 2 lists to store the digits
        List<Integer> lotteryList = new ArrayList<Integer>();
        lotteryList.add(lotteryDigit1);
        lotteryList.add(lotteryDigit2);
        lotteryList.add(lotteryDigit3);

        List<Integer> guessList = new ArrayList<Integer>();
        guessList.add(guessDigit1);
        guessList.add(guessDigit2);
        guessList.add(guessDigit3);

        System.out.println("The lottery number is " + lottery);
        // check how many digits match
        int matchDigit = 0;
        for (int digit : guessList) {
            if (lotteryList.contains(digit))
                matchDigit++;
        }
        // check the guess
        if (guess == lottery)
            System.out.println("Exact match: you win $10,000");
        // check if all digits match
        else if (matchDigit == 3)
            System.out.println("Match all digits: you win $3,000");
        else if (matchDigit == 1)
            System.out.println("Match one digits: you win $1,000");
        else
            System.out.println("Sorry, no match");
    }
}
