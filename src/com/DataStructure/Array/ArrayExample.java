package com.DataStructure.Array;

import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {

        int[] arrayElement = new int[5];

        System.out.println("Enter array Elements :: ");
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < arrayElement.length; i++) {
            System.out.print(" Element " + (i + 1) + " :: ");

            arrayElement[i] = in.nextInt();

        }

        System.out.println("Array List :: ");
        for (int i = 0; i < arrayElement.length; i++)
            System.out.print(arrayElement[i] + " ");
    }
}
