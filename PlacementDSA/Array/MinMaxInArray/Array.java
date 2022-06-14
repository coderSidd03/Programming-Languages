package com.company;

import java.util.Arrays;

public class Array {

    public static void MinMaxElementArray(int[] arr) {
        System.out.println(">> Input Array is : " + Arrays.toString(arr));
        int min = arr[0];
        int max = arr[1];
        if (arr.length == 1) {
            System.out.println(">> One element in array: \n>> Min element: " + arr[0] + "\n>> Max element: " + arr[0]);
        } else {
            if (arr[0] > arr[1]) {
                max = arr[0];
                min = arr[1];
            } else {
                max = arr[1];
                min = arr[0];
            }
            for (int i = 2; i < arr.length; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                }
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
        }
        System.out.println(">> Min element : " + min + "\n>> Max Element : " + max);
    }
}
