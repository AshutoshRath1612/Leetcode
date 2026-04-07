package Leetcode;

public class SpiralMatrix_IV {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int [][]spiral = new int[m][n];
        for(int i = 0; i<m;i++){
            for(int j = 0; j < n; j++){
                spiral[i][j] = -1;
            }
        }
        int top = 0;
        int left = 0;
        int right = n-1;
        int bottom = m-1;
        while(head!=null){
            if(right==left && top == bottom){
                spiral[top][left] = head.val;
                head = head.next;
            }
            for(int i=left;i<right&& head!=null;i++){
                spiral[top][i] = head.val;
                head = head.next;
            }
            for(int i = top;i<bottom&& head!=null;i++){
                spiral[i][right] =  head.val;
                head = head.next;
            }
            for(int i = right; i > left&& head!=null; i--){
                spiral[bottom][i] = head.val;
                head = head.next;
            }
            for(int i = bottom; i > top&& head!=null; i--){
                spiral[i][left] = head.val;
                head = head.next;
            }
            top++;
            left++;
            right--;
            bottom--;
        }
        return spiral;
    }
    public static void main(String[] args) {

    }
}
