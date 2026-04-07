package Leetcode;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder str= new StringBuilder(strs[0]);
        if(strs.length==1)
            return strs[0];
//        if (strs[0].charAt(0)!= strs[1].charAt(0))
//            return "";
        for (int i=1;i<strs.length;i++){
            int j=0;
            while (j<Math.min(strs[i].length(),str.length())&&strs[i].charAt(j)==str.charAt(j))
                j++;
            str= new StringBuilder(str.substring(0, j));
        }
        return str.toString();
    }
    public String longestCommonPrefix2(String[] strs) {
        Arrays.sort(strs);
        int index = 0;
        String str1 = strs[0];
        String str2 = strs[strs.length-1];
        while(index < str1.length() && index < str2.length()){
            if(str1.charAt(index) == str2.charAt(index)){
                index++;
            }
            else{
                break;
            }
        }
        return str1.substring(0,index);
    }
    public static void main(String[] args) {
        String []strs = {"ab", "a"};
        String prefix = longestCommonPrefix(strs);
        System.out.println(prefix);
    }
}
