package Leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

public class Q567_PermutationInString {
    public static boolean checkInclusion(String s1, String s2) {
        int left = 0;
        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();

        for (char c: s1.toCharArray()) {
            hm1.put(c, hm1.getOrDefault(c,0)+1);
        }

        for (int right = 0; right < s2.length(); right++) {
            hm2.put(s2.charAt(right), hm2.getOrDefault(s2.charAt(right), 0) + 1);

            if (right - left + 1 > s1.length()) {
                hm2.put(s2.charAt(left), hm2.getOrDefault(s2.charAt(left), 0) - 1);

                if (hm2.get(s2.charAt(left)) == 0) {
                    hm2.remove(s2.charAt(left));
                }
                left++;
            }
            boolean match = true;
            for (char c: hm1.keySet()) {
                if (!Objects.equals(hm1.get(c), hm2.get(c))) {
                    match = false;
                    break;
                }
            }
            if (match && hm2.size() == hm1.size() && right - left + 1 == s1.length()) {
                return true;
            }
        }
        return false;
    }
    public static boolean checkInclusion1(String s1, String s2) {
        int [] s1Arr = new int[26];
        int [] s2Arr = new int[26];

        for (char c: s1.toCharArray()) {
            s1Arr[c - 'a']++;
        }

        int left = 0;

        for (int right = 0; right < s2.length(); right++) {
            s2Arr[s2.charAt(right) - 'a']++;

            if (right >= s1.length()) {
                s2Arr[s2.charAt(left++) - 'a']--;
            }

            if (Arrays.equals(s1Arr, s2Arr)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s1 = "adc",s2 = "dcda";
        System.out.println(checkInclusion1(s1,s2));
    }
}
