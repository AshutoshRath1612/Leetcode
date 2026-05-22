import java.util.Arrays;

public class Q1652_DefuseTheBomb {
    public static int[] decrypt(int[] code, int k) {
        int n = code.length;
        int [] result = new int[n];
        int [] sums = new int[n*2];
        sums[0] = code[0];

        for (int i = 1; i < sums.length; i++) {
            sums[i] += sums[i-1] + code[i%n];
        }

        for (int i = 0; i < code.length; i++) {
            if (k > 0) {
                result[i] = sums[i+k] - sums[i];
            }
            else {
                System.out.println(n+i-1+k);
                result[i] = sums[n+i-1] - sums[n+i-1+k];
            }
        }
        System.out.println(Arrays.toString(sums));

        return result;
    }
    static void main() {
        int [] code = {2,4,9,3};
        int k = -2;
        System.out.println(Arrays.toString(decrypt(code, k)));
    }
}
