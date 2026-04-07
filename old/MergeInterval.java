package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeInterval {
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->(a[0]-b[0]));
        if(intervals.length == 1){
            return intervals;
        }
        ArrayList<ArrayList<Integer>> interval = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];
        for(int i = 1 ; i<intervals.length;i++){
            if(intervals[i][0] <= end){
                if(intervals[i][1] >= end){
                    end = intervals[i][1];
                }
                if(intervals[i][0] <= start){
                    start = intervals[i][0];
                }
            }
            else{
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(start);
                temp.add(end);
                interval.add(temp);
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(start);
        ans.add(end);
        interval.add(ans);
        int [][] mergeInterval = new int[interval.size()][2];
        for(int i = 0  ; i < mergeInterval.length;i++){
            mergeInterval[i][0] = interval.get(i).get(0);
            mergeInterval[i][1] = interval.get(i).get(1);
        }
        return mergeInterval;
    }
    public static void main(String[] args) {
        int[][]interval = {{1,4},{0,4}};
        for (int []i: merge(interval)){

        System.out.println(Arrays.toString(i));
        }
    }
}
