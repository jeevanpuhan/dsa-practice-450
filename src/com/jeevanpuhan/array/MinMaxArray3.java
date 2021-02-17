// Maximum and minimum of an array using minimum number of comparisons
// Method - 3 Compare in Pairs

// Desc - If n is odd then initialize min and max as first element.
//        If n is even then initialize min and max as minimum and maximum of the
//        first two elements respectively.
//        For rest of the elements, pick them in pairs and compare their
//        maximum and minimum with max and min respectively.

package com.jeevanpuhan.array;

import java.util.Arrays;

public class MinMaxArray3 {

    public static void main(String[] args) {

        int[] arr = {1000, 11, 445, 1, 330, 3000};
        System.out.println("Array: " + Arrays.toString(arr));

        Pair minMax = getMinMax(arr);
        System.out.println("Minimum element: " + minMax.min);
        System.out.println("Maximum element: " + minMax.max);
    }

    private static Pair getMinMax(int[] arr) {

        Pair minMax = new Pair();
        int n = arr.length;

        int i;      // loop index

      /*If array has even number of elements then initialize the first
      two elements as minimum and maximum*/

        if (n % 2 == 0) {

            if (arr[0] > arr[1]) {
                minMax.max = arr[0];
                minMax.min = arr[1];
            } else {
                minMax.max = arr[1];
                minMax.min = arr[0];
            }

            i = 2;  /* set the starting index for loop */
        }

        /*If array has odd number of elements then initialize the first
          element as minimum and maximum*/

        else {

            minMax.max = arr[0];
            minMax.min = arr[0];

            i = 1;  /* set the starting index for loop */
        }

        /* In the while loop, pick elements in pair and compare the pair
         *  with max and min so far
         */

        while (i < n - 1) {

            if (arr[i] > arr[i + 1]) {

                if (arr[i] > minMax.max) {
                    minMax.max = arr[i];
                }
                if (arr[i + 1] < minMax.min) {
                    minMax.min = arr[i + 1];
                }

            } else {

                if (arr[i + 1] > minMax.max) {
                    minMax.max = arr[i+1];
                }

                if (arr[i] < minMax.min) {
                    minMax.min = arr[i];
                }
            }

            /* Increment the index by 2 as two elements are processed at a time in loop*/
            i += 2;
        }

        return minMax;
    }

    static class Pair {
        int min;
        int max;
    }
}
