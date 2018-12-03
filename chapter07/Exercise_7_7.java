package com.company;

public class Exercise_7_7 {
    public static void main(String[] args) {
        // create a list
        int[] list = {0,0,0,0,0,0,0,0,0,0};
        // generate 100 random digit
        for(int i=0; i<100; i++) {
            int n = (int)(Math.random()*10);
            list[n]++;
        }
        for(int j=0; j<10; j++) {
            if(list[j] > 0)
                System.out.printf("%d occurs %d %s\n", j, list[j], list[j]>1 ? "times":"time");
        }
    }
}
