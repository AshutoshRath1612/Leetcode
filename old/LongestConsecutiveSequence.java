package Leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return 1;
        }
        int longest = 1;
        int currLongest = 1;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length;i++){
            if (nums[i] == nums[i - 1]) {
                continue;  // Skip duplicates
            }
            if (nums[i] == nums[i-1]+1){
                currLongest++;
            }
            else{
                currLongest = 1;
            }
            longest = Math.max(longest,currLongest);
        }
        return longest;
    }
    public static int longestConsecutive1(int[] nums){
        int longest = 0;
        HashSet<Integer> hs = new HashSet<>();
        for (int i : nums){
            hs.add(i);
        }
        Arrays.sort(nums);
        for (int i = 0 ;i < nums.length;i++){
            int num = nums[i];
            int currentStreak = 0;
            while (hs.contains(num)){
                currentStreak++;
                num++;
            }
            longest = Math.max(longest,currentStreak);
        }
        return longest;
    }
    public static void main(String[] args) {
        int arr [] = {1,2,0,1};
        System.out.println(longestConsecutive1(arr));
    }
}
