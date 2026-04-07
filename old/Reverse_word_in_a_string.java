package Leetcode;

import java.util.Arrays;

public class Reverse_word_in_a_string {
    public static String reverseWords(String s) {
        String [] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i=words.length-1;i>=0;i--){
            if(!words[i].equals(""))
            sb.append(words[i]+ " ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String s = "a good   example";
        System.out.println(reverseWords(s));
    }
}
