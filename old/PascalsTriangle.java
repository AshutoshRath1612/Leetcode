package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ll = new ArrayList<>();
        for (int i=0;i<numRows;i++){
            List<Integer> l = new ArrayList<>();
            for (int j=0;j<=i;j++){
                if (j==0 || j==i){
                    l.add(1);
                }
                else{
                    if (i>1) {
                        int sum = ll.get(i - 1).get(j - 1) + ll.get(i - 1).get(j);
                        l.add(sum);
                    }
                }
            }
            ll.add(l);
        }
        return ll;
    }
    public static void main(String[] args) {
        int numrows =1;
        List<List<Integer>> L = generate(numrows);
        System.out.println(L);
    }
}