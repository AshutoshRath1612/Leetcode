package Leetcode;

import java.util.Arrays;

public class RelativeSortArray {
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int []counting = new int[1001];
        for (int n:arr1){
            counting[n]++;
        }
        int i=0;
        for (int n:arr2){
            while (counting[n]-- > 0)
                arr1[i++] = n;
        }
        for (int j=0;j<counting.length;j++){
            while (counting[j]-- > 0)
                arr1[i++] = j;
        }
        return arr1;
    }

    public static void main(String[] args) {
        int []arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int []arr2 = {2,1,4,3,9,6};
        int []relativesort = relativeSortArray(arr1,arr2);
        System.out.println(Arrays.toString(relativesort));
    }
}
