public class Q3633_EarliestFinishTimeForLandAndWaterRideI {
    public static int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int minTime = Integer.MAX_VALUE;

        for (int i = 0; i < landStartTime.length; i++) {
            int currTime = landStartTime[i] + landDuration[i];
            for (int j = 0; j < waterStartTime.length; j++) {
                int finish = Math.max(currTime, waterStartTime[j]) + waterDuration[j];
                minTime = Math.min(minTime, finish);
            }
        }
        for (int i = 0; i < waterStartTime.length; i++) {
            int currTime = waterStartTime[i] + waterDuration[i];
            for (int j = 0; j < landStartTime.length; j++) {
                int finish = Math.max(currTime, landStartTime[j]) + landDuration[j];
                minTime = Math.min(minTime, finish);
            }
        }

        return minTime;
    }
    static void main() {
        int [] landStartTime = {2,8}, landDuration = {4,1}, waterStartTime = {6}, waterDuration = {3};
        System.out.println(earliestFinishTime(landStartTime,landDuration, waterStartTime, waterDuration));
    }
}
