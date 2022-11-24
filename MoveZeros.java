package Leetcode;

import java.util.Arrays;

public class MoveZeros {
    public static void moveZeroes(int[] nums) {
        if (nums.length==1)
            return;
        int i=0,j=0;
        while (i< nums.length){
            if (nums[i]!=0){
                i++;
                j++;
            }
            else{
                while (i< nums.length&&nums[i]==0)
                    i++;
                if (i< nums.length&&j<i) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    j++;
                }
            }
        }
    }
    public static void main(String[] args) {
        int []arr= {0,0,0};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}
