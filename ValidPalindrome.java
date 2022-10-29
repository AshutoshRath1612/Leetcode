package Leetcode;

/*
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters,
it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.
 */
public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        s = s.toLowerCase();
        for (int i =0;i<s.length();i++){
            if ((s.charAt(i)>=97 && s.charAt(i)<=122)||(s.charAt(i)>=48 && s.charAt(i)<=57)) {
                str.append(s.charAt(i));
            }
        }
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)!=str.charAt(str.length()-1-i))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "0P";
        System.out.println(isPalindrome(str));
    }
}
