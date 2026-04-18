package org.sid.string;

// Count the Occurrence of Each Character

import java.util.HashMap;
import java.util.Map;

public class CountOccurance {
    public static void main(String[] args) {
        String str = "capco";
        Map<Character, Integer> map = countChar(str);
        System.out.println(map);

    }

    public static Map<Character, Integer> countChar(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        return map;
    }
}
