package Leetcode;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int singlenum=0;
        for (int i=0;i<nums.length;i++){
            singlenum = singlenum^nums[i];
        }
        return singlenum;
    }

    public static void main(String[] args) {
        int [] nums = {4,1,2,1,2};
        int singlenum = singleNumber(nums);
        System.out.println(singlenum);
    }
}
