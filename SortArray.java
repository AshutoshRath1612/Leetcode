package Leetcode;

import java.util.Arrays;

public class SortArray {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length);
        return nums;
    }
    public void mergeSort(int [] arr , int s,int e){
        if(e - s == 1){
            return;
        }
        int mid = s + (e-s)/2;
        mergeSort(arr , s , mid);
        mergeSort(arr, mid , e);
        merge(arr , s , mid ,e);
    }
    public void merge(int [] arr , int s , int mid , int e){
        int mix[]  = new int[e-s];
        int i = s;
        int j = mid;
        int index = 0;
        while(i <  mid && j < e){
            if(arr[i] < arr[j]){
                mix[index++] = arr[i++];
            }
            else if(arr[i] > arr[j]){
                mix[index++] = arr[j++];
            }
            else{
                mix[index++] = arr[i++];
                mix[index++] = arr[j++];
            }
        }
        while(i < mid){
            mix[index++] = arr[i++];
        }
        while(j < e){
            mix[index++] = arr[j++];
        }
        for(i = 0; i< mix.length;i++){
            arr[s+i] = mix[i];
        }
    }

    public static void main(String[] args) {
        int[]arr={5,4,3,2,1};
        SortArray sa = new SortArray();
        System.out.println(Arrays.toString(sa.sortArray(arr)));
    }
}
