package com.company;
import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // write your code here
        System.out.println("================================================================");
        System.out.println("========    Kth Minimum & Maximum Element in Array    =========");
        System.out.println(">>  Please Enter how many element you want in Array :");
        int end = sc.nextInt();
        System.out.println(">> Enter -> kth term <- to obtain kth term's min and max element from Array:");
        int k = sc.nextInt();
        sc.nextLine();

        int[] arr = new int[end];

        System.out.println(">>  Enter the elements of the array...");
        for (int i=0; i<end; i++) {
            arr[i] = sc.nextInt();
        }
        Array.kthMinElement(arr,k);
        System.out.println("================================================================");

    }
}
