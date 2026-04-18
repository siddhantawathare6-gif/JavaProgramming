package org.sid.array;

// Find the Largest Element in an Array

public class LargestElementArray {
    public static void main(String[] args) {
        int[] arr = {10, 2, 5, 20, 42};

        System.out.println(largestElement(arr));
    }

    private static int largestElement(int[] arr) {

        int max = arr[0];

        for (int elem : arr) {
            // max = Math.max(max, elem);
            if (elem > max) {
                max = elem;
            }
        }
        return max;

    }


}
