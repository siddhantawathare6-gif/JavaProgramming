package org.sid.java8;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FreqEvenElementWithTie {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 4, 4, 4, 6, 6};
        Integer i = Arrays.stream(nums)
                .filter(num -> num % 2 == 0)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted((e1, e2) -> {
                    if (!e1.getValue().equals(e2.getValue())) {
                        return Long.compare(e2.getValue(), e1.getValue());
                    }
                    return Integer.compare(e1.getKey(), e2.getKey());
                })
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(-1);
        System.out.println(i);


    }
}
