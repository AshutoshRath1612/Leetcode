package Leetcode;

import java.util.HashSet;

public class JewelsStones {
    public static int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> hs = new HashSet<>();
        for(int i=0;i<jewels.length();i++){
            char c = jewels.charAt(i);
            hs.add(c);
        }
        int count =0;
        for(int i=0;i<stones.length();i++){
            if(hs.contains(stones.charAt(i)))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        System.out.println(numJewelsInStones(jewels,stones));
    }
}
