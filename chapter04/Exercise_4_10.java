package com.company;
import java.util.Scanner;

public class Exercise_4_10 {
    public static void main(String[] args) {
        int day = 0;
        Scanner input = new Scanner(System.in);
        // prompt the user to answer questions
        System.out.println("Is your birthday in Set1?");
        // print set1
        System.out.printf("%2d %2d %2d %2d\n",1,3,5,7);
        System.out.printf("%2d %2d %2d %2d\n",9,11,13,15);
        System.out.printf("%2d %2d %2d %2d\n",17,19,21,23);
        System.out.printf("%2d %2d %2d %2d\n",25,27,29,31);
        System.out.println("Enter N for No and Y for Yes: ");
        String s = input.nextLine();
        char answer = s.charAt(0);
        if (answer == 'Y')
            day += 1;
        // prompt the user to answer questions
        System.out.println("Is your birthday in Set2?");
        // print set2
        System.out.printf("%2d %2d %2d %2d\n",2,3,6,7);
        System.out.printf("%2d %2d %2d %2d\n",10,11,14,15);
        System.out.printf("%2d %2d %2d %2d\n",18,19,22,23);
        System.out.printf("%2d %2d %2d %2d\n",26,27,30,31);
        System.out.println("Enter N for No and Y for Yes: ");
        s = input.nextLine();
        answer = s.charAt(0);
        if (answer == 'Y')
            day += 2;
        // prompt the user to answer questions
        System.out.println("Is your birthday in Set3?");
        // print set3
        System.out.printf("%2d %2d %2d %2d\n",4,5,6,7);
        System.out.printf("%2d %2d %2d %2d\n",12,13,14,15);
        System.out.printf("%2d %2d %2d %2d\n",20,21,22,23);
        System.out.printf("%2d %2d %2d %2d\n",28,29,30,31);
        System.out.println("Enter N for No and Y for Yes: ");
        s = input.nextLine();
        answer = s.charAt(0);
        if (answer == 'Y')
            day += 4;
        // prompt the user to answer questions
        System.out.println("Is your birthday in Set4?");
        // print set4
        System.out.printf("%2d %2d %2d %2d\n",8,9,10,11);
        System.out.printf("%2d %2d %2d %2d\n",12,13,14,15);
        System.out.printf("%2d %2d %2d %2d\n",24,25,26,27);
        System.out.printf("%2d %2d %2d %2d\n",28,29,30,31);
        System.out.println("Enter N for No and Y for Yes: ");
        s = input.nextLine();
        answer = s.charAt(0);
        if (answer == 'Y')
            day += 8;
        // prompt the user to answer questions
        System.out.println("Is your birthday in Set5?");
        // print set5
        System.out.printf("%2d %2d %2d %2d\n",16,17,18,19);
        System.out.printf("%2d %2d %2d %2d\n",20,21,22,23);
        System.out.printf("%2d %2d %2d %2d\n",24,25,26,27);
        System.out.printf("%2d %2d %2d %2d\n",28,29,30,31);
        System.out.println("Enter N for No and Y for Yes: ");
        s = input.nextLine();
        answer = s.charAt(0);
        if (answer == 'Y')
            day += 16;
        System.out.printf("Your birthday is %d !\n", day);

    }
}
