package org.sid.dsa;

public class RemoveInvalidParenthese {
    public static void main(String[] args) {
        String input = "a)b(c)d";
        String str = removeInvalidParanthesis(input);
        System.out.println(str);
    }

    private static String removeInvalidParanthesis(String input) {

        StringBuilder stringBuilder = new StringBuilder();
        int open = 0;
        for (char c : input.toCharArray()) {
            if (c=='('){
                open++;
                stringBuilder.append(c);
            }else if (c==')'){
                if (open>0){
                    open--;
                    stringBuilder.append(c);
                }
            }else {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }
}
