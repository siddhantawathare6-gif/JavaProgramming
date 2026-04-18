package org.sid.java8;

// Remove duplicate characters from a string

import java.util.stream.Collectors;

public class DuplicateChar {
    public static void main(String[] args) {

        String str = "siddhant";

        String collect = str.chars()
                .distinct().mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
        System.out.println(collect);

    }
}
