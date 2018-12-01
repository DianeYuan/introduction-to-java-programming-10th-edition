package com.company;

public class Exercise_4_3 {
    public static void main(String[] args) {
        // latitude and longitude of Atlanta
        double x1 = 33.7489954;
        double y1 = -84.3879824;
        // latitude and longitude of Charlotte
        double x2 = 35.2270869;
        double y2 = -80.8431267;
        // latitude and longitude of Savannah
        double x3 = 32.0835407;
        double y3 = -81.0998342;
        // latitude and longitude of Orlando
        double x4 = 28.5383355;
        double y4 = -81.3792365;
        // compute distance between two points
        double r = 6371.01;
        double side1 = r * Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2)) +
                Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(y1 - y2)));
        double side2 = r * Math.acos(Math.sin(Math.toRadians(x2)) * Math.sin(Math.toRadians(x3)) +
                Math.cos(Math.toRadians(x2)) * Math.cos(Math.toRadians(x3)) * Math.cos(Math.toRadians(y2 - y3)));
        double side3 = r * Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x3)) +
                Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x3)) * Math.cos(Math.toRadians(y1 - y3)));
        double side4 = r * Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x4)) +
                Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x4)) * Math.cos(Math.toRadians(y1 - y4)));
        double side5 = r * Math.acos(Math.sin(Math.toRadians(x3)) * Math.sin(Math.toRadians(x4)) +
                Math.cos(Math.toRadians(x3)) * Math.cos(Math.toRadians(x4)) * Math.cos(Math.toRadians(y3 - y4)));
        // compute the area of two triangles
        // triangle with side1, side2, side3
        double s1 = (side1 + side2 + side3)/2;
        double area1 = Math.pow(s1*(s1-side1)*(s1-side2)*(s1-side3), 0.5);
        // triangle with side3, side4, side5
        double s2 = (side3 + side4 + side5)/2;
        double area2 = Math.pow(s2*(s2-side3)*(s2-side4)*(s2-side5), 0.5);
        double totalArea = area1 + area2;
        System.out.println("The area among 4 cities is " + totalArea + " square kms");
        }
}

