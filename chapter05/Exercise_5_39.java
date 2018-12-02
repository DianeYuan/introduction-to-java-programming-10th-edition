package com.company;

public class Exercise_5_39 {
    public static void main(String[] args) {
        // Create a consstant value for commmission sought
        final double COMMISSION_SOUGHT = 2700;
        double commission = 0, sale = 0;
        do {
            sale += 0.01;
            if (sale <=5000) {
                commission = sale*0.08;
            }
            else if (sale <= 10000) {
                commission = 5000*0.08 + (sale-5000)*0.1;
            }
            else
                commission = 5000*0.08 + 5000*0.1 + (sale-10000)*0.12;

        } while (commission < COMMISSION_SOUGHT);

        // Display results
        System.out.printf("Minimum sales to earn $%.2f: $%.2f\n",COMMISSION_SOUGHT, sale);
    }
}
