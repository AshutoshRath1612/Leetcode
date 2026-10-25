class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int row = 0; row < numRows; row++) {
            List<Integer> rowResult = new ArrayList<>();

            for (int col = 0; col <= row; col++) {
                if (row == col || col == 0) {
                    rowResult.add(1);
                    continue;
                }
                rowResult.add(result.get(row-1).get(col-1) + result.get(row-1).get(col));
            }

            result.add(rowResult);
        }

        return result;
    }
}
