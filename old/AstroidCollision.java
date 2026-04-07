package Leetcode;

import java.util.Arrays;

public class AstroidCollision {
    public static int[] asteroidCollision(int[] asteroids) {
        if (asteroids.length<=1)
            return asteroids;
        int index = 0;
        int size = asteroids.length;
        for (int i=1;i<asteroids.length;i++){
            if (asteroids[i]<0){
                while(index>0 && asteroids[index]==0){
                    index--;
                }
                if (index>=0 && asteroids[index]>0){
                    if (Math.abs(asteroids[i])>Math.abs(asteroids[index])){
                        asteroids[index] = 0;
                        index--;
                        i--;
                    }
                    else if (Math.abs(asteroids[i])<Math.abs(asteroids[index])){
                        asteroids[i] = 0;
                        index = i;
                    }
                    else{
                        asteroids[index] = 0;
                        asteroids[i] = 0;
                        index = i;
                        size--;
                    }
                    size--;
                }
                else {
                    index = i;
                }
            }
            else {
                index++;
            }
        }
        int remainingAstroids[] = new int[size];
        index = 0;
        for (int e:asteroids){
            if (e!=0){
                remainingAstroids[index] = e;
                index++;
            }
        }
        return remainingAstroids;
    }
    public static void main(String[] args) {
        int [] astroids = {1,-1,1,-2};
        System.out.println(Arrays.toString(asteroidCollision(astroids)));
    }
}
