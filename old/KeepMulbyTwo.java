package Leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class KeepMulbyTwo {
    public int findFinalValue1(int[] nums, int original) {
        Arrays.sort(nums);
        int s=0;
        int e = nums.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if(nums[mid]<original)
                s = mid+1;
            else if(nums[mid]>original)
                e = mid-1;
            else if(nums[mid]==original){
                original *= 2;
                s=0;
                e = nums.length-1;
            }
        }
        return original;
    }
    public static int findFinalValue2(int[] nums, int original) {
        HashSet<Integer> hs = new HashSet<>();
        boolean runloop = true;
        int i=0;
        while(runloop) {
            if (i < nums.length) {
                if (nums[i] == original) {
                    original *= 2;
                    i++;
                } else {
                    hs.add(nums[i]);
                    i++;
                }
            }
            else {
                if(hs.contains(original)) {
                    original *= 2;
                }
                else
                    runloop=false;
            }
        }
        return original;
    }
    public static int findFinalValue(int[] nums, int original) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i:nums){
            hs.add(i);
        }
        while(hs.contains(original))
            original *=2;
        return original;
    }
    public static void main(String[] args) {
        int []arr = {8,19,4,2,15,3};
        System.out.println(findFinalValue(arr , 2));
    }
}
