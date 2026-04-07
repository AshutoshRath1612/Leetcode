package Leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class SortPeople {
    public static String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer, String> people = new HashMap<>();
        for(int i = 0 ;i<names.length;i++){
            people.put(heights[i] , names[i]);
        }
        Arrays.sort(heights);
        int index = 0;
        for(int i = names.length-1; i >=0 ;i--){
            names[index++] = people.get(heights[i]);
        }
        return names;
    }

    public static void main(String[] args) {
        int[] heights = {210,180,150};
        String [] names = {"Mary" , "Sandy" , "Klaus"};
        System.out.println(sortPeople(names,heights));
    }
}
