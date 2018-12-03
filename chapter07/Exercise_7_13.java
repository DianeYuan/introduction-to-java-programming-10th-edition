package com.company;
import java.util.Arrays;

public class Exercise_7_13 {
    public static void main(String[] args) {
        System.out.println(getRandom(1,3,5,7,9,11));
    }
    public static int getRandom(int... numbers) {
        int random = (int)(Math.random()*54) + 1;
        while(Arrays.asList(numbers).contains(random)) {
            // keep generating random number
            random = (int)(Math.random()*54) + 1;
        }
        return random;
    }
}
