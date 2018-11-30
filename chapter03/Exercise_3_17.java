package com.company;
import java.util.*;

public class Exercise_3_17 {
    public static void main(String[] args) {
        // generate a number
        int computer = (int) Math.random()*3;
        Scanner input = new Scanner(System.in);
        System.out.print("scissor (0), rock (1), paper (2): ");
        int player = input.nextInt();
        String[] choices = new String[3];
        choices[0] = "scissor";
        choices[1] = "rock";
        choices[2] = "paper";
        // check a draw
        if (computer == player) {
            System.out.println("The computer is "+ choices[computer] + ". You are " +
                    choices[player] + " too. It is a draw");
        }
        // check win cases
        else if ((computer==0 && player==1) || (computer==1 && player==2) || (computer==2 && player==0)) {
            System.out.println("The computer is "+ choices[computer] + ". You are " +
                    choices[player] + ". You win");
        }
        else
            System.out.println("The computer is "+ choices[computer] + ". You are " +
                    choices[player] + ". You lose");
    }
}
