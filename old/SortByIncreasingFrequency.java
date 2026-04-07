package Leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class SortByIncreasingFrequency {
    public static int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer>hm = new HashMap<>();
        for (int n:nums)
            hm.put(n,hm.getOrDefault(n,0)+1);
        int []sorted = new int[nums.length];
        int j=0;
        while (!hm.isEmpty()){
            int max=Integer.MAX_VALUE;
            int num=Integer.MAX_VALUE;
            for (int i=0;i<nums.length;i++) {
                if (hm.containsKey(nums[i])) {
                    if (hm.get(nums[i]) <= max) {
                        if (hm.get(nums[i]) == max) {
                            if (nums[i] > num)
                                 num = nums[i];
                            continue;
                        }
                        max = hm.get(nums[i]);
                        num = nums[i];

                    }
                }
            }
            hm.remove(num);
            for (int i=0;i<max;i++){
                sorted[j] = num;
                j++;
            }
        }
        return sorted;
    }
    public static int[] frequencySort1(int[] nums) {
        int [][]count = new int[201][2];
        for(int i = 0; i < nums.length;i++){
            count[100+nums[i]][0] = 100+nums[i];
            count[100+nums[i]][1]+=1;
        }
        Arrays.sort(count , (a,b) -> {
            if(a[1] == b[1]){
                return b[0] - a[0];
            }
            return a[1] - b[1];
        });
        int index = 0;
        for(int [] arr: count){
            if(arr[1] == 0)
                continue;
            while(arr[1] > 0){
                nums[index++] = arr[0]- 100;
                arr[1]--;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int []arr = {2,3,1,3,2};
        int []sorted = frequencySort(arr);
        System.out.println(Arrays.toString(sorted));
    }
}
