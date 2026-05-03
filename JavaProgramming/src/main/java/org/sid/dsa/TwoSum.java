package org.sid.dsa;

public class TwoSum {
    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 5, 6, 10};
        int k = 9;

        findTwoSum(arr, k);
    }

    private static void findTwoSum(int[] arr, int target) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int sum = arr[i] + arr[j];
            if (sum == target) {
                System.out.println(arr[i] + " " + arr[j]);
                i++;
                j--;
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }

        }

    }

}
