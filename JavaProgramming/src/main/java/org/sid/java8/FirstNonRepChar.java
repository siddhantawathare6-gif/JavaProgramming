package org.sid.java8;

// Find first non-repeating character

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FirstNonRepChar {
    public static void main(String[] args) {
        String str = "siddhant";
        Character c1 = str.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(entry -> entry.getValue() <= 1)
                .map(Map.Entry::getKey).findFirst().orElseGet(()->'-');
         System.out.println(c1);
    }
}
