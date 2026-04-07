package Leetcode;

import java.util.Arrays;

public class AverageSalarayExcludingMM {
    public static double average(int[] salary) {
        Arrays.sort(salary);
        int total=0;
        for (int i=1;i<salary.length-1;i++){
            total += salary[i];
        }
        return (double) total/(salary.length-2);
    }

    public static void main(String[] args) {
        int[]salary = {4000,3000,1000,2000};
        System.out.println(average(salary));
    }
}
