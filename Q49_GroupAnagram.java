package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Q49_GroupAnagram {
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagrams = new HashMap<>();

        for (String s: strs) {
            String key = getAnagramKey(s);
            if (anagrams.containsKey(key)) {
                anagrams.get(key).add(s);
            }
            else {
                List<String> al = new ArrayList<>();
                al.add(s);
                anagrams.put(key, al);
            }
        }
        List<List<String>> result = new ArrayList<>();
        for(String s: anagrams.keySet()) {
            result.add(anagrams.get(s));
        }
        return result;
    }

    public static String getAnagramKey(String s) {
        char [] c = s.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }

    public static List<List<String>> groupAnagrams2(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);

            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(map.values());
    }
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }
}
