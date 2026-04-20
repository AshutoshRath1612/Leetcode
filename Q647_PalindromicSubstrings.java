package Leetcode;

public class Q647_PalindromicSubstrings {
    public static int countSubstrings(String s) {
        int count = 0;

        for(int i = 0; i < s.length(); i++) {
            count += substrings(s, i, i);
            count += substrings(s, i, i+1);

        }

        return count;
    }

    public static int substrings(String s, int left, int right) {
        int count = 0;
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            count++;
            left--;
            right++;
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(countSubstrings(str));
    }
}
