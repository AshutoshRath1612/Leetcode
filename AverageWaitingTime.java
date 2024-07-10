package Leetcode;

public class AverageWaitingTime {
    public static double averageWaitingTime(int[][] customers) {
        int currTime = 0;
        double totalTime = 0;
        for(int [] arr : customers){
            int arrivalTime = arr[0];
            int cookTime = arr[1];

            currTime = Math.max(currTime, arrivalTime) + cookTime;

            totalTime +=  currTime - arrivalTime;
        }
        return  totalTime /customers.length;
}
    public static void main(String[] args) {
        int [][] customers = {{2,3},{6,3},{7,5},{11,3},{15,2},{18,1}};
//        int [][] customers = {{5,2},{5,4},{10,3},{20,1}};
        System.out.println(averageWaitingTime(customers));
    }
}
