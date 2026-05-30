package Leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

public class Q2593_FindScoreAfterMarkingAllElements {
    public static long findScore1(int[] nums) {
        long score = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        HashMap<Integer, List<Integer>> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            hm.putIfAbsent(nums[i], new ArrayList<>());
            hm.get(nums[i]).add(i);
            pq.add(nums[i]);
        }
        System.out.println(pq);
        System.out.println(hm);

        while (hm.size() != 0 && !pq.isEmpty()) {
            int smallestNum = pq.remove();

            if (hm.containsKey(smallestNum)) {
            int smallestNumIndex = hm.get(smallestNum).getFirst();

            if (smallestNumIndex > 0 && hm.containsKey(nums[smallestNumIndex - 1])) {
                hm.get(nums[smallestNumIndex-1]).remove(Integer.valueOf(smallestNumIndex-1));

                if (hm.get(nums[smallestNumIndex-1]).isEmpty()) {
                    hm.remove(nums[smallestNumIndex-1]);
                }
            }
            if (smallestNumIndex < nums.length - 1 && hm.containsKey(nums[smallestNumIndex + 1])) {
                hm.get(nums[smallestNumIndex+1]).remove(Integer.valueOf(smallestNumIndex+1));

                if (hm.get(nums[smallestNumIndex+1]).isEmpty()) {
                    hm.remove(nums[smallestNumIndex+1]);
                }
            }
            if (hm.containsKey(nums[smallestNumIndex])) {
                hm.get(nums[smallestNumIndex]).remove(Integer.valueOf(smallestNumIndex));
                if (hm.get(nums[smallestNumIndex]).isEmpty()) {
                    hm.remove(nums[smallestNumIndex]);
                }
            }
            score += nums[smallestNumIndex];
            }
        }
        return score;
    }
    public static long findScore(int [] nums) {
        long score = 0;
        boolean [] marked = new boolean[nums.length];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]);

        for (int i = 0; i < nums.length; i++) {
            pq.add(new int[]{nums[i], i});
        }

        while (!pq.isEmpty()) {
            int [] smallest = pq.remove();

            if (marked[smallest[1]]) {
                continue;
            }

            if (smallest[1] > 0) {
                marked[smallest[1] - 1] = true;
            }

            if (smallest[1] < nums.length - 1) {
                marked[smallest[1] + 1] = true;
            }

            score += smallest[0];
            marked[smallest[1]] = true;
        }
        return score;
    }
    public static void main(String[] args) {
        int [] nums = {10,44,10,8,48,30,17,38,41,27,16,33,45,45,34,30,22,3,42,42};
        System.out.println(findScore(nums));
    }
}
