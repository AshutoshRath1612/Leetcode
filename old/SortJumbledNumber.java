package Leetcode;

import java.util.Arrays;

public class SortJumbledNumber {
    public static int[] sortJumbled(int[] mapping, int[] nums) {
        int[][] mappingArr = new int[nums.length][2];
        int index = 0;
        for(int i : nums){
            int temp  = i;
            int mapNum = 0;
            int place = 1;
            while(temp > 0){
                mapNum = mapping[temp%10] * place + mapNum;
                temp = temp/10;
                place = place * 10;
            }
            if(i == 0){
                mapNum = mapping[i];
            }
            mappingArr[index][0] = mapNum;
            mappingArr[index++][1] = i;
        }
        Arrays.sort(mappingArr, (a, b)->{
            return a[0]-b[0];
        });
        for(int i = 0 ; i < nums.length;i++){
            nums[i] = mappingArr[i][1];
        }
        return  nums;
    }
    public static void main(String[] args) {
        int [] jumbled = {8,9,4,0,2,1,3,5,7,6};
        int  [] nums = {991,38,388};
        System.out.println(sortJumbled(jumbled,nums));
    }
}
