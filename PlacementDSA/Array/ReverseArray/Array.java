package com.company;

import java.util.Arrays;

public class Array {


    public static void ReverseArray(int arr[], int start, int end) {
        System.out.println(">> Input Array is : " + Arrays.toString(arr));
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(">> Reversed Array is : " + Arrays.toString(arr));
    }
}
