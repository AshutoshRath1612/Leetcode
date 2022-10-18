package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/*
Given two integer arrays nums1 and nums2, return an array of their intersection.
Each element in the result must be unique and you may return the result in any order.
 */
public class IntersectionTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>hs1 = new HashSet<>();
        ArrayList<Integer>al = new ArrayList<>();
        for (int i:nums1)
            hs1.add(i);
        for (int i:nums2)
            if (hs1.contains(i)) {
                al.add(i);
                hs1.remove(i);
            }
        int []intersection = new int[al.size()];
        for (int i=0;i<al.size();i++)
            intersection[i] = al.get(i);
//        return al.stream().mapToInt(i -> i).toArray();
        return intersection;
    }
    public static void main(String[] args) {
        int []arr1 = {1,2,2,1};
        int []arr2={2,2};
        int intersection[] = intersection(arr1,arr2);
        System.out.println(Arrays.toString(intersection));
    }
}
