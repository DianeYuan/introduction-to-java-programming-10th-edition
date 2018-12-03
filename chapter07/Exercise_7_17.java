package com.company;
import java.util.*;

public class Exercise_7_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int length = input.nextInt();
        System.out.print("Enter students' names: ");
        String[] names = new String[length];
        for(int i = 0; i<length; i++)
            names[i] = input.next();
        System.out.print("Enter students' scores: ");
        int[] scores = new int[length];
        for(int j=0; j< length; j++)
            scores[j] = input.nextInt();
        printReverseOrder(names, scores);
    }
    /* prints student names in decreasing order of their scores */
    public static void printReverseOrder(String[] names, int[] scores) {
        // sort scores in ascending order
        int[] sortedScores = Arrays.copyOf(scores,scores.length);
        Arrays.sort(sortedScores);

        // read scores reversely and get the index of the students and print the name
        for(int i= sortedScores.length-1; i >= 0; i--) {
            int score = sortedScores[i];
            // ge the index of the score in scores list
            int index = linearSearch(scores, score);
            System.out.print(names[index] + " ");
        }
    }
    public static int linearSearch(int[] list, int key) {
        for(int i=0; i< list.length; i++) {
            if(key == list[i])
                return i;
        }
        return -1;
    }
}
