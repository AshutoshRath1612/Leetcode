package Leetcode;

import java.util.HashMap;

public class Q451_SortCharacterByFrequency {
    public static String frequencySort(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();

        for (char c: s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c,0)+1);
        }

        StringBuilder ans = new StringBuilder();

        for (int i = 0 ; i < s.length(); i++) {
            int maxFreq = 0; char c = ' ';

            for (char element: freq.keySet()) {
                if (freq.get(element) > maxFreq) {
                    maxFreq = freq.get(element);
                    c = element;
                }
            }
            while (maxFreq-- > 0){

                ans.append(c);
            }
            freq.remove(c);
        }

        return ans.toString();
    }
    public static void main(String[] args) {
        String s = "tree";
        System.out.println(frequencySort(s));
    }
}
