package com.company;
import java.util.Scanner;

public class Exercise_5_44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        short integer = input.nextShort();
        String bits = "";
        for (int i = 1; i < 16; i++) {
            bits = (integer & 1) + bits;
            integer >>= 1;
        }
        System.out.println("The bits are "+bits);
    }
}
