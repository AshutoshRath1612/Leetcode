package Leetcode;

public class Q1189_MaximumNumbersOfBalloons {
    public static int maxNumberOfBalloons(String text) {
        int [] freq = new int[26];

        for (char c: text.toCharArray()) {
            freq[c - 'a']++;
        }

        return Math.min(freq['b' - 'a'],
                Math.min(freq['a' - 'a'],
                        Math.min(freq['l' - 'a']/2,
                                Math.min(freq['o' - 'a']/2, freq['n' - 'a']))));
    }
    public static void main(String[] args) {
        String str = "nlaebolko";
        System.out.println(maxNumberOfBalloons(str));
    }
}
