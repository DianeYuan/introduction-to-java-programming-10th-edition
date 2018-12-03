package com.company;

public class Exercise_6_13 {
    public static void main(String[] args) {
        // print heading
        System.out.printf("%-4s%8s\n", "i", "m(i)");
        System.out.println("------------");
        // print body
        for (int i=1; i<= 20; i++) {
            System.out.printf("%-4d%8.4f\n", i, m(i));
        }
    }
    public static double m(int i) {
        double sum = 0;
        for(int n=1; n<=i; n++) {
            sum += 1.0 * n / (n+1);
        }
        return sum;
    }
}
