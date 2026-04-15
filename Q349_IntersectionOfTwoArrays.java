package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Q349_IntersectionOfTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> seen = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int i: nums1) {
            seen.put(i, 1);
        }

        for (int i: nums2) {
            if (seen.containsKey(i) && seen.get(i) == 1) {
                    result.add(i);
                    seen.put(i, 0);
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
    public static void main(String[] args) {
        int [] nums1 = {4,9,5};
        int [] nums2 = {9,4,9,8,4};

        System.out.println(Arrays.toString(intersection(nums1, nums2)));
    }
}
