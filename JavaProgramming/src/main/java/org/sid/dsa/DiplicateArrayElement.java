package org.sid.dsa;

public class DiplicateArrayElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 2, 3, 4};
        removeDuplicate(arr);
    }

    private static void removeDuplicate(int[] arr) {
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                arr[++j] = arr[i];
            }
        }

        for (int i = 0; i <= j; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
