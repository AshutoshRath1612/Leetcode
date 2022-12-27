package Leetcode;

import java.util.HashMap;

public class MajorityElements {
    public static int majorityElement(int[] nums) {
        HashMap<Integer,Integer>hm = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            if (hm.get(nums[i]) >nums.length/2)
                return nums[i];
        }
        return 0;
    }
    public static void main(String[] args) {
        int []nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}
