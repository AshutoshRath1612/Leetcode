package Leetcode;

import java.util.Arrays;

public class Q1833_MaximumIcecreamBars {
    public static int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int left = 0, count = 0, spent = 0;

        if (costs[0] > coins) {
            return 0;
        }

        for (int right  = 0; right < costs.length; right++) {
            spent += costs[right];

            while (left < right && spent > coins) {
                spent -= costs[left++];
            }
            count = Math.max(count, right - left + 1);
        }
        return count;
    }
    public static int maxIceCream1(int [] costs, int coins) {
        Arrays.sort(costs);
        int count = 0;

        for (int i: costs) {
            if (i <= coins) {
                count++;
                coins -= i;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int [] costs = {1,3,2,4,1};
        int coins = 7;
        System.out.println(maxIceCream(costs,coins));
    }
}
