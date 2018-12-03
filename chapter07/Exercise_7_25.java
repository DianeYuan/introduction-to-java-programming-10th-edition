package com.company;

import java.util.Scanner;

public class Exercise_7_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] eqn = getInput(input);
        double[] roots = new double[2];

        int numOfRoots = solveQuadratic(eqn, roots);

        printRoots(roots, numOfRoots);
    }

    public static void printRoots(double[] roots, int numOfRoots) {
        StringBuilder s = new StringBuilder();
        if (numOfRoots == 0) {
            s.append("No real roots.");
        } else {
            for (int i = 0; i < numOfRoots; i++) {
                s.append("Root " + (i + 1) + ": " + roots[i]);
            }
        }
        System.out.println(s);
    }

    public static double[] getInput(Scanner input) {
        System.out.print("Enter a, b, c: ");
        double[] eqn = new double[3];
        for (int i = 0; i < eqn.length; i++) {
            eqn[i] = input.nextDouble();
        }
        return eqn;
    }

    public static int solveQuadratic(double[] eqn, double[] roots) {
        int numOfRoots = 0;
        double a = eqn[0];
        double b = eqn[1];
        double c = eqn[2];
        double discriminant = (b * b) - (4 * a * c);

        if (discriminant > 0) {
            roots[0] = (-b + Math.sqrt(discriminant)) / (2 * a);
            roots[1] = (-b - Math.sqrt(discriminant)) / (2 * a);
            numOfRoots = 2;
        }

        if (discriminant == 0) {
            roots[0] = (-b + Math.sqrt(discriminant)) / (2 * a);
            numOfRoots = 1;
        }

        return numOfRoots;
    }
}
