package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> all = new ArrayList<>();
        int mindiff = Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            if (Math.abs(arr[i+1] - arr[i])<mindiff) {
                mindiff = Math.abs(arr[i + 1] - arr[i]);
                all.clear();
            }
                List<Integer>al = new ArrayList<>();
            if (Math.abs(arr[i+1] - arr[i]) == mindiff){
                al.add(arr[i]);
                al.add(arr[i+1]);
                all.add(al);
            }
        }
        return all;
    }

    public static void main(String[] args) {
        int []arr = {40,11,26,27,-20};
        List<List<Integer>> al = minimumAbsDifference(arr);
        System.out.println(al);
    }
}
