package org.sid.java8;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostRepString {
    public static void main(String[] args) {
        String[] input = {"pen", "note book", "pen", "pencil", "pencil"};
        String s = Arrays.stream(input)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                //.map(Map.Entry::getKey);
                .get()
                .getKey();
        System.out.println(s);
    }
}
