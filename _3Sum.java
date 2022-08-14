package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]]
such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.
 */
public class _3Sum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>ll = new ArrayList<>();
        int i=0;
        int j=nums.length-1;
        Arrays.sort(nums); // -4,-1,-1,0,1,2
        while (i<j){
            for (int k=0;k<nums.length;k++) {
                if (i != k && j != k) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        ArrayList<Integer> al = new ArrayList<>();
                        al.add(nums[i]);
                        al.add(nums[j]);
                        al.add(nums[k]);
                        ll.add(al);
                    }
                    } else if (nums[i] + nums[j] + nums[k] > 0)
                        j--;
                    else
                        i++;

            }
//            i++;j--;
        }
        return ll;
    }
    public static void main(String[] args) {
            int []nums = {-1,0,1,2,-1,-4};
        List<List<Integer>>ll = new ArrayList<>();
        ll=threeSum(nums);
        System.out.println(ll);
    }
}
