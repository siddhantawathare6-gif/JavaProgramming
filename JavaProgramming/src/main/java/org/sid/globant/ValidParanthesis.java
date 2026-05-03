package org.sid.globant;

import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        String str  = "{[()]}}x";

        System.out.println(isValid(str)?"Valid":"Invalid");
    }

    private static boolean isValid(String str) {
        Stack<Character> stack=new Stack<>();
        for(char c : str.toCharArray()){
            if (c == '{' || c=='[' || c=='('){
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char popValue = stack.pop();
                if ((c=='}' && popValue!='{') || (c==']' && popValue!='[') || (c==')' && popValue!='(')) return false;
            }
        }
        return stack.isEmpty();
    }
}
