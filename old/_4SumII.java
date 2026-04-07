package Leetcode;

import java.util.HashMap;

public class _4SumII {
    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int count =0;
        HashMap<Integer , Integer> hm = new HashMap<>();
        for (int i:nums1){
            for (int j:nums2){
                hm.put(i+j , hm.getOrDefault(i+j , 0)+1);
            }
        }
        for (int i:nums3){
            for (int j:nums4){
               count+=  hm.getOrDefault(-(i+j),0);
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int [] num1 = {1,2};
        int [] num2 = {-2,-1};
        int [] num3 = {-1,2};
        int [] num4 = {0,2};
        System.out.println(fourSumCount(num1,num2,num3,num4));
    }
}
