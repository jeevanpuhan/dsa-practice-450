// Program to reverse an array (Iterative way)

package com.jeevanpuhan.array;

public class ReverseArray1 {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};

        System.out.println("Array before reverse:");
        dispArray(arr);

        reverseArray(arr); // reverse array function

        System.out.println("Array after reverse:");
        dispArray(arr);
    }

    private static void dispArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    private static void reverseArray(int[] arr) {

        int temp;
        int start = 0;
        int end = arr.length-1;

        while(start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
