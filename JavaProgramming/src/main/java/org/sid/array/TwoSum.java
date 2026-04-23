package org.sid.array;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 10};
        int target = 8;

        twoSum(arr, target);

    }

    private static void twoSum(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                System.out.println("Pair found : " + arr[left] + "," + arr[right]);
                return;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
    }
}
