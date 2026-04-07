package Leetcode;

/*
You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed,
the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and
it will automatically contact the police if two adjacent houses were broken into on the same night.

Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.
 */
public class House_Robber {
    public static int rob(int[] nums) {
        int [] rob = new int[nums.length];
        if(nums.length == 1){
            return nums[0];
        }
        if(nums.length==2){
            return Math.max(nums[0],nums[1]);
        }
        rob[0] = nums[0];
        rob[1] = Math.max(nums[0],nums[1]);
        for(int i = 2 ;i < nums.length;i++){
            rob[i] = Math.max(nums[i] + rob[i-2] , rob[i-1]);
        }
        return rob[rob.length-1];
    }
    public static void main(String[] args) {
        int []arr ={2,1,1,2,1,2};
        int robber = rob(arr);
        System.out.println(robber);
    }
}
