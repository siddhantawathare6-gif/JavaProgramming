package org.sid.array;

import java.util.Arrays;

public class MoveZero {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};

        int[] ints = moveZero(nums);
        //System.out.println(Arrays.toString(ints));

        int[] nums1 = moveZeroTwoPointer(nums);
        System.out.println(Arrays.toString(nums1));

    }

    private static int[] moveZero(int[] nums) {
        int index = 0;
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                arr[index++] = nums[i];
            }
        }

        for (int i = index; i < nums.length; i++) {
            arr[index++] = 0;
        }

        return arr;
    }

    private static int[] moveZeroTwoPointer(int[] nums){
        //int[] nums = {0, 1, 0, 3, 12};
        int j=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=0){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
            }
        }
        return nums;
    }
}
