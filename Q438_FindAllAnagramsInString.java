package Leetcode;

import java.util.*;

public class Q438_FindAllAnagramsInString {
    public static List<Integer> findAnagrams(String s, String p) {
            List<Integer> result = new ArrayList<>();
            HashMap<Character, Integer> target = new HashMap<>();
            HashMap<Character, Integer> source = new HashMap<>();

            for (char c: p.toCharArray()) {
                target.put(c, target.getOrDefault(c,0)+1);
            }

            int left = 0;

            for (int right = 0; right < s.length(); right++) {
                source.put(s.charAt(right), source.getOrDefault(s.charAt(right), 0) + 1);

                if (right >= p.length()) {
                    source.put(s.charAt(left), source.getOrDefault(s.charAt(left), 0) - 1);

                    if (source.get(s.charAt(left)) == 0) {
                        source.remove(s.charAt(left));
                    }
                    left++;
                }

                if (source.size() == target.size()) {
                    if (Objects.equals(source, target)) {
                     result.add(left);
                    }
                }
            }

            return result;
    }

    public static List<Integer> findAnagrams1(String s, String p) {
        List<Integer> result = new ArrayList<>();
        int [] source = new int[26];
        int [] target = new int[26];

        for (char c: p.toCharArray()) {
            target[c - 'a']++;
        }

        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            source[s.charAt(right) - 'a']++;

            if (right >= p.length()) {
                source[s.charAt(left) - 'a']--;
                left++;
            }

            if (Arrays.equals(source, target)) {
                result.add(left);
            }
        }

        return result;
    }
    public static void main(String[] args) {
        String s = "cbaebabacd", p = "abc";
        System.out.println(findAnagrams1(s,p));
    }
}
