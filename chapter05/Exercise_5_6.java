package com.company;

public class Exercise_5_6 {
    public static void main(String[] args) {
        System.out.printf("%-6s %-6s    %-6s %-6s\n","mile", "km", "km","mile");
        for(int i = 1; i <= 10; i++){
            System.out.printf("%-6d %-6.3f    %-6d %-6.3f\n",i, i*1.609, 15+5*i,(15+5*i)/1.609);
        }
    }
}
