package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/*
Given two integer arrays nums1 and nums2, return an array of their intersection.
 Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
 */
public class IntersectionTwoArraysII {
    public static int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> al = new ArrayList<>();
        int i=0,j=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while (i<nums1.length && j< nums2.length) {
            if (nums1[i] < nums2[j])
                i++;
            else if (nums1[i] > nums2[j])
                j++;
            else {
                al.add(nums1[i]);
                i++;
                j++;
            }
        }
        int []intersection = new int[al.size()];
        for (int k=0;k<intersection.length;k++){
            intersection[k]=al.get(k);
        }
        return intersection;
    }
    public static void main(String[] args) {
        int []arr1 = {3,2,1};
        int []arr2 = {1,1};
        int[]intersect = intersect(arr1,arr2);
        System.out.println(Arrays.toString(intersect));
    }
}
