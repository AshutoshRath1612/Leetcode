package Leetcode;

public class Richest_Customer_Wealth {
    public static int maximumWealth(int[][] accounts) {
        int maxWealth=0;
        for (int i=0;i<accounts.length;i++){
            int wealth =0;
            for (int j=0;j<accounts[i].length;j++)
                wealth += accounts[i][j];
            if (wealth>maxWealth)
                maxWealth=wealth;
        }
        return maxWealth;
    }
    public static void main(String[] args) {
        int[][]arr={{2,7},{7,1,3},{1,9,5}};
        int rich = maximumWealth(arr);
        System.out.println(rich);
    }
}
