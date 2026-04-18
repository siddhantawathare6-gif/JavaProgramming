package org.sid.java8;

// Check if two strings are anagrams

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CheckAnagramString {

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "cba";

        List<Character> collect = s1.chars().mapToObj(c -> (char) c).sorted(Comparator.comparing(Character::charValue)).collect(Collectors.toList());
        System.out.println(collect);
        List<Character> collect1 = s2.chars().mapToObj(c -> (char) c).sorted(Comparator.comparing(Character::charValue)).collect(Collectors.toList());
        System.out.println(collect1);
        if (collect.equals(collect1)) {
            System.out.println("true");
        }
        System.out.println("========================================================");
        boolean isAnagram = Arrays.equals(
                s1.chars().sorted().toArray(),
                s2.chars().sorted().toArray()
        );
        System.out.println(isAnagram);
        System.out.println("=========================================================");
        Map<Character, Long> map1 = s1.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map<Character, Long> map2 = s2.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        boolean isAnagramMap = map1.equals(map2);

        System.out.println("Is Anagram: " + isAnagramMap);
    }

}
