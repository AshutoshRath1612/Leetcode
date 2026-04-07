package Leetcode;

import java.util.HashMap;

/*
Given a roman numeral, convert it to an integer.
 */
public class Roman_to_integer {
    public static int romanToInt2(String s) {
        int result=0;
        int n =s.length();
        while (s!=""){
            int i=0;
            char c = s.charAt(i);
            switch (c){
                case ('I'):
                    if (n>=2 && s.charAt(i+1)=='V') {
                        result += 4;
                        i+=2;
                        n-=2;
                    }
                    else if(n>=2 &&s.charAt(i+1)=='X') {
                        result += 9;
                        i+=2;
                        n-=2;
                    }
                    else {
                        result += 1;
                        i++;
                        n--;
                    }
                    s = s.substring(i ,s.length());
                    break;
                case ('X'):
                    if (n>=2 && s.charAt(i + 1) == 'L' ) {
                        result+= 40;
                        i+=2;
                        n-=2;
                    }
                    else if(n>=2&&s.charAt(i+1)=='C'){
                        result+=90;
                        i+=2;
                        n-=2;
                    }
                    else{
                        result+=10;
                        i++;
                        n--;
                    }
                    s=s.substring(i,s.length());
                    break;
                case ('C'):
                    if (n>=2&&s.charAt(i+1)=='D' ){
                        result+=400;
                        i+=2;
                        n-=2;
                    }
                    else if(n>=2&&s.charAt(i+1)=='M' ){
                        result+=900;
                        i+=2;
                        n-=2;
                    }
                    else{
                        result+=100;
                        i++;
                        n--;
                    }
                    s=s.substring(i,s.length());
                    break;
                case ('V'):
                    result +=5;
                    i++;
                    n--;
                    s=s.substring(i,s.length());
                    break;
                case ('L'):
                    result +=50;
                    i++;
                    n--;
                    s=s.substring(i,s.length());
                    break;
                case ('D'):
                    result +=500;
                    i++;
                    n--;
                    s=s.substring(i,s.length());
                    break;
                case ('M'):
                    result +=1000;
                    i++;
                    n--;
                    s=s.substring(i,s.length());
                    break;
            }
        }
        return result;
    }
    public static int romanToInt(String s) {
        Object [][] romans = {
                {"M",1000} , {"CM",900}, {"D",500}, {"CD",400}, {"C",100}, {"XC",90}, {"L",50}, {"XL",40},
                {"X",10}, {"IX",9}, {"V",5}, {"IV",4}, {"I",1}
        };

        int num = 0;
        int index = 0;
        for(int i=0;i<romans.length;i++){
            while(index<s.length() &&  String.valueOf(s.charAt(index)).equals((String)romans[i][0])){
                num = num + (int)romans[i][1];
                index++;
            }
            if(index<s.length()-1 && String.valueOf(s.charAt(index+1)).equals((String)romans[i][0])){
                i++;
                while(index<s.length()-1 && s.substring(index , index+2).equals((String)romans[i][0])){
                    num = num + (int)romans[i][1];
                    index += 2;
                }
            }
        }
        return num;
    }
    public int romanToInt3(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        hm.put('I' , 1);
        hm.put('V' , 5);
        hm.put('X' , 10);
        hm.put('L' , 50);
        hm.put('C' , 100);
        hm.put('D' , 500);
        hm.put('M' , 1000);
        int ans = 0;
        for(int i =0  ; i<s.length();i++){
            if(i < s.length()-1 && hm.get(s.charAt(i)) < hm.get(s.charAt(i+1))){
                ans -= hm.get(s.charAt(i));
            }
            else{
                ans += hm.get(s.charAt(i));
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String str="MCMXCIV";
        int result = romanToInt(str);
        System.out.println(result);
    }
}
