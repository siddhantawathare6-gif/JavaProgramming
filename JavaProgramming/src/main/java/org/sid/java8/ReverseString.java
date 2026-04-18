package org.sid.java8;

// Reverse entire string using streams

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseString {
    public static void main(String[] args) {

        String str = "hello how are you";

        List<String> words = Arrays.asList(str.split(" "));
        Collections.reverse(words);

        String result = words.stream().collect(Collectors.joining(" "));
        System.out.println(result);
    }
}
