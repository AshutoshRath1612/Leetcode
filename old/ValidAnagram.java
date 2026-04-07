package Leetcode;

import java.util.HashMap;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length()!=t.length())
            return false;
        HashMap<Character,Integer>hm = new HashMap<>();
        for (int i=0;i<s.length();i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        for (int i=0;i<t.length();i++){
            char c = t.charAt(i);
            if (hm.containsKey(c)){
                hm.put(c,hm.getOrDefault(c,0)-1);
                if (hm.get(c)==0)
                    hm.remove(c);
            }
            else
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "car";
        String t ="raac";
        System.out.println(isAnagram(s,t));
    }
}
