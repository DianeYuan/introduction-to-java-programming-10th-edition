package com.company;

public class Exercise_5_7 {
    public static void main(String[] args) {
        double tuition = 10000;
        tuition = tuition * Math.pow(1.05, 10);
        System.out.printf("Tuition will be $%.2f in 10 years\n", tuition);
        double sum = 0;
        for(int i= 0; i<4; i++) {
            sum += tuition;
            tuition = tuition * 1.05;
        }
        System.out.printf("The total tuition will be $%.2f\n", sum);
    }
}
