package com.company;

import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here

        System.out.println("================================================================");
        System.out.println("========    Reverse Array   =========");
        System.out.println(">>  Please Enter how many element you want in your Array :");
        int end = sc.nextInt();

        int[] arr = new int[end];

        System.out.println(">>  Enter the elements of the array...");
        for (int i=0; i<end; i++) {
            arr[i] = sc.nextInt();
        }
        Array.ReverseArray(arr,0,end-1);
        System.out.println("================================================================");
    }
}
