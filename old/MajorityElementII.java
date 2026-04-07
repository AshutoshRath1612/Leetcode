package Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElementII {
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> majority = new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i : nums){
            hm.put(i , hm.getOrDefault(i , 0) + 1);
            if(hm.get(i) > nums.length/3 && !majority.contains(i)){
                majority.add(i);
            }
        }
        return majority;
    }
    public static void main(String[] args) {
        int [] arr = {3,2,3};
        System.out.println(majorityElement(arr));
    }
}
