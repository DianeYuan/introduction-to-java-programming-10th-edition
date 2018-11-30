package com.company;
import java.util.Scanner;

public class Exercise_3_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
        double r1_x = input.nextDouble();
        double r1_y = input.nextDouble();
        double r1_width = input.nextDouble();
        double r1_height = input.nextDouble();
        System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
        double r2_x = input.nextDouble();
        double r2_y = input.nextDouble();
        double r2_width = input.nextDouble();
        double r2_height = input.nextDouble();
        // compute the edges
        double r1_left_edge = r1_x - r1_width / 2;
        double r1_right_edge = r1_x + r1_width / 2;
        double r1_up_edge = r1_y + r1_height / 2;
        double r1_down_edge = r1_y - r1_height / 2;

        double r2_left_edge = r2_x - r2_width / 2;
        double r2_right_edge = r2_x + r2_width / 2;
        double r2_up_edge = r2_y + r2_height / 2;
        double r2_down_edge = r2_y - r2_height / 2;
        // when r2 is inside r1
        if (r2_left_edge >= r1_left_edge && r2_right_edge <= r1_right_edge &&
                r2_down_edge >= r1_down_edge && r2_up_edge <= r1_up_edge)
            System.out.println("r2 is inside r1");
            // when r2 is outside r1
        else if (Math.abs(r2_x - r1_x) > r1_width / 2 + r2_width / 2 || Math.abs(r2_y - r1_y) > r1_height / 2 + r2_height / 2)
            System.out.println("r2 does not overlap r1");
        else
            System.out.println("r2 overlaps r1");
    }
}
