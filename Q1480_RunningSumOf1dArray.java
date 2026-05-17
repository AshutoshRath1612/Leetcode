import java.util.Arrays;

public class Q1480_RunningSumOf1dArray {
    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i-1];
        }

        return nums;
    }
    static void main() {
        int [] arr = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(arr)));
    }
}
