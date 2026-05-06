package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Q599_MinimumIndexSumOfTwoList {
    public static String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String,Integer> indices = new HashMap<>();
        HashMap<Integer, List<String>> frequencies = new HashMap<>();

        for (int i=0;i<list1.length;i++) {
            indices.put(list1[i],i);
        }
        int minimumSum = Integer.MAX_VALUE;
        for (int i = 0; i< list2.length; i++) {
            if (indices.containsKey(list2[i])) {
                int indexSum = indices.get(list2[i]) + i;
                frequencies.computeIfAbsent(indexSum, k -> new ArrayList<>()).add(list2[i]);
                minimumSum = Math.min(minimumSum, indexSum);
            }
        }

        return frequencies.get(minimumSum).toArray(new String[0]);
    }
    public static String[] findRestaurant2(String[] list1, String[] list2) {
        HashMap<String, Integer> indices = new HashMap<>();

        for (int i=0; i<list1.length; i++) {
            indices.put(list1[i],i);
        }

        int minSum = Integer.MAX_VALUE;
        List<String> result = new ArrayList<>();
        for (int i = 0; i < list2.length; i++) {
            if (indices.containsKey(list2[i])) {
                int indexSum = i + indices.get(list2[i]);

                if (indexSum < minSum) {
                    result.clear();
                    result.add(list2[i]);
                    minSum = indexSum;
                }
                else if(indexSum == minSum) {
                    result.add(list2[i]);
                }
            }
        }

        return result.toArray(new String[0]);
    }
    public static void main(String[] args) {
        String [] str1 = {"happy","sad","good"};
        String [] str2 = {"sad","happy","good"};
        System.out.println(Arrays.toString(findRestaurant(str1, str2)));
        System.out.println(Arrays.toString(findRestaurant2(str1, str2)));
    }
}
