// Given an array which consists of only 0, 1 and 2.
// Sort the array without using any sorting algo
// Method - Simple Counting
//
// (decreased for loops)

package com.jeevanpuhan.array;

import java.util.Arrays;

public class SortArray2 {

    public static void main(String[] args) {

//        int[] arr = {0, 1, 2, 0, 1, 2};
        int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};


        System.out.println("Before Sorting: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("After Sorting: ");
        sort012(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort012(int[] arr) {

        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case 0:
                    count0++;
                    break;
                case 1:
                    count1++;
                    break;
                case 2:
                    count2++;
                    break;
            }
        }

        for (int i = 0; i < arr.length; i++) {

            if (i < count0) {
                arr[i] = 0;
            } else if (i >= count0 && i < (count0 + count1)) {
                arr[i] = 1;
            } else {
                arr[i] = 2;
            }
        }


    }
}
