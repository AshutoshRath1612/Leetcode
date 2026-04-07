package Leetcode;

public class ValidSudoku {
    public static void main(String[] args) {

    }
    public boolean isValidSudoku(char[][] board) {
        int n = board.length;
        int row =-1;
        int column =-1;
        boolean emptyleft =true;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (board[i][j] == '.'){
                    row = i;
                    column = j;
                    emptyleft =false;
                    break;
                }
            }
            if (emptyleft == false)
                break;
        }
        if (emptyleft)
            return true;

        for (int num =1;num<=9;num++){
            if (safe(board,row,column ,num)){
                board[row][column] = (char) (num + '0');
                if (isValidSudoku(board))
                    return true;
                else
                    board[row][column] = '.';
            }
        }
        return false;
    }

    public static boolean safe(char[][] board, int row, int column, int num) {
        for (int i=0;i<board.length;i++){
            char n = (char)(num + '0');
            if ( board[row][i] == n)
                return false;
        }
        for (int i=0;i<board.length;i++){
            char n = (char)(num + '0');
            if ( board[i][column] == n)
                return false;
        }
        int sqrt = (int)(Math.sqrt(board.length));
        int rowstart = row - row%sqrt;
        int colstart = column - column%sqrt;
        for (int r = rowstart;r<rowstart+sqrt;r++){
            for (int c = colstart;c<colstart+sqrt;c++){
                if (board[r][c]==(char)(num + '0'))
                    return false;
            }
        }
        return true;
    }
    }


