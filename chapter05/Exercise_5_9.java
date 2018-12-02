package com.company;
import java.util.Scanner;

public class Exercise_5_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int number = input.nextInt();
        String topStudent1 = "";
        String topStudent2 = "";
        int topScore1 = 0;

        for(int i = 0; i< number; i++) {
            System.out.print("Enter the student name and score, (for example: John 60): ");
            String name = input.next();
            int score = input.nextInt();
            if (score > topScore1) {
                topScore1 = score;
                topStudent2 = topStudent1;
                topStudent1 = name;
            }
        }
        System.out.println("The student with highest score is " + topStudent1);
        System.out.println("The student with second highest score is " + topStudent2);
    }
}
