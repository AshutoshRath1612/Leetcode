package Leetcode;

import java.util.HashMap;

public class SortCharacterbyFrequency {
    public static String frequencySort(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
        }
        System.out.println(hm.getOrDefault('t',0));
        return s;
    }
    public static void main(String[] args) {
        String str ="tttreee";
        String sorted = frequencySort(str);
        System.out.println(sorted);
    }
}
