package com.company;

import java.util.Arrays;

public class Array {    
  public static void kthMinElement(int[] arr, int k) {
        System.out.println(">> Input Array is : " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println( k + "th. Min element in the array : " + arr[k-1]);
        System.out.println( k + "th. Max element in the array : " + arr[arr.length-k]);
    }
}
