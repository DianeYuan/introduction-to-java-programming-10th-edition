package com.company;
import java.util.Scanner;

public class Exercise_5_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two positive integers: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int d = Math.min(n1, n2);
        while (d >= 1){
            if(n1%d==0 && n2%d==0)
                break;
            else
                d--;
        }
        System.out.printf("The great common divisor for %d and %d is %d\n", n1, n2, d);
    }
}
