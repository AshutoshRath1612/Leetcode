package Leetcode;

import java.util.Arrays;

public class Q2126_DestroyingAsteroids {
    public static boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long totalMass = mass;

        for (int i: asteroids) {
            if (totalMass < i) {
                return false;
            }
            totalMass += i;
        }
        return true;
    }
    public static void main(String[] args) {
        int [] asteroids = {3,9,19,5,21};
        int mass = 10;
        System.out.println(asteroidsDestroyed(mass, asteroids));
    }
}
