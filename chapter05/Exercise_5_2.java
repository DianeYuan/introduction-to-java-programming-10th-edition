package com.company;
import java.util.Scanner;

public class Exercise_5_2 {
    public static void main(String[] args) {
        final int NUMBER_OF_QUESTIONS = 10;
        int correctCount = 0;
        int count = 0;
        long startTime = System.currentTimeMillis();
        String output = " ";
        Scanner input = new Scanner(System.in);

        while (count < NUMBER_OF_QUESTIONS) {
            // generate two random integers
            int number1 = (int)(Math.random()*15) + 1;
            int number2 = (int)(Math.random()*15) + 1;

            // prompt to answer questions
            System.out.print("what is " + number1 + " + "+ number2 + "? ");
            int answer = input.nextInt();

            // grade the answer and display the result
            if (number1 + number2 == answer) {
                System.out.println("You are correct!");
                correctCount++;
            }
            else
                System.out.printf("Your answer is wrong\n"+
                        "%d + %d should be %d\n", number1,number2,(number1+number2));
            count++;
            output += "\n" + number1 + " + " + number2 + " = " + answer + " " +
                    ((number1 + number2 == answer)? "correct" : "wrong");
        }
        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;
        System.out.printf("\nCorrect count is %d\nTest time is %d seconds\n",correctCount, testTime/1000);
        System.out.println(output);
    }
}
