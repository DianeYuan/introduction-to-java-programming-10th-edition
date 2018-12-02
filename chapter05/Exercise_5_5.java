package com.company;

public class Exercise_5_5 {
    public static void main(String[] args) {
        System.out.printf("%-6s %6s    %-6s %6s\n","kg", "pound", "pound","kg");
        for(int i = 1; i <= 100; i++){
            System.out.printf("%-6d %6.1f    %-6d %6.2f\n",2*i-1, (2*i-1)*2.2, 15+5*i,(15+5*i)/2.2);
        }
    }
}
