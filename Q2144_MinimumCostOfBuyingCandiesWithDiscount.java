package Leetcode;

import java.util.Arrays;

public class Q2144_MinimumCostOfBuyingCandiesWithDiscount {
    public static int minimumCost(int[] cost) {
        int result = 0;
        Arrays.sort(cost);

        for (int i: cost) {
            result += i;
        }
        for (int i = cost.length - 3; i >= 0; i-=3) {
            result -= cost[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int [] cost = {1,2,3};
        System.out.println(minimumCost(cost));
    }
}
