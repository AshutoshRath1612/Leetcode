package Leetcode;

import java.util.Arrays;
import java.util.HashMap;

/*
Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it.
That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].

Return the answer in an array.
 */
public class Number_Smaller_Than_Current_Num {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
            int []arr= new int[nums.length];
            for (int i=0;i<nums.length;i++){
                int count=0;
                for (int j=0;j<nums.length;j++){
                    if (i==j)
                        continue;
                    else if(nums[i]>nums[j])
                        count++;
                }
                arr[i]=count;
            }
            return arr;
    }
    public static int[] smallerNumbersThanCurrent2(int[] nums) {
        int []arr = nums.clone();
        HashMap<Integer,Integer>hm = new HashMap<>();
        Arrays.sort(arr);
        for (int i=0;i<arr.length;i++){
            if (hm.containsKey(arr[i]))
                continue;
            hm.put(arr[i],i);
        }
        for (int i=0;i<nums.length;i++){
            nums[i] = hm.get(nums[i]);
        }
        return nums;
    }
    public static void main(String[] args) {
        int []arr= {7,7,7,7};
        int []smallnum = smallerNumbersThanCurrent2(arr);
        System.out.println(Arrays.toString(smallnum));
    }
}