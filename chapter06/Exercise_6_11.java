package com.company;

public class Exercise_6_11 {
    public static void main(String[] args) {
        // print heading
        System.out.printf("%-10s%12s\n", "Total Sales", "Commission");
        System.out.println("-------------------------");
        // print body
        for (int sales = 10000; sales <= 100000; sales += 5000) {
            System.out.printf("%-10d%12.1f\n", sales, computeCommission(sales));
        }
    }
    public static double computeCommission(double salesAmount) {
        return 5000*0.08 + 5000*0.1 + (salesAmount - 10000) * 0.12;
    }
}
