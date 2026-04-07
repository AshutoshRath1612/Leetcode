package Leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class RankTransform {
    public static int[] arrayRankTransform(int[] arr) {
        int []clonee = arr.clone();
        int rankk=1;
        int []rank = new int[arr.length];
       Arrays.sort(arr);
       for (int i=0;i< arr.length;i++){
           while(i+1 < arr.length && arr[i]==arr[i+1])
               i++;
           for (int j=0;j<arr.length;j++){
               if (arr[i]==clonee[j])
                   rank[j]=rankk;
           }
           rankk++;
       }
       return rank;
    }
    public static int[] arrayRankTransform2(int[] arr) {
        HashMap<Integer,Integer>hm = new HashMap<>();
        int []rank = arr.clone();
        Arrays.sort(rank);
        for (int n:rank){
            hm.putIfAbsent(n,hm.size()+1);
        }
        for (int i=0;i<arr.length;i++){
            arr[i] = hm.get(arr[i]);
        }
        return arr;
    }
    public static void main(String[] args) {
        int[]arr = {37,12,28,9,100,56,80,5,12};
        int rank[] = arrayRankTransform2(arr);
        System.out.println(Arrays.toString(rank));
    }
}
