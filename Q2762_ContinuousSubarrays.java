import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.PriorityQueue;

public class Q2762_ContinuousSubarrays {
    public static long continuousSubarrays(int[] nums) {
        PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> min = new PriorityQueue<>();

        int left = 0;
        long res = 0;

        for (int right = 0; right < nums.length; right++) {
            max.add(nums[right]);
            min.add(nums[right]);

            while (left < right && max.peek() - min.peek() > 2) {
                max.remove(nums[left]);
                min.remove(nums[left]);
                left++;
            }
            res += right - left + 1;

        }
        return res;
    }
    public static long continuousSubarrays1(int [] nums) {
        Deque<Integer> max = new ArrayDeque<>();
        Deque<Integer> min = new ArrayDeque<>();

        int left = 0;
        long res = 0;

        for (int right = 0 ; right < nums.length; right++) {
            while (!max.isEmpty() && max.peekLast() < nums[right]) {
                max.pollLast();
            }
            max.offerLast(nums[right]);

            while (!min.isEmpty() && min.peekLast() > nums[right]) {
                min.pollLast();
            }
            min.offerLast(nums[right]);

            while (left < right && max.peek() - min.peek() > 2) {
                if (max.peekFirst() == nums[left]) {
                    max.pollFirst();
                }

                if (min.peekFirst() == nums[left]) {
                    min.pollFirst();
                }
                left++;
            }
            res += right - left + 1;
        }
        return res;
    }
    static void main() {
        int [] nums = {65,66,67,66,66,65,64,65,65,64};
        System.out.println(continuousSubarrays(nums));
    }
}
