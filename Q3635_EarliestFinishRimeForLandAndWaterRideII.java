public class Q3635_EarliestFinishRimeForLandAndWaterRideII {
    public static int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int minTime = Integer.MAX_VALUE;

        int minLand = Integer.MAX_VALUE;
        int minWater = Integer.MAX_VALUE;

        for (int i = 0; i < landStartTime.length; i++) {
            minLand = Math.min(landStartTime[i] + landDuration[i], minLand);
        }
        for (int i = 0; i < waterStartTime.length; i++) {
            minWater = Math.min(waterStartTime[i] + waterDuration[i], minWater);
            minTime = Math.min(minTime, Math.max(minLand,waterStartTime[i]) + waterDuration[i]);
        }
        for (int i = 0; i < landStartTime.length; i++) {
            minTime = Math.min(minTime, Math.max(minWater,landStartTime[i]) + landDuration[i]);
        }
        return minTime;
    }
    static void main() {
        int [] landStartTime = {2,8}, landDuration = {4,1}, waterStartTime = {6}, waterDuration = {3};
        System.out.println(earliestFinishTime(landStartTime,landDuration, waterStartTime, waterDuration));

    }
}
