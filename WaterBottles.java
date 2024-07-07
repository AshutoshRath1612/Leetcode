package Leetcode;

public class WaterBottles {
    public static int numWaterBottles(int numBottles, int numExchange) {
        int totalBottles = numBottles;
        int emptyBottle = numBottles;
        while(emptyBottle >= numExchange){
            int newBottle = emptyBottle / numExchange;
            emptyBottle = (emptyBottle % numExchange) + newBottle;
            totalBottles += newBottle;
        }
        return totalBottles;
    }
    public static void main(String[] args) {
        System.out.println(numWaterBottles(9,3));
    }
}
