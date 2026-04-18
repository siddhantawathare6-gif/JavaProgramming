package org.sid.java8;

// Count frequency of each character

import java.util.function.Function;
import java.util.stream.Collectors;

public class CountFreqOfChar {

    public static void main(String[] args) {
        String str = "supriyapatil";
        str.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().forEach(System.out::println);

    }



}
