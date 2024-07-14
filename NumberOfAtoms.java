package Leetcode;

import java.util.*;

public class NumberOfAtoms {
    public static String countOfAtoms(String formula) {
        HashMap<String , Integer> hm = new HashMap<>();
        Stack<HashMap<String , Integer>> stack = new Stack();
        stack.push(new HashMap<>());
        int index = 0;
        while(index < formula.length()) {
            if (formula.charAt(index) == '('){
                stack.push(new HashMap<>());
                index++;
            }
            else if (formula.charAt(index) == ')'){
                HashMap<String,Integer> temp = stack.pop();
                index++;
                int start = index;
                while (index < formula.length() && Character.isDigit(formula.charAt(index))){
                    index++;
                }
                int num = start < index ? Integer.parseInt(formula.substring(start , index)) : 1;
                for (String s : temp.keySet()) {
                    stack.peek().put(s , stack.peek().getOrDefault(s , 0) + temp.get(s) * num);
                }
            }
            else{
                int start = index;
                index++;
                while (index < formula.length() && Character.isLowerCase(formula.charAt(index))){
                    index++;
                }
                String element = formula.substring(start, index);
                start = index;
                while (index < formula.length() && Character.isDigit(formula.charAt(index))){
                    index++;
                }
                int num = start < index ? Integer.parseInt(formula.substring(start,index)) : 1;
                stack.peek().put(element , stack.peek().getOrDefault(element , 0) + num);
            }
        }
        hm = stack.pop();
        ArrayList<String> al = new ArrayList<>(hm.keySet());
        Collections.sort(al);
        StringBuilder sb = new StringBuilder();
        for(String str : al){
            sb.append(str);
            if (hm.get(str) > 1)
                sb.append(hm.get(str));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String formumla = "K4(ON(SO3)2)2";
//        String formumla = "Mg(OH)2";
        System.out.println(countOfAtoms(formumla));
    }
}
