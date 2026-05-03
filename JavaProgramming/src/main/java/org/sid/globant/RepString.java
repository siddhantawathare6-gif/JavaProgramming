package org.sid.globant;

//nput = {“pen”,”note book”,”pen”,”pencil”,”pen”} find most repeated string using java8.

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepString {
    public static void main(String[] args) {
        String[] input = {"pen","note book","pen","pencil","pen"};

        String s = Arrays.stream(input)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .stream()
                .findAny()
                .orElse(null);
        System.out.println(s);

    }
}
