package com.manish.ds.arrays;

/**
 * Reverse an array inplace in O(N) complexity.
 */
public class ReverseArray {

    public static void main(String[] args) {

        int[] arr = {1,0,2,5,2,6};
        int[] reversedArray = reverseArray(arr);

        System.out.println("Reversed array is ");
        for (int x : reversedArray) {
            System.out.print(x+" ");
        }
    }

    private static int[] reverseArray(int[] arr) {

        int startIndex = 0;
        int endIndex = arr.length-1;

        while (endIndex >= startIndex) {
            swap(arr, startIndex, endIndex);
            startIndex++;
            endIndex--;
        }

        return arr;
    }

    private static void swap(int[] arr, int startIndex, int endIndex) {
        int temp = arr[startIndex];
        arr[startIndex] = arr[endIndex];
        arr[endIndex] = temp;
    }




}
