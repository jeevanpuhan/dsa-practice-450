// Maximum and minimum of an array using minimum number of comparisons
// Method - 1 Simple Linear Search

package com.jeevanpuhan.array;

import java.util.Arrays;

public class MinMaxArray1 {

    public static void main(String[] args) {

        int[] arr = {1000, 11, 445, 1, 330, 3000};
        System.out.println("Array: " + Arrays.toString(arr));

        Pair minMax = getMinMax(arr);
        System.out.println("Minimum element: "+minMax.min);
        System.out.println("Maximum element: "+minMax.max);
    }

    private static Pair getMinMax(int[] arr) {

        Pair minMax = new Pair();
        int n = arr.length;

//      If there is only one element then return it as min and max both
        if (n == 1) {

            minMax.max = arr[0];
            minMax.min = arr[0];
            return minMax;

        }

//      If there are more than one elements, initialize min and max
        if (arr[0] > arr[1]) {
            minMax.max = arr[0];
            minMax.min = arr[1];
        } else {
            minMax.max = arr[1];
            minMax.min = arr[0];
        }

        /*  Starting from 3rd, compare each element with max and min, and change max and min accordingly
            (i.e., if the element is smaller than min then change min, else if the element is greater than
            max then change max, else ignore the element)
        */

        for (int i = 2; i < n; i++) {

            if (arr[i] > minMax.max) {
                minMax.max = arr[i];
            } else if (arr[i] < minMax.min) {
                minMax.min = arr[i];
            }
        }

        return minMax;
    }

    static class Pair {
        int min;
        int max;
    }
}
