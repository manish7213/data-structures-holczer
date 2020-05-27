package com.manish.ds.arrays;

import java.util.Arrays;

/**
 * find duplicates in a T[] one-dimensional array of integers in O(N) running time where the integer values are smaller than the length of the array!
 */
public class ArrayDuplicateFinder {

    public static void main(String[] args) {
        int[] arr = {1,2,8,3,8};
        printDuplicates(arr);
    }

    /**
     *
     * For now, Solution is only working if elements present are less than the size of array.
     */
    private static void printDuplicates(int[] arr) {

        for (int i = 0 ; i<arr.length;i++) {
            if (arr[Math.abs(arr[i])] > 0) {
                arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
            } else {
                System.out.println(Math.abs(arr[i])+" is a repetition");
            }
        }
    }

}
