package com.company;

public class Exercise_5_26 {
    public static void main(String[] args) {
        for (int i = 10000; i <= 100000; i += 10000) {
            //compute e
            double e = 1;
            double item = 1;
            for (int n=1; n<=i; n++) {
                item = item/n;
                e += item;
            }
            System.out.printf("when i = %d, e = %f\n", i, e);
        }
    }
}
