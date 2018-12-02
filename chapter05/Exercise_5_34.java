package com.company;
import java.util.Scanner;

public class Exercise_5_34 {
    public static void main(String[] args) {
        int userWinTimes = 0;
        int computerWinTimes = 0;
        do {
            // generate a number
            int computer = (int) Math.random() * 3;
            Scanner input = new Scanner(System.in);
            System.out.print("scissor (0), rock (1), paper (2): ");
            int player = input.nextInt();
            String[] choices = new String[3];
            choices[0] = "scissor";
            choices[1] = "rock";
            choices[2] = "paper";
            // check a draw
            if (computer == player) {
                System.out.println("The computer is " + choices[computer] + ". You are " +
                        choices[player] + " too. It is a draw");
            }
            // check win cases
            else if ((computer == 0 && player == 1) || (computer == 1 && player == 2) || (computer == 2 && player == 0)) {
                userWinTimes++;
                System.out.println("The computer is " + choices[computer] + ". You are " +
                        choices[player] + ". You win");
            }
            // check lose case
            else {
                computerWinTimes++;
                System.out.println("The computer is " + choices[computer] + ". You are " +
                        choices[player] + ". You lose");
            }
        } while (userWinTimes <=2 && computerWinTimes <=2);
    }
}
