package Leetcode;

/*
Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".
 */
public class Defanging_IP {
    public static String defangIPaddr(String address) {
        String str ="";
        for (int i=0;i<address.length();i++){
            if (address.charAt(i)=='.'){
                str+="[.]";
            }
            else
                str+= address.charAt(i);
        }
        return str;
    }

    public static void main(String[] args) {
        String str ="255.100.50.0";
        str = defangIPaddr(str);
        System.out.println(str);
    }
}
