package Leetcode;

import java.util.*;

public class Q3318_FindXSumOfAllKLongSubArray {
    public static int[] findXSum(int[] nums, int k, int x) {
        int [] answer = new int[nums.length-k+1];

        for (int i  = 0; i < answer.length; i++) {
            HashMap<Integer, Integer> hm = new HashMap<>();

            for (int j = i; j < i+k; j++) {
                hm.put(nums[j], hm.getOrDefault(nums[j],0)+1);
            }

            List<int[]> al = new ArrayList<>();
            for (int key: hm.keySet()) {
                al.add(new int[]{hm.get(key), key});
            }

            al.sort((a,b) -> a[0] != b[0] ? b[0] - a[0] : b[1] - a[1]);

            int sum = 0;
            for (int j = 0; j < x && j < al.size(); j++) {
                sum += al.get(j)[1] * al.get(j)[0];
            }
            answer[i] = sum;
        }

        return answer;
    }
    public static void main(String[] args) {
        int [] arr = {1,1,2,2,3,4,2,3};
        int k = 6, x = 2;
        System.out.println(Arrays.toString(findXSum(arr, k, x)));
    }
}
