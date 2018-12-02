package com.company;
import java.util.Scanner;

public class Exercise_5_42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the commission sought: ");
        // Create a consstant value for commmission sought
        final double COMMISSION_SOUGHT = input.nextDouble()-5000;
        double commission = 0, sale;
        for(sale = 0; commission < COMMISSION_SOUGHT; sale +=0.01) {

            if (sale <=5000) {
                commission = sale*0.08;
            }
            else if (sale <= 10000) {
                commission = 5000*0.08 + (sale-5000)*0.1;
            }
            else
                commission = 5000*0.08 + 5000*0.1 + (sale-10000)*0.12;

        }

        // Display results
        System.out.printf("Minimum sales to earn $%f: $%.2f\n", COMMISSION_SOUGHT, (sale-0.01));
    }
}
