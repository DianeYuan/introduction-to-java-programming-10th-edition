package com.company;
import java.util.Scanner;

public class Exercise_3_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight and price for package 1: ");
        double weight1 = input.nextDouble();
        double price1 = input.nextDouble();
        double priceByWeight1 = price1 / weight1;
        System.out.print("Enter weight and price for package 2: ");
        double weight2 = input.nextDouble();
        double price2 = input.nextDouble();
        double priceByWeight2 = price2 / weight2;
        if (priceByWeight1 > priceByWeight2)
            System.out.println("Package 2 has a better price");
        else if (priceByWeight1 == priceByWeight2)
            System.out.println("Two packages have the same price");
        else
            System.out.println("Package 1 has a better price");
    }
}
