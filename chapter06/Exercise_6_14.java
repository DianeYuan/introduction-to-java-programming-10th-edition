package com.company;

public class Exercise_6_14 {
    public static void main(String[] args) {
        // print heading
        System.out.printf("%-6s%8s\n", "i", "m(i)");
        System.out.println("---------------");
        // print body
        for (int i=1; i<= 901; i +=100) {
            System.out.printf("%-6d%8.4f\n", i, m(i));
        }
    }
    public static double m(int i) {
        double pi = 0;
        for(int n = 1; n<= i; n++)
            pi += Math.pow(-1, n+1)/(2*n-1);
        return 4*pi;
    }
}
