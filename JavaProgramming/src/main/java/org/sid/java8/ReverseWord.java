package org.sid.java8;

// Reverse each word in a sentence

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWord {

    public static void main(String[] args) {
        String str = "hello how are you";
        String collect =
                Arrays.stream(str.split(" "))
                        .map(s -> new StringBuilder(s).reverse())
                        .collect(Collectors.joining(" "));
        System.out.println(collect);
    }
}
