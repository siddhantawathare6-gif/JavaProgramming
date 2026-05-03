package org.sid.globant;

//2. Given an integer array nums,  write a program to return all the duplicate elements using Java 8 Stream methods.

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Duplicate {
    public static void main(String[] args) {
        int[] arr = {1,3,5,2,6,1,2};
        Set<Integer> integerSet=new HashSet<>();
        List<Integer> list = Arrays.stream(arr).boxed().filter(num -> !integerSet.add(num)).toList();
        System.out.println(list);
    }
}
