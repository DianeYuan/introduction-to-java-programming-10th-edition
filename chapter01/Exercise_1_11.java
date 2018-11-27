package com.company;

public class Exercise_1_11 {
    public static void main(String[] args) {
        for(int i=1; i <= 5;i++) {
            int population = 312032486;
            int seconds = i*365*24*60*60;
            int numberOfBorn = (int) (seconds*1.0/7);
            int numberOfDeath = (int) (seconds*1.0/13);
            int numboerOfImmigrants = (int) (seconds*1.0/45);
            int increasedPopulation =  numberOfBorn - numberOfDeath + numboerOfImmigrants;
            int result =  increasedPopulation + population;
            System.out.println("The population for the next " + i + " years is " + result);

        }
    }
}
