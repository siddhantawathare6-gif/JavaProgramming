package org.sid.string;

//Reverse a String Without Using Built-in Functions

public class ReverseStringWithoutBuiltInFun {
    public static void main(String[] args) {
        String name="siddhant";
        System.out.println(reverseString(name));
    }

    public static String reverseString(String str){
        StringBuilder stringBuilder=new StringBuilder();
        for (int i = str.length()-1; i >=0 ; i--) {
            stringBuilder.append(str.charAt(i));
        }
        return stringBuilder.toString();
    }
}
