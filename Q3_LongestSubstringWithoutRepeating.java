package Leetcode;

import java.util.HashSet;

public class Q3_LongestSubstringWithoutRepeating {
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<>();
        int leftIndex = 0, longest = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!hs.contains(s.charAt(i))) {
                hs.add(s.charAt(i));
            } else {
                while (s.charAt(leftIndex) != s.charAt(i)) {
                    hs.remove(s.charAt(leftIndex++));
                }
                leftIndex++;
            }

            longest = Math.max(longest, i - leftIndex + 1);
        }
        return longest;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
