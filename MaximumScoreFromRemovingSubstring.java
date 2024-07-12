package Leetcode;

import java.util.Stack;

public class MaximumScoreFromRemovingSubstring {
    public static int maximumGain1(String s, int x, int y) {
        int maxScore = 0;
        String maxScoreString = x > y ? "ab" : "ba";
        StringBuilder sb = new StringBuilder(s);
        while(sb.indexOf(maxScoreString) != -1){
            maxScore += maxScoreString.equals("ab") ? x : y;
            System.out.println(s.indexOf(maxScoreString));
            sb.replace(s.indexOf(maxScoreString) , s.indexOf(maxScoreString)+2 , "");
        }
        String minScoreString = x > y ? "ba" : "ab";
        while(sb.indexOf(minScoreString) != -1){
            maxScore += minScoreString.equals("ab") ? x : y;
            sb.replace(s.indexOf(minScoreString) , s.indexOf(minScoreString)+2 , "");
        }
        return maxScore;
    }
    public static int maximumGain(String str , int x ,int y){
        if(x > y){
            return getMaxScore(str , 'a' , 'b' , x ,y);
        }
        else{
            return getMaxScore(str,'b' , 'a' , y , x);
        }
    }
    public static int getMaxScore(String str , char first , char second , int firstScore , int secondScore){
        Stack<Character> stack = new Stack<>();
        int score = 0;
        for(char c : str.toCharArray()){
            if(c == second && !stack.isEmpty() && stack.peek() == first){
                stack.pop();
                score += firstScore;
            }
            else{
                stack.push(c);
            }
        }
        Stack<Character> stack1 = new Stack<>();
        while(!stack.isEmpty()){
            char c = stack.pop();
            if(c  == second && !stack1.isEmpty() && stack1.peek() == first){
                stack1.pop();
                score += secondScore;
            }
            else{
                stack1.push(c);
            }
        }
        return score;
    }
    public static void main(String[] args) {
        String str = "aabbaaxybbaabb";
        int x = 5;
        int y = 4;
        System.out.println(maximumGain(str,x,y));
    }
}
