package com.company;

public class Exercise_5_40 {
    public static void main(String[] args) {
        int head = 0, tail = 0;
        for(int i=0; i<=1000000; i++) {
            int coin = (int)(Math.random()*2);
            if (coin==0)
                head++;
            else
                tail++;
        }
        System.out.printf("head: %d times\ntail: %d times", head,tail);
    }
}
