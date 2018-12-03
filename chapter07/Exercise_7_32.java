package com.company;
import java.util.Scanner;

public class Exercise_7_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list1: ");
        int length = input.nextInt();
        int[] list = new int[length];
        for (int i = 0; i < length; i++)
            list[i] = input.nextInt();
        System.out.print("After the partition, the list is ");
        partition(list);

    }
    public static int partition(int[] list) {
        int[] partitionedList = new int[list.length];
        int pivot = list[0];
        int pivotIndex = 0;

        int leftMarker = 0;
        int rightMarker = list.length - 1;
        int listMarker = 1;

        while (leftMarker <= rightMarker) {
            if (leftMarker == rightMarker) {
                partitionedList[leftMarker] = pivot;
                leftMarker++;
                rightMarker--;
            } else if (list[listMarker] <= pivot) {
                partitionedList[leftMarker] = list[listMarker];
                leftMarker++;
            } else {
                partitionedList[rightMarker] = list[listMarker];
                rightMarker--;
            }
            listMarker++;
        }
        display(partitionedList);
        return pivotIndex;
    }
    public static void display(int[] list) {
        System.out.print("The merged list is ");
        for(int n: list)
            System.out.print(n+ " ");
    }
}
