package com.company;
import java.util.Scanner;

public class Exercise_3_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double rate = input.nextDouble();
        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        int convert = input.nextInt();
        if (convert == 0) {
            System.out.print("Enter the dollar amount: ");
            double dollar = input.nextDouble();
            double yuan = dollar*rate;
            System.out.println("$" + dollar + " is "+ yuan + " yuan");
        }
        else if (convert == 1){
            System.out.print("Enter the RMB amount: ");
            double yuan = input.nextDouble();
            double dollar = yuan/rate;
            System.out.println(yuan + " yuan is $"+ dollar);
        }
        else
            System.out.print("Incorrect input");
    }
}
