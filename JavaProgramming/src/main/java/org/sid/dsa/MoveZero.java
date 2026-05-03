package org.sid.dsa;

import java.util.Arrays;

public class MoveZero {
    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 1, 3, 0, 12, 0};

        moveZero(arr);

    }

    private static void moveZero(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
