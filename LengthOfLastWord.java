package Leetcode;
/*
Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal
substring
 consisting of non-space characters only.
 */
public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        s = s.trim();
        String str = s.substring(s.lastIndexOf(" ")+1,s.length());
        return str.length();
    }

    public static void main(String[] args) {
        String s = " day";
        System.out.println(lengthOfLastWord(s));
    }
}
