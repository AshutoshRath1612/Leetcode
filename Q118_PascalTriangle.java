package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Q118_PascalTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int currentRow = 0; currentRow < numRows; currentRow++) {
            List<Integer> row = new ArrayList<>();
            for (int i = 0; i <= currentRow; i++) {
                if (i == 0 || i == currentRow) {
                    row.add(1);
                }
                else {
                    row.add(triangle.get(currentRow - 1).get(i-1) + triangle.get(currentRow-1).get(i));
                }
            }
            triangle.add(row);
        }

        return triangle;
    }
    public static void main(String[] args) {
        int numRows = 5;
        System.out.println(generate(numRows));
    }
}
