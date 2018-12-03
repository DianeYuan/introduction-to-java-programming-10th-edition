package com.company;

public class Exercise_6_9 {
    public static void main(String[] args) {
        // print heading
        System.out.printf("%-8s%-8s%-8s%-8s\n", "foot", "meter", "meter", "foot");
        System.out.println("----------------------------------");
        for (int foot = 1, meter = 20; foot <= 10; foot++, meter += 5) {
            System.out.printf("%-8.1f%-8.3f%-8.1f%-8.3f\n",
                    foot*1.0,footToMeter(foot*1.0), meter*1.0, meterToFoot(meter*1.0));
        }
    }
    public static double footToMeter(double foot) {
        return 0.305*foot;
    }
    public static double meterToFoot(double meter) {
        return 3.27869*meter;
    }
}
