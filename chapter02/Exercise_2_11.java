package com.company;
import java.util.Scanner;

public class Exercise_2_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of years: ");
        int years = input.nextInt();
        int population = 312032486;
        int seconds = years*365*24*60*60;
        int numberOfBorn = (int) (seconds*1.0/7);
        int numberOfDeath = (int) (seconds*1.0/13);
        int numboerOfImmigrants = (int) (seconds*1.0/45);
        int increasedPopulation =  numberOfBorn - numberOfDeath + numboerOfImmigrants;
        int result =  increasedPopulation + population;
        System.out.println("The population for the next " + years + " years is " + result);
    }
}
