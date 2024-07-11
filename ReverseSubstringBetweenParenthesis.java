package Leetcode;

import java.util.Stack;

public class ReverseSubstringBetweenParenthesis {
    public static String reverseParentheses(String s) {
        Stack stack = new Stack();
        for(int i = 0 ; i < s.length();i++){
            if(s.charAt(i) == ')'){
                StringBuilder sb = new StringBuilder();
                while((char)stack.peek() != '('){
                    sb.append(stack.pop());
                }
                stack.pop();
                for(int j  = 0; j < sb.length();j++){
                    stack.push(sb.charAt(j));
                }
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.insert(0, stack.pop());
        }
        return sb.toString();

    }
    public static String reverseParentheses1(String str){
        Stack<StringBuilder> stack  = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length();i++){
            if(str.charAt(i) == '('){
                stack.push(sb);
                sb = new StringBuilder();
            }
            else if(str.charAt(i) == ')'){
                sb.reverse();
                if(!stack.isEmpty()){
                    stack.peek().append(sb);
                    sb = stack.pop();
                }
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "(u(love)i)";
        System.out.println(reverseParentheses1(str));
    }
}
