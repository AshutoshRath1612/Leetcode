import java.util.Arrays;

public class Q2090_KRadiusSubarrayAverage {
    public static int[] getAverages(int[] nums, int k) {
        int [] result = new int[nums.length];
        int sum = 0;
        Arrays.fill(result, -1);

        for (int i = 0; i < k*2 && i < nums.length; i++) {
            sum += nums[i];
        }

        for (int i = k; i < nums.length - k; i++) {
            sum += nums[i+k];
            result[i] = sum/(k*2 + 1);
            sum -= nums[i-k];
        }

        return result;
    }
    static void main() {
        int [] arr = {7,4,3,9,1,8,5,2,6};
        int k = 3;
        System.out.println(Arrays.toString(getAverages(arr, k)));
    }
}
