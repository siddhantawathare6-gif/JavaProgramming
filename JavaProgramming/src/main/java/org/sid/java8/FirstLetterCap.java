package org.sid.java8;

// Capitalize first letter of each word

import java.util.Arrays;
import java.util.stream.Collectors;

public class FirstLetterCap {

    public static void main(String[] args) {
        String str = "hello, how are you";

        String collect =
                Arrays.stream(str.split(" ")).map(s -> s.substring(0, 1).toUpperCase()+s.substring(1)).collect(Collectors.joining(
                        " "));
        System.out.println(collect);
    }

}
