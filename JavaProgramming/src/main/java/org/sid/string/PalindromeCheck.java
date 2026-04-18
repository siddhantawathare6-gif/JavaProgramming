package org.sid.string;

// Check if a String is Palindrome(Determine if a string reads the same forward and backward.)

public class PalindromeCheck {
    public static void main(String[] args) {

        String palindrome = "madami";
        System.out.println(isPalindrome(palindrome));


    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {

            if (str.charAt(left++) != str.charAt(right--)) {
                return false;
            }
        }

        return true;
    }
}
