package Leetcode;

public class Q151_ReverseWordsInStrings {

    public static String reverseWords(String s) {
        String [] words = s.trim().split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >=0 ; i--) {
            if(!words[i].isEmpty()) {
                sb.append(words[i]).append(" ");
            }
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String s = "a good   example";
        System.out.println(reverseWords(s));
    }
}
