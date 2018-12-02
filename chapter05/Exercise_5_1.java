package com.company;
import java.util.Scanner;

public class Exercise_5_1 {
    public static void main(String[] args) {
        int data;
        int sum = 0, numberOfPositives = 0, numberOfNegatives = 0;
        double average = 0;
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter an integer, the input ends if it is 0: ");
        // keep reading data until the input is 0
        do {
            data = input.nextInt();
            if (data > 0)
                numberOfPositives += 1;
            else if (data < 0)
                numberOfNegatives += 1;
            sum += data;
        } while (data != 0);

        if (numberOfPositives + numberOfNegatives == 0) {
            System.out.println("No numbers are entered except 0");
        }
        else {
            average = sum*1.0 / (numberOfPositives + numberOfNegatives);
            System.out.println("The number of positives is " + numberOfPositives);
            System.out.println("The number of negatives is " + numberOfNegatives);
            System.out.println("The total is " + sum);
            System.out.println("The average is " + average);
        }
    }
}
