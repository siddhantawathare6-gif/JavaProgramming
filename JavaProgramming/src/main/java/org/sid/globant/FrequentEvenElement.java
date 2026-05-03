package org.sid.globant;

//Given an integer array nums, return the most frequent even element.
//If there is a tie, return the smallest one. If there is no such element, return -1.

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequentEvenElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 2, 4, 6, 2, 4};
        List<Integer> list = Arrays.stream(arr)
                .boxed()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((e1, e2) -> {
                    if (!e1.getValue().equals(e2.getValue())) {
                        return Long.compare(e2.getValue(), e1.getValue());
                    }
                    return Integer.compare(e1.getKey(), e2.getKey());
                })
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .stream().toList();
        System.out.println(list);

    }
}
