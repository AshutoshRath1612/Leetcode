package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Q347_TopKFrequentElement {
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int i : nums) {
            freq.put(i, freq.getOrDefault(i,0)+1);
        }

        List<Integer>[] bucket = new List[nums.length+1];

        for (int i: freq.keySet()) {
            int freqValue = freq.get(i);

            if(bucket[freqValue] == null) {
                bucket[freqValue] = new ArrayList<>();
            }

            bucket[freqValue].add(i);
        }

        int [] result = new int[k];

        for (int i = bucket.length-1, index = 0; i >= 0 && index < k; i--) {
            List<Integer> elements = bucket[i];

            if(elements == null) {
                continue;
            }

            for(int j = 0; j < elements.size() && index < k; j++) {
                result[index++] = elements.get(j);
            }
        }
        return result;
    }
    public static int[] topKFrequent2(int[] nums, int k) {
        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int i : nums) {
            freq.put(i, freq.getOrDefault(i,0)+1);
        }
        List<Integer> result = new ArrayList<>();
        while (k-- > 0) {
            int maxValue = 0, maxKey = 0;
            for(int i: freq.keySet()) {
                if (freq.get(i) > maxValue) {
                    maxValue = freq.get(i);
                    maxKey = i;
                }
            }
            result.add(maxKey);
            freq.remove(maxKey);
        }
        return result.stream().mapToInt(i->i).toArray();
    }
    public static void main(String[] args) {
        int [] nums = {1,1,1,2,2,3};
        int k = 2;
        System.out.println(Arrays.toString(topKFrequent(nums,k)));
        System.out.println(Arrays.toString(topKFrequent2(nums,k)));
    }
}
