package org.sid.array;

// Remove Duplicates from Array

public class RemoveDuplicate {

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 4};

        removeDuplicate(nums);
    }

    private static void removeDuplicate(int[] nums) {
        int j = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                nums[++j] = nums[i];
            }
        }

        System.out.println("Unique elements: ");
        for (int i = 0; i <= j; i++) {
            System.out.print(nums[i] + " ");
        }
    }


}
