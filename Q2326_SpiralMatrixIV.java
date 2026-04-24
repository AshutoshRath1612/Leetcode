package Leetcode;
import Leetcode.ListNode;

import java.util.Arrays;

public class Q2326_SpiralMatrixIV {
    public static int[][] spiralMatrix(int m, int n, ListNode head) {
        int [][] matrix = new int[m][n];
        ListNode temp = head;

        for (int[] ints : matrix) {
            Arrays.fill(ints, -1);
        }

        int top = 0, left = 0, bottom = m-1, right = n-1;

        while (temp != null) {
            for (int i = left; i <= right && temp != null; i++) {
                matrix[top][i] = temp.val;
                temp = temp.next;
            }
            for(int i = top+1; i <= bottom && temp != null; i++) {
                matrix[i][right] = temp.val;
                temp = temp.next;
            }
            for (int i = right-1; i >= left && temp != null; i--) {
                matrix[bottom][i] = temp.val;
                temp = temp.next;
            }
            for (int i = bottom-1; i > top && temp != null; i--) {
                matrix[i][left] = temp.val;
                temp = temp.next;
            }
            top++;
            right--;
            bottom--;
            left++;

        }
        return matrix;
    }
    public static void main(String[] args) {
        int [] arr = {3,0,2,6,8,1,7,9,4,2,5,5,0};
        ListNode head = makeListNodes(arr);
        int [][] matrix = spiralMatrix(3,5,head);
        printMatrix(matrix);
    }

    public static void printMatrix(int [][] matrix) {
        for(int[] row: matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static ListNode makeListNodes(int [] arr) {
        ListNode result = new ListNode(Integer.MIN_VALUE);
        ListNode temp = result;
        for (int i : arr) {
            ListNode newNode = new ListNode(i);
            temp.next = newNode;
            temp = temp.next;
        }
        return result.next;
    }
}
