package kasus3;

import java.util.Scanner;

public class Strings {
    // ------------------------------------
    // Read in an array of Strings, and
    // print them in sorted order.
    // ------------------------------------
    public static void main(String[] args) {
        String[] strList;
        int size;

        Scanner sc = new Scanner(System.in);
        System.out.print("\nHow many Strings do you want to sort? ");
        size = sc.nextInt();
        strList = new String[size];

        sc.nextLine(); // buang string lebih
        System.out.println("\nEnter the Strings...");
        for (int i = 0; i < size; i++) {
            strList[i] = sc.nextLine();
        }

        // Sorting.selectionSort(strList);
        Sorting.insertionSort(strList);
        System.out.println("\nYour Strings in sorted order...");
        for (int i = 0; i < size; i++)
            System.out.print(strList[i] + " ");
        System.out.println();

        sc.close();
    }
}
