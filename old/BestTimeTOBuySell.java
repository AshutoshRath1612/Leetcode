package Leetcode;

public class BestTimeTOBuySell {
    public static int maxProfit(int[] prices) {
        int max=0,min=Integer.MAX_VALUE;
        for (int i=0;i<prices.length;i++){
            if (prices[i]<min)
                min = prices[i];
            else if(prices[i] - min > max)
                max = prices[i] -min;
        }
        return max;
    }
    public int maxProfit1(int[] prices) {
        int maxProfit = 0 ,  min = Integer.MAX_VALUE;
        for(int i = 0 ;i < prices.length; i++){
            min = Math.min(min , prices[i]);
            maxProfit = Math.max(maxProfit , prices[i] - min);
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int []prices = {7,1,5,3,6,4};
        int maxprofit = maxProfit(prices);
        System.out.println(maxprofit);
    }
}
