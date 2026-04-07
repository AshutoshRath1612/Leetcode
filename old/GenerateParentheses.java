package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenerateParentheses {
    public static List<String> generateParenthesis(int n) {
        ArrayList<String> al = new ArrayList<>();
//        generateParenthesis(al , "" ,0 , n);
        generateParenthesis(al,new char[2*n] , 0);
        return al;
    }

    public static void generateParenthesis(ArrayList<String> al, char[] chars, int n) {
        if (chars.length == n){
            if (valid(chars))
                al.add(new String(chars));
        }
        else {
            chars[n] ='(';
            generateParenthesis(al,chars,n+1);
            chars[n]=')';
            generateParenthesis(al,chars,n+1);
        }
    }
    public static boolean valid(char[]chars){
        int balance=0;
        for (char c:chars){
            if (c=='(')
                balance++;
            else
                balance--;
            if (balance<0)
                return false;
        }
        return balance==0;
    }
    public static void generateParenthesis(ArrayList<String>al ,String str, int count , int n ){
        if (count == 2*n){
            if (balance(str))
                al.add(str);
        }
        else{
            if (count<=2*n) {
                str += " ";
                str = str.replace(str, str.substring(0, count) + "(");
                generateParenthesis(al, str, count+1, n);
                str = str.replace(str, str.substring(0, count) + ")");
                generateParenthesis(al, str, count+1, n);
            }
            else
                return;
        }
    }
    public static boolean balance(String str){
        int balance =0;
        for (int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if (c== '(')
                balance++;
            else
                balance--;
            if (balance<0)
                return false;
        }
        return  balance==0;
    }

    public static void main(String[] args) {
        int n=3;
        List<String> al = generateParenthesis(n);
        System.out.println(al);
    }
}
