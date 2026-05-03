package org.sid.sap.java8;

import java.util.HashSet;
import java.util.Set;

public class RepChar {
    public static void main(String[] args) {
        String str = "siddhant";

        findRepChar(str);
    }

    private static void findRepChar(String str) {
        Set<Character> set=new HashSet<>();
        for (char c: str.toCharArray()){
            if (!set.add(c)){
                System.out.println(c);
            }
        }
    }
}
