package Leetcode;

public class MaximumPopulationYear {
    public static int maximumPopulation(int[][] logs) {

        int [] arr = new int[101];

        for(int i=0;i<logs.length;i++){
            arr[logs[i][0] - 1950]++;
            arr[logs[i][1] - 1950]--;
        }

        for(int i = 1;i<101;i++){
            arr[i] += arr[i-1];
        }

        int maxPopulation = 0;
        int year = 0;
        for(int i = 0;i<101;i++){
            if(arr[i] > maxPopulation){
                maxPopulation = arr[i];
                year = i + 1950;
            }
        }
        return year;
    }

    public static void main(String[] args) {
        int[][]logs= {{1993,1999},{2000,2010}};
        int year = maximumPopulation(logs);
        System.out.println(year);
    }
}

