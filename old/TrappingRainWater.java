package Leetcode;

public class TrappingRainWater {
    public static int trap(int[] height) {
        int totalWater = 0;
        int [] left = new int[height.length];
        int [] right = new int[height.length];
        left[0] = height[0];
        for(int i = 1;i < height.length;i++){
            left[i] = Math.max(left[i-1] , height[i]);
        }
        right[right.length-1] = height[height.length-1];
        for(int i = height.length - 2; i >= 0 ;i--){
            right[i] = Math.max(right[i+1] , height[i]);
        }
        for(int i = 0; i < height.length; i++){
            totalWater += Math.min(left[i],right[i]) - height[i];
        }
        return totalWater;
    }
    public static void main(String[] args) {
        int [] heights = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(heights));
    }
}
