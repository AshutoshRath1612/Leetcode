package Leetcode;

public class Q1456_MaximumNumberOfVowelsInSubstring {
    public static int maxVowels(String s, int k) {
        int left = 0, count = 0, vowelCount = 0;
        String vowels = "aeiou";

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            if (vowels.indexOf(c) != -1) {
                vowelCount++;
            }
            if (right - left + 1 > k) {
                if (vowels.indexOf(s.charAt(left)) != -1) {
                    vowelCount--;
                }
                left++;
            }

            count = Math.max(count, vowelCount);
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;
        System.out.println(maxVowels(s,k));
    }
}
