package Leetcode;

public class FindIndexOFFirstOccurance {
    public static int strStr(String haystack, String needle) {
        if (haystack.contains(needle)){
            for (int i=0;i<haystack.length();i++){
                if (haystack.charAt(i) == needle.charAt(0) && haystack.substring(i,i+needle.length()).equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String str1 = "mississippi";
        String str2 = "pi";
        System.out.println(strStr(str1,str2));
    }
}
