package com.company;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercise_7_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter scores (the input ends if it is negative): ");
        int score = input.nextInt();
        // create a array lsit
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(score >=0) {
            list.add(score);
            score = input.nextInt();
        }
        // get average score
        double average = averageScore(list);
        int countAboveAverage = 0;
        int countBelowAverage = 0;
        for(int n: list) {
            if (n >= average)
                countAboveAverage++;
            else
                countBelowAverage++;
        }
        System.out.printf("The are %d scores equal or greater than average\n", countAboveAverage);
        System.out.printf("The are %d scores less than average\n", countBelowAverage);
    }
    public static double averageScore(ArrayList<Integer> list) {
        double sum = 0;
        for(int score: list)
            sum += score;
        return sum / list.size();
    }
}
