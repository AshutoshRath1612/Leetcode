package Leetcode;

public class Q392_IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;

        char [] sArr = s.toCharArray();
        char [] tArr = t.toCharArray();

        while (j < tArr.length && i < sArr.length) {
            if (sArr[i] == tArr[j]) {
                i++;
            }
            j++;
        }

        return i == sArr.length;
    }
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s,t));
    }
}
