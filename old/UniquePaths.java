package Leetcode;

public class UniquePaths {
    //TABULATION
    public static int uniquePath1(int m , int n){
        if (m == 1 && n ==1){
            return 1;
        }
        int [][]dp = new int[m][n];
        dp[0][0] = 1;
        for (int i = 0; i < m;i++){
            for (int j = 0; j < n ;j++){
                if (i > 0){
                    dp[i][j] += dp[i-1][j];
                }
                if (j > 0){
                    dp[i][j] += dp[i][j-1];
                }
            }
        }

        return dp[m-1][n-1];
    }

    //Memoization
    public static int uniquePath(int m , int n){
        if (m == 1 && n == 1){
            return 1;
        }
        int[][] dp = new int[m][n];
        for (int []arr : dp){
            for (int i = 0; i < arr.length ; i++){
                arr[i] = -1;
            }
        }
        solve(m-1 , n-1 , dp);
        return dp[m-1][n-1];
    }
    public static  int solve(int row , int column , int [][]dp){
        if (row == 0 && column == 0){
            return 1;
        }
        if (row < 0 || column < 0){
            return 0;
        }
        if (dp[row][column] > -1){
            return  dp[row][column];
        }
        int up = solve(row - 1 , column , dp);
        int left = solve(row,column-1,dp);
        return dp[row][column] = up + left;
    }
    public static void main(String[] args) {
        System.out.println(uniquePath1(3,7));
    }

}
