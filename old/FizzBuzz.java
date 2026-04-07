package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static List<String> fizzBuzz(int n) {
        List<String> al = new ArrayList<>();
        for(int i=1;i<=n;i++){
            al.add(getString(i));
        }
        return al;
    }
    public static String getString(int n){
        if(n%3==0 && n%5==0)
            return "FizzBuzz";
        else if(n%3==0 || n%5==0){
            if(n%3==0)
                return "Fizz";
            else
                return "Buzz";
        }
        else
            return ""+n;
    }

    public static void main(String[] args) {
        int n=15;
        List<String>al = fizzBuzz(n);
        System.out.println(al);
    }
}
