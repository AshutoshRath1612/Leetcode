package Leetcode;

public class Q3120_CountNumberOfSpecialCharactersI {
    public static int numberOfSpecialChars(String word) {
        int [] lowerCase = new int[26];
        int [] upperCase = new int[26];
        int count = 0;

        for (char c: word.toCharArray()) {
            if (c <= 90) {
                upperCase[c - 'A']++;
            }
            else {
                lowerCase[c - 'a']++;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (lowerCase[i] > 0 && upperCase[i] > 0) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String word = "aaAbcBC";
        System.out.println(numberOfSpecialChars(word));
    }
}
