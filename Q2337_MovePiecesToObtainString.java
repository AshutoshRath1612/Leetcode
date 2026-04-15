package Leetcode;

public class Q2337_MovePiecesToObtainString {
    public static boolean canChange(String start, String target) {
        char [] startArr = start.toCharArray();
        char [] targetArr= target.toCharArray();
        int n1 = startArr.length, n2 = targetArr.length, i = 0, j = 0;

        while (i < n1 && j < n2) {
            while (i < n1 && startArr[i] == '_'){
                i++;
            }

            while (j < n2 && targetArr[j] == '_') {
                j++;
            }

            if (i == n1 || j == n2) {
                break;
            }

            if (startArr[i] != targetArr[j] || startArr[i] == 'L' && i < j || targetArr[j] == 'R' && i > j) {
                return false;
            }
            i++;
            j++;
        }

        while (i < n1) {
            if (startArr[i] != '_') return false;
            i++;
        }

        while (j < n2) {
            if (targetArr[j] != '_') return false;
            j++;
        }

        return true;
    }
    public static void main(String[] args) {
        String start = "_L__R__R_";
        String target = "L______RR";

        System.out.println(canChange(start,target));
    }
}
