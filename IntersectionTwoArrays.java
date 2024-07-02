package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/*
Given two integer arrays nums1 and nums2, return an array of their intersection.
Each element in the result must be unique and you may return the result in any order.
 */
public class IntersectionTwoArrays {
    public int[] intersection4(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0 , j = 0 , n1 = nums1.length , n2 = nums2.length;
        while(i < n1 && j < n2){
            if(nums1[i] < nums2[j]){
                i++;
            }
            else if(nums1[i] > nums2[j]){
                j++;
            }
            else{
                hs.add(nums1[i]);
                i++;
                j++;
            }
        }
        i = 0;
        int [] arr = new int[hs.size()];
        for(int e:hs){
            arr[i++] = e;
        }
        return arr;
    }
    public int[] intersection3(int[] nums1, int[] nums2) {
        List<Integer> al = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0 , j = 0 , n1 = nums1.length , n2 = nums2.length;
        while(i < n1 && j < n2){
            if(nums1[i] < nums2[j]){
                i++;
            }
            else if(nums1[i] > nums2[j]){
                j++;
            }
            else{
                if(!al.contains(nums1[i])){
                    al.add(nums1[i]);
                }
                i++;
                j++;
            }
        }
        int [] arr = new int[al.size()];
        for(i = 0; i < arr.length;i++){
            arr[i] = al.get(i);
        }
        return arr;
    }
    public int[] intersection2(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0 , j = 0 , n1 = nums1.length , n2 = nums2.length;
        while(i < n1 && j < n2){
            if(nums1[i] < nums2[j]){
                i++;
            }
            else if(nums1[i] > nums2[j]){
                j++;
            }
            else{
                hs.add(nums1[i]);
                i++;
                j++;
            }
        }
        Object [] obj = hs.toArray();
        int [] arr = new int[obj.length];
        for(i = 0; i < arr.length;i++){
            arr[i] = (int)obj[i];
        }
        return arr;
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>hs1 = new HashSet<>();
        ArrayList<Integer>al = new ArrayList<>();
        for (int i:nums1)
            hs1.add(i);
        for (int i:nums2)
            if (hs1.contains(i)) {
                al.add(i);
                hs1.remove(i);
            }
        int []intersection = new int[al.size()];
        for (int i=0;i<al.size();i++)
            intersection[i] = al.get(i);
//        return al.stream().mapToInt(i -> i).toArray();
        return intersection;
    }
    public static void main(String[] args) {
        int []arr1 = {1,2,2,1};
        int []arr2={2,2};
        int intersection[] = intersection(arr1,arr2);
        System.out.println(Arrays.toString(intersection));
    }
}
