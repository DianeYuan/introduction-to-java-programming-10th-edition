package com.company;

public class Exercise_7_29  {
    public static void main(String[] args) {
        int[] cards = pickCards();
        int count = 1;
        while(getSum(cards) != 24) {
            cards = pickCards();
            count++;
        }
        System.out.printf("It takes %d time to get sum of 24\n", count);

    }
    public static int[] pickCards() {
        // generate 4 random numbers
        int[] cards = new int[4];
        for(int i=0; i< cards.length; i++)
            cards[i] = (int)(Math.random()*13) + 1;
        return cards;
    }
    public static int getSum(int[] list) {
        int sum = 0;
        for(int n: list)
            sum += n;
        return sum;
    }
}
