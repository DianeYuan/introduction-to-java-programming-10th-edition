package com.company;
import java.util.Scanner;

public class Exercise_5_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int number = input.nextInt();
        String topStudent = "";
        int topScore = 0;

        for(int i = 0; i< number; i++) {
            System.out.print("Enter the student name and score, for example: John 60: ");
            String name = input.next();
            int score = input.nextInt();
            if (score > topScore) {
                topScore = score;
                topStudent = name;
            }
        }
        System.out.println("The student with highest score is " + topStudent);
    }
}
