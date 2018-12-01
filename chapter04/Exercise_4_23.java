package com.company;
import java.util.Scanner;

public class Exercise_4_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee's name: ");
        String name = input.nextLine();
        System.out.print("Enter number of hours worked in a week: ");
        double hours = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double payRate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double federalTaxRate = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double stateTaxRate = input.nextDouble();
        double federalTax = (int)(hours * payRate * federalTaxRate*100)/100.0;
        double stateTax = (int)(hours * payRate * stateTaxRate*100)/100.0;
        double netPay = payRate*hours - federalTax - stateTax;
        // display wage statement
        System.out.println("Employee Name: " + name);
        System.out.printf("Hours Worked: %.1f\n", hours);
        System.out.printf("Pay Rate: $%.2f\n", payRate);
        System.out.printf("Gross Pay: $%.2f\n", payRate*hours);
        System.out.println("Deductions:");

        System.out.printf("  Federal Withholding (%.1f%%): $%.2f\n",
                federalTaxRate * 100, federalTax);
        System.out.printf("  State Withholding (%.1f%%): $%.2f\n",
                stateTaxRate * 100, stateTax);
        System.out.printf("  Total Deduction: $%.2f\n", federalTax + stateTax);
        System.out.printf("Net Pay: $%.2f", netPay);

    }
}
