package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q18_4Sum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length-3; i++) {

            if (i > 0 && nums[i-1] == nums[i]){
                continue;
            }
            for (int j = i+1; j < nums.length - 2; j++) {
                if ( j != i+1 && nums[j] ==  nums[j-1]) {
                    continue;
                }

                int k = j+1;
                int l = nums.length-1;

                while (k < l) {
                long sum = nums[i] + nums[j];
                sum += nums[k] + nums[l];
                    if (sum == target) {
                        List<Integer> ans = new ArrayList<>();
                        ans.add(nums[i]);
                        ans.add(nums[j]);
                        ans.add(nums[k]);
                        ans.add(nums[l]);
                        result.add(ans);
                        l--;

                        while(k < l && nums[l] == nums[l+1]) {
                            l--;
                        }
                    }
                    else if (sum > target) {
                        l--;
                    }
                    else {
                        k++;
                    }
                }
            }
        }

        return result;
    }
    public static void main(String[] args) {
        int []arr = {1000000000,1000000000,1000000000,1000000000};
//        int []arr = {2,2,2,2,2};
        int target =-294967296;
//        int target = 8;
        List<List<Integer>> al = fourSum(arr,target);
        System.out.println(al);
    }
}
