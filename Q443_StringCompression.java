package Leetcode;

import java.util.Arrays;

public class Q443_StringCompression {
    public static int compress(char[] chars) {

        if (chars.length == 1) {
            return chars.length;
        }

        int readIndex = 1, writeIndex = 1;

        while (readIndex < chars.length) {
            int count = 1;
            while (readIndex < chars.length && chars[readIndex] == chars[readIndex-1]) {
                count++;
                readIndex++;
            }

            if (count == 1) {
                chars[writeIndex++] = chars[readIndex++];
                continue;
            }

            char [] charCount = String.valueOf(count).toCharArray();

            for (int i =0; i<charCount.length;i++) {
                chars[writeIndex++] = charCount[i];
            }

            if (readIndex < chars.length) {
                chars[writeIndex++] = chars[readIndex++];
            }
        }
        return writeIndex;
    }
    public static void main(String[] args) {
        char [] chars = {'a','a','b','b','c','c','c'};
        System.out.println(Arrays.toString(Arrays.copyOf(chars, compress(chars))));
    }
}
