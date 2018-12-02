package com.company;

public class Exercise_5_33 {
    public static void main(String[] args) {
        for (int number= 2; number<=10000; number++) {
            int sum = 0;
            // check if it is a complete number
            int root = (int)Math.sqrt(number);
            for (int divider = 1; divider <= root; divider++) {
                if (number%divider == 0) {
                    sum += divider;
                    sum += number/divider;
                }
            }
            sum -= number;
            if (sum == number)
                System.out.print(number+ " ");
        }
    }
}
