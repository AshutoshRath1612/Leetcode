package Leetcode;

public class Q2938_SeparateBlackNWhiteBalls {
    public static long minimumSteps(String s) {
        long swaps = 0;
        char [] chars = s.toCharArray();
        int i = 0, j = chars.length - 1;

        while (i < j) {
            while (i < j && chars[i] == '0') {
                i++;
            }

            while (j > i && chars[j] == '1') {
                j--;
            }

            if (i < j) {
                swaps += j - i;
            }
            i++;
            j--;
        }
        return swaps;
    }
    public static void main(String[] args) {
        String str = "100";
        System.out.println(minimumSteps(str));
    }
}
