package com.company;

import java.util.Arrays;

public class Array {
  public static void negElementsThenPositive(int[] arr) {
        System.out.println(">> Input Array is ->\t" + Arrays.toString(arr));

        int j = 0;
        int temp = 0;

        for (int i=0; i<arr.length; i++) {
            if (arr[i]<0) {
                if (i!=j) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
        System.out.println(">> Sorted array with (positive elements followed by negetive elements) ->\n" + Arrays.toString(arr));
    }
}
