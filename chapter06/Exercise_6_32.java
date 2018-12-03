package com.company;

public class Exercise_6_32 {
    public static void main(String[] args) {
        int countWins = 0;
        int rounds = 10000;
        for(int i = 1; i<= rounds; i++) {
            if(winGame())
                countWins++;
        }
        System.out.printf("game ran %d times, you won %d times\n", rounds, countWins);
    }
    /* return true if player wins the game, else false */
    public static boolean winGame() {
        // roll 2 dices
        int dice1 = (int)(Math.random()*6) + 1;
        int dice2 = (int)(Math.random()*6) + 1;

        // check win or lose
        if(dice1 + dice2 == 2 ||dice1 + dice2 == 3 ||dice1 + dice2 == 12)
            return false;
        else if(dice1 + dice2 == 7 || dice1 + dice2 == 11)
            return true;
        else {
            int number = dice1 + dice2;
            // keep rolling dices
            while(true) {
                dice1 = (int)(Math.random()*6) + 1;
                dice2 = (int)(Math.random()*6) + 1;
                if(dice1 + dice2 == 7) {
                    return false;
                }
                else if(dice1 + dice2 == number) {
                    return true;
                }
            }
        }
    }
}
