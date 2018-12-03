package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise_7_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 integers: ");
        int[] list = new int[10];
        for(int i=0; i < 10; i++)
            list[i] = input.nextInt();
        // display result
        System.out.print("The distinct numbers are");
        int[] uniques = eliminateDuplicates(list);
        for(int n: uniques)
            System.out.print(n+ " ");
    }
    public static int[] eliminateDuplicates(int[] list) {
        int[] uniques = new int[list.length];
        // get the current index
        int countIndex = 0;
        for(int i=0; i<list.length; i++) {
            boolean isUnique = true;
            // check if uniques already have the element
            for(int j=0; j<= countIndex; j++) {
                if(uniques[j] == list[i]) {
                    isUnique = false;
                    break;
                }
            }
            if(isUnique){
                uniques[countIndex] = list[i];
                countIndex++;
            }
        }
        return Arrays.copyOf(uniques, countIndex);
    }
}
