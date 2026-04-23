package org.sid.java8;

// Sort characters in a string alphabetically

public class SortChar {

    public static void main(String[] args) {
        String str = "supriyapatil";
        str.chars()
                .mapToObj(c->(char)c)
                .sorted(Character::compare)
                .forEach(System.out::print);
    }
}
