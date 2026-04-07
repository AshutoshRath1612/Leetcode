package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class FindTheWinner {
    public static int findTheWinner(int n, int k) {
        ArrayList<Integer>friends= new ArrayList<>();
        for (int i = 1;i<=n;i++){
            friends.add(i);
        }
        int remaining = n;
        int curr = 0;
        while (remaining > 1){
            curr = (curr + k - 1)%remaining;
            friends.remove(curr);
            remaining--;
        }
        return friends.get(0);
    }
    public int findTheWinner2(int n, int k) {
        if(n == 1)
            return 1;
        int result = findTheWinner2(n-1,k) + k;
        return result % n ==0 ? n : result % n;
    }

    public static void main(String[] args) {
        System.out.println(findTheWinner(5,2));
    }
}
