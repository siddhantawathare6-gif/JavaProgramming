package org.sid.sap;

public class ReverseString {
    public static void main(String[] args) {
        String str = "hello world";

        String s = reverseString(str);
        System.out.println(s);
    }

    private static String reverseString(String str) {
        StringBuilder builder=new StringBuilder();
        for (int i = str.length()-1; i >=0 ; i--) {
            builder.append(str.charAt(i));
        }
        return builder.toString();
    }
}
