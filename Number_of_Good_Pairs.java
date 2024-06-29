package Leetcode;

/*
A pair (i, j) is called good if nums[i] == nums[j] and i < j.
 */
public class Number_of_Good_Pairs {
    public static int numIdenticalPairs(int[] nums) {
        int i =0;
        int index = i+1;
        int count = 0;
        while(i < nums.length-1){
            if(nums[i] == nums[index]){
                count++;
            }
            index++;
            if(index == nums.length){
                i++;
                index = i+1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int []arr= {1,2,3};
        int res = numIdenticalPairs(arr);
        System.out.println(res);
    }
}

