package Leetcode;

import java.util.Arrays;

public class Q621_TaskScheduler {
    public static int leastInterval(char[] tasks, int n) {
        int [] frequency = new int[26];
        int [] intervals = new int[26];
        Arrays.fill(intervals, 0);
        for (char c: tasks) {
            frequency[c - 'A']++;
        }
        int count = 0;
        while(!endOfProcess(frequency)) {
            int sequence = getNextSequence(frequency, intervals);
            count++;
            decreaseInterval(intervals);
            if (sequence != -1) {
                intervals[sequence] = n;
                frequency[sequence]--;
            }

        }

        return count;
    }
    public static boolean endOfProcess(int [] frequency) {
        for (int i: frequency) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
    public static int getNextSequence(int [] frequency, int [] intervals) {
        int nextSequence = -1;

        for (int i = 0; i < intervals.length; i++) {
            if(intervals[i] == 0 && frequency[i] != 0) {
                if(nextSequence == -1) {
                    nextSequence = i;
                }
                else if(frequency[nextSequence] < frequency[i]){
                    nextSequence = i;
                }
            }
        }
        return nextSequence;
    }
    public static void decreaseInterval(int [] intervals) {
        for(int i = 0; i < intervals.length; i++) {
            if(intervals[i] != 0){
                intervals[i]--;
            }
        }
    }

    public static int leastInterval2(char[] tasks, int n) {
        int [] freq = new int[26];

        for (int i : tasks) {
            freq[i - 'A']++;
        }

        int maxFreq = 0;
        for (int i: freq) {
            maxFreq = Math.max(maxFreq, i);
        }

        int numberOfMaxFreq = 0;
        for (int i: freq) {
            if (maxFreq == i) {
                numberOfMaxFreq++;
            }
        }

        int res = (maxFreq - 1) * (n+1) + numberOfMaxFreq;
        int ans = Math.max(res, tasks.length);
        return ans;
    }
    public static void main(String[] args) {
        char [] tasks = {'A', 'B', 'A', 'A', 'B'};
        int n = 2;
        System.out.println(leastInterval(tasks,n));
    }
}
