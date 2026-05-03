package org.sid.globant;

//Code to reverse below string:
//Input: s = " the sky is   blue "
//Output: "blue is sky the”

import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {
        String input = " the sky is   blue ";

        String s = Arrays.stream(input.trim().split("\\s+")).reduce((a, b) -> b + " " + a).orElse(null);
        System.out.println(s);
    }
}
