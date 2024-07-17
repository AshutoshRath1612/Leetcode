package Leetcode;

public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int index = 0;
        while(index < nums.length){
            int currMax = 0;
            while(index < nums.length && nums[index] == 1){
                currMax++;
                index++;
            }
            max = Math.max(max , currMax);
            index++;
        }
        return max;
    }
    public static void main(String[] args) {
        int [] arr = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
}
