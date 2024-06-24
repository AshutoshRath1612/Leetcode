package Leetcode;

public class MostProfitAssigningWork {
    public static int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int totalProfit = 0;
        for(int i=0;i<worker.length;i++){
            int currentD =0;
            int currentPr = 0;
            for(int j = 0 ; j < difficulty.length;j++){
                if(difficulty[j] <= worker[i]  && currentPr < profit[j]){
                    currentD = difficulty[j];
                    currentPr = profit[j];
                }
            }
            System.out.println(currentPr);
            totalProfit += currentPr;
        }
        return totalProfit;
    }

    public static void main(String[] args) {
        int [] profit = {67,17,1,81,3};
        int [] difficulty = {68,35,52,47,86};
        int [] worker = {92,10,85,84,82};
        System.out.println(maxProfitAssignment(difficulty , profit , worker));
    }
}
