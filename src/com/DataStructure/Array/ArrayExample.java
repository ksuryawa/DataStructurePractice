package com.DataStructure.Array;

import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        int[] priceOfPen= new int[5];
        Scanner in=new Scanner(System.in);
        for(int i=0;i<priceOfPen.length;i++)
            priceOfPen[i]=in.nextInt();

        for(int i=0;i<priceOfPen.length;i++)
            System.out.print(priceOfPen[i]+" ");
    }
}
