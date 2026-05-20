import java.util.Arrays;
import java.util.HashSet;

public class Q2657_FIndPrefixCommonArrayOfTwoArray {
    public static int[] findThePrefixCommonArray1(int[] A, int[] B) {
        int n = A.length;
        int[] C = new int[n];
        int[] frequency = new int[n];
        int common = 0;
        for (int i = 0; i < n; i++) {
            frequency[A[i]-1]++;
            if (frequency[A[i]-1] == 2) {
                common++;
            }
            frequency[B[i]-1]++;
            if (frequency[B[i]-1] == 2) {
                common++;
            }

            C[i] = common;
        }
        return C;
    }

    public static int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int[] C = new int[n];
        for (int i = 0; i < n; i++) {
            HashSet<Integer> hs = new HashSet<>();

            for (int j = 0; j <= i; j++) {
                hs.add(A[j]);
            }
            int count = 0;
            for (int j = 0; j <= i; j++) {
                if (hs.contains(B[j])) {
                    count++;
                }
            }
            C[i] = count;
        }


        return C;
    }
    static void main() {
        int [] A = {1,2,3,4};
        int [] B = {2,2,3,1};
        System.out.println(Arrays.toString(findThePrefixCommonArray1(A,B)));
    }
}
