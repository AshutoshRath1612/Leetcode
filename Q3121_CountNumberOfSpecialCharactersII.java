package Leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class Q3121_CountNumberOfSpecialCharactersII {
    public static int numberOfSpecialChars(String word) {
        HashSet<Character> lower = new HashSet<>();
        HashSet<Character> valid = new HashSet<>();
        HashSet<Character> invalid = new HashSet<>();

        for(char c : word.toCharArray()){

            if(Character.isUpperCase(c)){

                char lowerChar =
                        Character.toLowerCase(c);

                if(lower.contains(lowerChar)
                        && !invalid.contains(c)){

                    valid.add(c);
                }

                if (!lower.contains(lowerChar)) {
                    invalid.add(c);
                }

            }else{

                char upperChar =
                        Character.toUpperCase(c);

                if(valid.contains(upperChar)){

                    valid.remove(upperChar);

                    invalid.add(upperChar);

                }else{

                    lower.add(c);
                }
            }
        }

        return valid.size();
    }

    public static int numberOfSpecialChars1(String word) {
        int [] lowerCase = new int[26];
        int [] upperCase = new int[26];
        Arrays.fill(lowerCase, -1);
        Arrays.fill(upperCase, -1);

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if (Character.isUpperCase(c) && upperCase[c - 'A'] == -1) {
                upperCase[c - 'A'] = i;
            }
            else if (Character.isLowerCase(c)) {
                lowerCase[c - 'a'] = i;
            }

        }
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (lowerCase[i]  != -1 && upperCase[i] != -1 && lowerCase[i] < upperCase[i]) {
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        String s = "AbcbDBdD";
        System.out.println(numberOfSpecialChars1(s));
    }
}
