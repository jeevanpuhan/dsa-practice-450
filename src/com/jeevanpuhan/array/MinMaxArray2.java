// Maximum and minimum of an array using minimum number of comparisons
// Method - 2 Tournament Search
// Desc   - Divide the array into two parts and compare the maximums and minimums
//          of the two parts to get the maximum and the minimum of the whole array.

package com.jeevanpuhan.array;

import java.util.Arrays;

public class MinMaxArray2 {

    public static void main(String[] args) {

        int[] arr = {1000, 11, 445, 1, 330, 3000};
        System.out.println("Array: " + Arrays.toString(arr));

        Pair minMax = getMinMax(arr, 0, arr.length - 1);
        System.out.println("Minimum element: " + minMax.min);
        System.out.println("Maximum element: " + minMax.max);
    }

    private static Pair getMinMax(int[] arr, int low, int high) {

        Pair minMax = new Pair();
        Pair mml = new Pair();
        Pair mmr = new Pair();

        int mid;

//      If there is only one element
        if (low == high) {
            minMax.max = arr[low];
            minMax.min = arr[low];
            return minMax;
        }

//      If there are two elements
        if (high == low + 1) {
            if (arr[low] > arr[high]) {
                minMax.max = arr[low];
                minMax.min = arr[high];
            } else {
                minMax.max = arr[high];
                minMax.min = arr[low];
            }

            return minMax;
        }

//      If there are more than 2 elements
        mid = (low + high) / 2;
        mml = getMinMax(arr, low, mid);
        mmr = getMinMax(arr, mid + 1, high);

//      Compare minimums of two parts
        minMax.min = mml.min < mmr.min ? mml.min : mmr.min;

//      Compare maximums of two parts
        minMax.max = mml.max > mmr.max ? mml.max : mmr.max;


        return minMax;
    }

    static class Pair {
        int min;
        int max;
    }
}
