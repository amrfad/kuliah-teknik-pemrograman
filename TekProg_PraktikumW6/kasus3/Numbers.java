package kasus3;

import java.util.Scanner;

public class Numbers {
    // ------------------------------------
    // Read in an array of integers, and
    // print them in sorted order.
    // ------------------------------------
    public static void main(String[] args) {
        Integer[] intList; // int to Integer
        int size;

        Scanner sc = new Scanner(System.in);
        System.out.print("\nHow many integers do you want to sort? ");
        size = sc.nextInt();
        intList = new Integer[size];

        System.out.println("\nEnter the numbers...");
        for (int i = 0; i < size; i++)
            intList[i] = sc.nextInt();

        // Sorting.selectionSort(intList);
        Sorting.insertionSort(intList);
        System.out.println("\nYour numbers in sorted order...");
        for (int i = 0; i < size; i++)
            System.out.print(intList[i] + " ");
        System.out.println();

        sc.close();
    }
}
