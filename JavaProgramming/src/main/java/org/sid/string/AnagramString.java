package org.sid.string;

// Check if Two Strings are Anagrams(abc,bca)("listen", "silent”)

import java.util.HashMap;
import java.util.Map;

public class AnagramString {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "bcaa";

        System.out.println(isAnagram(s1, s2));

    }

    public static boolean isAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        Map<Character, Integer> map = new HashMap<>();
        for (char ch1 : s1.toCharArray()) {
            map.put(ch1, map.getOrDefault(ch1, 0) + 1);
        }

        for (char ch2 : s2.toCharArray()) {
            if (!map.containsKey(ch2)) {
                return false;
            }
            map.put(ch2, map.get(ch2) - 1);
            if (map.get(ch2) < 0) {
                return false;
            }
        }

        return true;
    }


}
