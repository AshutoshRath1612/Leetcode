package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeInterval {
    public static int[][] merge(int[][] intervals) {
            if(intervals.length == 1){
                return intervals;
            }
            ArrayList<ArrayList<Integer>> interval = new ArrayList<>();
            ArrayList<Integer> al = new ArrayList<>();
            al.add(intervals[0][0]);
            al.add(intervals[0][1]);
            interval.add(al);
            int index = 0;
            for(int i = 1 ; i<intervals.length;i++){
                if(intervals[i][0] <= intervals[i-1][1]){
                    interval.get(index).set(0,Math.min(intervals[i][0],intervals[i-1][0]));
                    interval.get(index).set(1,intervals[i][1]);
                }
                else{
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(intervals[i][0]);
                    temp.add(intervals[i][1]);
                    interval.add(temp);
                    index++;
                }
            }
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
