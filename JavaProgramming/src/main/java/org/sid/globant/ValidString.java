package org.sid.globant;

//input = a)b(c)d
//    output = ab(c)d

public class ValidString {
    public static void main(String[] args) {
        String input = "a)b(c)d";
        String ret = validString(input);
        System.out.println(ret);
    }

    private static String validString(String input) {
        StringBuilder builder = new StringBuilder();
        int openCount = 0;
        for (char c : input.toCharArray()) {
            if (c == '(') {
                openCount++;
                builder.append(c);
            } else if (c == ')') {
                if (openCount>0){
                    openCount--;
                    builder.append(c);
                }
            }else {
                builder.append(c);
            }
        }
        return builder.toString();
    }
}
