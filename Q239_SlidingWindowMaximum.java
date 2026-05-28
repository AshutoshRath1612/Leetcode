import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Q239_SlidingWindowMaximum {
    public static int[] maxSlidingWindow1(int[] nums, int k) {
        int [] result = new int[nums.length - k + 1];
        int index = 0;
        int currentMaxIndex = 0;

        for (int i = 0; i < k; i++) {
            if (nums[i] > nums[currentMaxIndex]) {
                currentMaxIndex = i;
            }
        }
        result[index++] = nums[currentMaxIndex];

        for (int i = k; i < nums.length; i++) {
            if (currentMaxIndex > i-k && nums[currentMaxIndex] < nums[i]) {
                currentMaxIndex = i;
            }
            else if (currentMaxIndex <= i-k) {
                currentMaxIndex = i;
                for(int j = i-k; j < i; j++) {
                    if (nums[currentMaxIndex] < nums[j]) {
                        currentMaxIndex = i;
                    }
                }
            }

            result[index++] = nums[currentMaxIndex];
        }
        return result;
    }
    public static int[] maxSlidingWindow(int [] nums, int k) {
            int [] result = new int[nums.length - k + 1];
            int index = 0;
            Deque<Integer> dq = new ArrayDeque<>();

            for (int i = 0; i < nums.length; i++) {
                while (!dq.isEmpty() && dq.peekFirst() <= i-k) {
                    dq.pollFirst();
                }

                while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
                    dq.pollLast();
                }
                dq.offerLast(i);

                if (i >= k-1) {
                    result[index++] = nums[dq.peekFirst()];
                }
            }

            return result;
    }
    static void main() {
        int [] nums = {1,3,-1,-3,5,3,6,7};
        System.out.println(Arrays.toString(maxSlidingWindow(nums, 3)));
    }
}
