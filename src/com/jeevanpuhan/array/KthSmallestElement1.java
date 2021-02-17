/*
    Given an array and a number k where k is smaller than size of array,
    we need to find the k’th smallest element in the given array.
    It is given that all array elements are distinct.

    Method 1 (Simple Solution)
    Time Complexity of this solution is O(N Log N)
*/

package com.jeevanpuhan.array;

import java.util.Arrays;

public class KthSmallestElement1 {

    public static void main(String[] args) {

        int[] arr = {12, 3, 5, 7, 19};
        int k = 2;

        System.out.println("Array: "+Arrays.toString(arr));
        System.out.println("K = "+k);

        int el = kthSmallest(arr,k);
        System.out.println("K'th smallest element is "+el);


    }

    protected static int kthSmallest(int[] arr, int k) {

//      sort the array
        Arrays.sort(arr);
        return arr[k-1];
    }
}
