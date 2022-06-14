package com.company;
import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code here

        System.out.println("================================================================");
        System.out.println("========    Sort Array with only 0,1,2 in Array [ Dutch National Flag Algorithm ]   =========");
        System.out.println(">>  Please Enter how many element you want in Array :");
        int end = sc.nextInt();
        sc.nextLine();

        int[] arr = new int[end];

        System.out.println(">>  Enter the elements [only -> 0 / 1 / 2] in the array...");
        for (int i=0; i<end; i++) {
            arr[i] = sc.nextInt();
        }
        Array.sortArray012(arr);
        System.out.println("================================================================");

    }
}
