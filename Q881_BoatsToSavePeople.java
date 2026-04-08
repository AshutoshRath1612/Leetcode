package Leetcode;

import java.util.Arrays;

/*
You are given an array people where people[i] is the weight of the ith person, and an infinite number of boats
where each boat can carry a maximum weight of limit. Each boat carries at most two people at the same time,
provided the sum of the weight of those people is at most limit.

Return the minimum number of boats to carry every given person.
 */

public class Q881_BoatsToSavePeople {
    public static int numRescueBoats(int[] people, int limit) {
        int boats = 0;
        int left = 0, right = people.length-1;

        Arrays.sort(people);

        while (right >= 0 && people[right] == limit) {
            boats++;
            right--;
        }

        while (left <= right) {
//            int currentBoatCapacity = limit;
//
//            currentBoatCapacity -= people[right];
//            right--;
//
//            if (currentBoatCapacity >= people[left])
//                left++;
//            boats++;

            if (limit - people[right] >= people[left])
                left++;

            right--;
            boats++;
        }

        return boats;
    }

    public static void main(String[] args) {
        int [] people = {2,49,10,7,11,41,47,2,22,6,13,12,33,18,10,26,2,6,50,10};
        int limit = 50;
        System.out.println(numRescueBoats(people, limit));
    }
}
