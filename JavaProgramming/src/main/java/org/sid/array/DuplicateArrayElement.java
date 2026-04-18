package org.sid.array;

// Find Duplicate Elements in an Array

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateArrayElement {
    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 2, 3};
        int[] dupArray = duplicatElement(arr);
        System.out.println(Arrays.toString(dupArray));

    }


    public static int[] duplicatElement(int[] arr) {
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicate = new HashSet<>();
        for (int elem : arr) {
            if (!seen.add(elem))
                duplicate.add(elem);
        }

        return duplicate.stream().mapToInt(Integer::intValue).toArray();
    }
}
