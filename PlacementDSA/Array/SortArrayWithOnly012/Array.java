package com.company;

import java.util.Arrays;

public class Array {
  
  public static void sortArray012(int[] arr) {

        System.out.println(">> Input Array is ->\t" + Arrays.toString(arr));
    
        int low = 0;
        int mid = 0;
        int high = arr.length-1;
        int temp = 0;

        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
            }
        }
        System.out.println(">> Sorted array with (0, 1, 2) ->\t"+ Arrays.toString(arr));
    }
}
