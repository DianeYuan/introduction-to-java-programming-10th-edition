package com.company;

public class Exercise_6_15 {
    public static void main(String[] args) {
        // print heading
        System.out.printf("%-18s%-10s%-18s%-18s%-18s\n", "Taxable Income", "Single",
                "Married Joint", "Married Separate", "Head of a House");
        System.out.println("---------------------------------------------------------------------------------");
        // print body
        for (int income = 50000; income<= 60000; income += 50) {
            System.out.printf("%-18d%-10d%-18d%-18d%-18d\n", income, Math.round(computeTax(0, income)),
                    Math.round(computeTax(1, income)),Math.round(computeTax(2, income)),
                    Math.round(computeTax(3, income)));
        }
    }
    public static double computeTax(int status, double taxableIncome) {
        double tax = 0;
        if (status == 0 || status == 2)
            tax = 8350*0.10 + (33950-8350)*0.15 + (taxableIncome - 33950)*0.25;
        else if (status == 1)
            tax = 16700*0.10 + (taxableIncome - 16700)*0.15;
        else if (status == 3)
            tax = 11950*0.10 + (45500-11950)*0.15 + (taxableIncome - 45500)*0.25;
        return tax;
    }
}
