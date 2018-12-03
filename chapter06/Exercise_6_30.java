package com.company;

public class Exercise_6_30 {
    public static void main(String[] args) {
        // roll 2 dices
        int dice1 = (int)(Math.random()*6) + 1;
        int dice2 = (int)(Math.random()*6) + 1;
        System.out.printf("You rolled %d + %d = %d\n", dice1, dice2, dice1+dice2);
        // check win or lose
        if(dice1 + dice2 == 2 ||dice1 + dice2 == 3 ||dice1 + dice2 == 12)
            System.out.println("You lose");
        else if(dice1 + dice2 == 7 || dice1 + dice2 == 11)
            System.out.println("You win");
        else {
            int number = dice1 + dice2;
            System.out.println("point is " + number);
            // keep rolling dices
            while(true) {
                dice1 = (int)(Math.random()*6) + 1;
                dice2 = (int)(Math.random()*6) + 1;
                System.out.printf("You rolled %d + %d = %d\n", dice1, dice2, dice1+dice2);
                if(dice1 + dice2 == 7) {
                    System.out.println("You lose");
                    break;
                }
                else if(dice1 + dice2 == number) {
                    System.out.println("You win");
                    break;
                }
            }
        }

    }
}
