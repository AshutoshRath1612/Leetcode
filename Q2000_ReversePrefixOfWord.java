package Leetcode;

public class Q2000_ReversePrefixOfWord {
    public static String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);

        if (index == -1) {
            return word;
        }

        String str = new StringBuilder(word.substring(0,index+1)).reverse().toString();

        return str + word.substring(index+1, word.length());
    }
    public static void main(String[] args) {
        String word = "abcdefd";
        char ch = 'd';
        System.out.println(reversePrefix(word,ch));
    }
}
