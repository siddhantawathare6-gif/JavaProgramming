package org.sid.array;

//  Find the Second Largest Number

public class SecondLargestNumber {
    public static void main(String[] args) {
        int[] arr = {23, 13, 14, 56, 10};
        System.out.println(secondLargestNum(arr));
    }

    private static int secondLargestNum(int[] arr) {

        int firstLargest = arr[0];
        int secondLargest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = arr[i];
            }else if (arr[i]>secondLargest && arr[i]!=firstLargest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
