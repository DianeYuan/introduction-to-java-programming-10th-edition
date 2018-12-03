package com.company;
import java.util.Scanner;

public class Exercise_7_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int length = input.nextInt();
        double[] scores = new double[length];
        double best = 0;
        System.out.printf("Enter %d scores: ", length);
        // read 4 scores
        for(int i = 0; i<length; i++) {
            scores[i] = input.nextDouble();
            if(scores[i] > best)
                best = scores[i];
        }
        // display result
        for(int j = 0; j<length;j++)
            System.out.printf("Student %d score is %.0f and grade is %c\n",
                    j, scores[j], grade(scores[j], best));
    }
    public static char grade(double score, double best) {
        if(score >= best - 10)
            return 'A';
        else if(score >= best - 20)
            return 'B';
        else if(score >= best - 30)
            return 'C';
        else if(score >= best - 40)
            return 'D';
        else
            return 'F';
    }
}
