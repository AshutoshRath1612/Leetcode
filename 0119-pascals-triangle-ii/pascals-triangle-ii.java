class Solution {
        int dp[][];
    public List<Integer> getRow(int rowIndex) {
        dp = new int[rowIndex+1][rowIndex+1];
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i <= rowIndex; i++) {
            calculate(rowIndex, i);
        }

        for (int i: dp[rowIndex]) {
                result.add(i);
        }
        return result;
    }
    public int calculate(int row, int column) {
        if (row == 0 || column == 0 || row == column) {
            dp[row][column] = 1;
            return 1;
        }

        if(dp[row][column] != 0) {
            return dp[row][column];
        }

        dp[row][column] = calculate(row-1, column-1) + calculate(row-1, column);

        return dp[row][column];
    }
}
