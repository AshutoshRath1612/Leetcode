package Leetcode;

import java.util.HashMap;

public class Q992_SubarrayWithKDifferentIntegers {
    public static int subarraysWithKDistinct(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int result = 0, prefix = 0, left = 0;

        for (int right = 0; right < nums.length; right++) {
            hm.put(nums[right], hm.getOrDefault(nums[right], 0) + 1);


            while (hm.size() > k) {
                hm.put(nums[left], hm.getOrDefault(nums[left], 0) - 1);

                if (hm.get(nums[left]) == 0) {
                    hm.remove(nums[left]);
                }
                left++;
                prefix = 0;
            }
            while (hm.size() == k && hm.get(nums[left]) > 1) {
                hm.put(nums[left] , hm.getOrDefault(nums[left] , 0) - 1);
                prefix++;
                left++;
            }

            if (hm.size() == k) {
                result += prefix + 1;
            }
        }

        return result;
    }


    public static int subarraysWithKDistinct1(int[] nums, int k) {

        // Core idea: To find exactly k we can find atmost k and atmost k-1. thus (exactly k) = (atmost k) - (atmost k-1)

        return atMost(nums,k) - atMost(nums, k-1);
    }

    public static int atMost(int [] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int result = 0, left = 0;

        for (int right = 0; right < nums.length; right++) {
            hm.put(nums[right], hm.getOrDefault(nums[right] , 0) + 1);

                while (hm.size() > k) {
                    hm.put(nums[left], hm.getOrDefault(nums[left] , 0) - 1);

                    if (hm.get(nums[left]) == 0 ) {
                        hm.remove(nums[left]);
                    }

                    left++;
                }
                result += right - left + 1;
        }
        return result;
    }
    public static void main(String[] args) {
        int [] nums = {1,2,1,3,4};
        int k = 3;
        System.out.println(subarraysWithKDistinct(nums, k));
    }
}
