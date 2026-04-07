package Leetcode;

import java.util.HashSet;
import java.util.Set;

/*
Given a string s, find the length of the longest substring without repeating characters.



Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.


Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.
 */
public class longest_substring_without_repeating {
    public int lengthOfLongestSubstring2(String s) {
        String str = "";
        int j=0;
        int longest=0;
        HashSet<Character> hs = new HashSet<>();
        for (int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if (hs.contains(c)){
                hs.clear();
                str = str.substring(str.indexOf(c)+1 , str.length());
                str += c;
                for(int k=0;k<str.length();k++){
                    hs.add(str.charAt(k));
                }
                j=str.length();
            }else{
                hs.add(c);
                j++;
                str += c;

            }
            if (longest<j){
                longest=j;
            }
        }
        return longest;
    }
    public static int lengthOfLongestSubstring3(String s) {
            String str = "";
            int j=0;
            String temp = s;
            int longest=0;
            HashSet<Character> hs = new HashSet<>();
            for (int i=0;i<temp.length();i++){
                char c=temp.charAt(i);
                if (hs.contains(c)){
                    hs.clear();
                    i = -1;
                    temp = temp.substring(temp.indexOf(c)+1,temp.length());
                    str="";
                    j=0;
                }else{
                    hs.add(c);
                    j++;
                    str += c;

                }
                if (longest<j){
                    longest=j;
                }
            }
        return longest;
    }
    public static int lengthOfLongestSubstring6(String s) {
        Set<Character> hs = new HashSet<>();
        int longest = 0;
        int leftindex = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(!hs.contains(c)){
                hs.add(c);
                longest = Math.max(longest , hs.size());
            }
            else{
                while(s.charAt(leftindex) != s.charAt(i)){
                    hs.remove(s.charAt(leftindex));
                    leftindex++;
                }
                leftindex++;
            }
        }
        return longest;
    }
    public static int lengthOfLongestSubstring(String s) {
        String str ="";
        int j=0;
        int longest =0;
        for(int i=0;i<s.length();i++){
            char c =s.charAt(i);
            if(str.indexOf(c)> -1){
                str+= c;
                str= str.substring(str.indexOf(c)+1 ,str.length());
                j=str.length();
            }
            else{
                str += c;
                j++;
            }
            if(longest<j){
                longest=j;
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        String str = "abcabcbb";
        int longest = lengthOfLongestSubstring6(str);
        System.out.println("The longest substring is: "+longest);
    }
}
