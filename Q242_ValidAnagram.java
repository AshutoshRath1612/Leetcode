package Leetcode;

import java.util.Arrays;

public class Q242_ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char [] sChar = s.toCharArray();
        char [] tChar = t.toCharArray();
        int i = 0, j = 0;
        Arrays.sort(sChar);
        Arrays.sort(tChar);

        while (i < sChar.length && j < tChar.length) {
            if (sChar[i] != tChar[j]) {
                return false;
            }
            i++;
            j++;
        }

        return i == j;
    }
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagara";
        System.out.println(isAnagram(s,t));
    }
}
