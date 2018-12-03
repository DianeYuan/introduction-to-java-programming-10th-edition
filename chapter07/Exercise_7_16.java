package com.company;

public class Exercise_7_16 {
    public static void main(String[] args) {
        // generate random numbers and key
        final int length = 100000;
        int[] list = new int[length];
        for(int i = 0; i< length; i++)
            list[i] = (int)(Math.random()*length);
        int key = (int)(Math.random()*length);
        // record time
        long startTime = System.currentTimeMillis();
        // perform the task
        int index = linearSearch(list, key);
        long endTime = System.currentTimeMillis();
        long executionTime = endTime - startTime;
        System.out.println("The index is "+ index);
        System.out.printf("It takes %d milliseconds to perform the task", executionTime);
    }
    public static int linearSearch(int[] list, int key) {
        for(int i=0; i< list.length; i++) {
            if(key == list[i])
                return i;
        }
        return -1;
    }
}
