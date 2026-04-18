package org.sid.java8;

// Find longest word in a sentence

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class LongestWord {

    public static void main(String[] args) {
        String str = "hello my name is siddhant";

        String s = Arrays.stream(str.split(" "))
                .max(Comparator.comparingInt(String::length))
                .orElse("");
        System.out.println(s);
        System.out.println("=======================================");

        String s1 = Arrays.stream(str.split(" ")).reduce((w1, w2) -> w1.length() >= w2.length() ? w1 : w2).orElseThrow();
        System.out.println(s1);
    }
}
