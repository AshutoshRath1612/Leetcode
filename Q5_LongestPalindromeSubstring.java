package Leetcode;

public class Q5_LongestPalindromeSubstring {
    public static String longestPalindrome(String s) {
        int left = 0, right = 0, longestPalindromeLength = 0;

        for (int i = 0; i < s.length(); i++) {
            int evenLen = countLongestPalindrome(s, i,i+1);
            int oddLen = countLongestPalindrome(s, i, i);
            int maxLen = Math.max(evenLen,oddLen);

            if (maxLen > longestPalindromeLength) {
                longestPalindromeLength = maxLen;
                left = i - (maxLen-1)/2;
                right = i + (maxLen/2);
            }
        }

        return s.substring(left, right + 1);
    }
    public static int countLongestPalindrome(String s,  int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return right - left - 1;
    }
    public static void main(String[] args) {
        String str = "cbbd";
        System.out.println(longestPalindrome(str));
    }
}
