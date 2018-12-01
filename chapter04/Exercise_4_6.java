package com.company;

public class Exercise_4_6 {
    public static void main(String[] args) {
        // generate 3 points on the circle
        double a1 = Math.random()*2*Math.PI;
        double a2 = Math.random()*2*Math.PI;
        double a3 = Math.random()*2*Math.PI;
        // compute coordinates
        double r = 40;
        double x1 = r * Math.cos(a1);
        double y1 = r * Math.sin(a1);
        double x2 = r * Math.cos(a2);
        double y2 = r * Math.sin(a2);
        double x3 = r * Math.cos(a3);
        double y3 = r * Math.sin(a3);
        // compute 3 sides
        double a = Math.sqrt((x2-x3)*(x2-x3) + (y2-y3)*(y2-y3));
        double b = Math.sqrt((x1-x3)*(x1-x3) + (y1-y3)*(y1-y3));
        double c = Math.sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2));
        // compute 3 angles
        double A = Math.toDegrees(Math.acos((a*a - b*b - c*c) / (-2*b*c)));
        double B = Math.toDegrees(Math.acos((b*b - a*a - c*c) / (-2*a*c)));
        double C = Math.toDegrees(Math.acos((c*c - b*b - a*a) / (-2*a*b)));
        // display results
        System.out.printf("The three angles are %.2f %.2f %.2f\n", A, B, C);
    }
}
