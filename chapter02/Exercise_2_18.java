package com.company;
import java.util.Scanner;

public class Exercise_2_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("a  b  pow(a, b)");
        System.out.printf("%-3d%-3d%-3d%n", 1, 2, (int)Math.pow(1,2));
        System.out.printf("%-3d%-3d%-3d%n", 2, 3, (int)Math.pow(2,3));
        System.out.printf("%-3d%-3d%-3d%n", 3, 4, (int)Math.pow(3,4));
        System.out.printf("%-3d%-3d%-3d%n", 4, 5, (int)Math.pow(4,5));
        System.out.printf("%-3d%-3d%-3d%n", 5, 6, (int)Math.pow(5,6));

    }
}
