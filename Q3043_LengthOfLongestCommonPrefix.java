package Leetcode;

import java.util.HashSet;

public class Q3043_LengthOfLongestCommonPrefix {
    public static int longestCommonPrefix(int[] arr1, int[] arr2) {
        int longestPrefix = 0;
        HashSet<Integer> hs = new HashSet<>();

        for (int i: arr1) {
            while (i > 0) {
                hs.add(i);
                i = i/10;
            }
        }

        for (int i: arr2) {
            while(!hs.contains(i) && i > 0) {
                i /= 10;
            }

            int count = 0;
            while (i > 0) {
                count++;
                i /=10;
            }

            longestPrefix = Math.max(count, longestPrefix);
        }

        return longestPrefix;
    }
    public static void main(String[] args) {
        int [] arr1  = {1,10,100};
        int [] arr2 = {1000};
        System.out.println(longestCommonPrefix(arr1,arr2));
    }
}
