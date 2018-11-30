package com.company;
import java.util.*;

public class Exercise_3_24 {
    public static void main(String[] args) {
        int cardIndex = (int)(Math.random()*13) + 1;
        int suitIndex = (int)(Math.random()*4);
        System.out.print("The card you picked is ");
        switch (cardIndex) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10: {
                System.out.print(cardIndex);
                break;
            }
            case 1: {
                System.out.print("Ace");
                break;
            }
            case 11: {
                System.out.print("Jack");
                break;
            }
            case 12: {
                System.out.print("Queen");
                break;
            }
            case 13: {
                System.out.print("King");
                break;
            }
        }
        String[] suits = new String[4];
        suits[0] = "Clubs";
        suits[1] = "Diamonds";
        suits[2] = "Hearts";
        suits[3] = "Spades";
        System.out.println(" of "+ suits[suitIndex]);
    }
}
