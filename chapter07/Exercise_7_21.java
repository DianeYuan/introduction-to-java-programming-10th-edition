package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise_7_21  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of balls to drop: ");
        int numberOfBalls = input.nextInt();
        System.out.print("Enter the number of slots in the bean machine: ");
        int numberOfSlots = input.nextInt();
        // initiate the slots list
        int[] slots = new int[numberOfSlots];
        for(int i=0; i< numberOfSlots; i++)
            slots[i] = 0;
        for(int j=0; j< numberOfBalls; j++) {
            String path = getPath(numberOfSlots);
            int position = positionOfSlot(path);
            slots[position] += 1;
            // print the path of the ball
            System.out.println(path);
        }
        // display the final buildup of the balls in the slots in a histogram
        System.out.println(Arrays.toString(slots));
        displayHistogram(slots);

    }
    public static String getPath(int numberofSlots) {
        String[] direction = {"L","R"};
        int index;
        String path = "";
        for(int i=1; i< numberofSlots; i++) {
            // get a random direction
            index = (int)(Math.random()*2);
            path += direction[index];
        }
        return path;
    }
    public static int positionOfSlot(String path) {
        // count the number of Rs to get the position
        int countR = 0;
        for(int i=0; i< path.length(); i++) {
            if(path.charAt(i) == 'R')
                countR++;
        }
        return countR;
    }
    public static void displayHistogram(int[] slots) {
        String emptySlotsString = "";
        for (int i = 0; i < slots.length; i++) {
            emptySlotsString += "*";
        }
        for (int i = slots.length - 1; i > 0; i--) {
            String output = "";
            for (int j = 0; j < slots.length; j++) {
                if (slots[j] == i) {
                    output += "O";
                    slots[j]--;
                } else {
                    output += "*";
                }
            }
            if (!output.equals(emptySlotsString)) {
                System.out.println(output);
            }
        }

    }
}
