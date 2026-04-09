package Leetcode;

import java.util.Arrays;

/*
rite a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.
 */

public class Q344_ReverseString {
    public static void reverseString(char[] s) {
        for (int i = 0; i < s.length/2; i++) {
            char c = s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i] = c;
        }
    }
    public static void main(String[] args) {
        char [] c = {'h', 'e', 'l', 'l', 'o'};
        reverseString(c);
        System.out.println(Arrays.toString(c));
    }
}
