package com.company;
import java.util.Scanner;

public class Exercise_3_14 {
    public static void main(String[] args) {
        // toss a coin
        int coin = (int) (Math.random()*2);
        Scanner input = new Scanner(System.in);
        System.out.print("Toss a coin. Enter 0 or 1 to guess: ");
        int guess = input.nextInt();
        boolean isTrue = (guess == coin);
        System.out.println("Your guess is " + isTrue);
    }
}
