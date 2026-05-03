package org.sid.globant;

//Find number of days after which the next warm temperature is
//temperatures = [73,76,75,71,69,72,76,73]
//Output: [1,0,4,2,1,1,0,0]

import java.util.Arrays;
import java.util.Stack;

public class NextWarmTemp {
    public static void main(String[] args) {
        int[] temperatures = {73,76,75,71,69,72,76,73};

        int[] warmTemp=warmTemp(temperatures);
        System.out.println(Arrays.toString(warmTemp));
    }

    private static int[] warmTemp(int[] temp) {
        int n = temp.length;
        int[] result = new int[n];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temp[i] > temp[stack.peek()]) {
                int prev = stack.pop();
                result[prev] = i - prev;
            }
            stack.push(i);
        }

        return result;
    }
}
