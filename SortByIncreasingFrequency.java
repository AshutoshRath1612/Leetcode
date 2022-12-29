package Leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class SortByIncreasingFrequency {
    public static int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer>hm = new HashMap<>();
        for (int n:nums)
            hm.put(n,hm.getOrDefault(n,0)+1);
        int []sorted = new int[nums.length];
        int j=0;
        while (!hm.isEmpty()){
            int max=Integer.MAX_VALUE;
            int num=Integer.MAX_VALUE;
            for (int i=0;i<nums.length;i++) {
                if (hm.containsKey(nums[i])) {
                    if (hm.get(nums[i]) <= max) {
                        if (hm.get(nums[i]) == max) {
                            if (nums[i] > num)
                                 num = nums[i];
                            continue;
                        }
                        max = hm.get(nums[i]);
                        num = nums[i];

                    }
                }
            }
            hm.remove(num);
            for (int i=0;i<max;i++){
                sorted[j] = num;
                j++;
            }
        }
        return sorted;
    }
    public static void main(String[] args) {
        int []arr = {2,3,1,3,2};
        int []sorted = frequencySort(arr);
        System.out.println(Arrays.toString(sorted));
    }
}
