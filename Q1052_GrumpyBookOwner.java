public class Q1052_GrumpyBookOwner {
    public static int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int result = 0;

        for(int i = 0; i < customers.length; i++) {
            if (grumpy[i] == 0)
                result += customers[i];
        }

        if (minutes > 0) {
            int currentSatisfied = result;

            for (int i = 0; i < minutes; i++) {
                if (grumpy[i] == 1) {
                    currentSatisfied += customers[i];
                }
            }
            result = Math.max(currentSatisfied, result);

            for (int i = minutes; i < customers.length; i++) {
                if (grumpy[i] == 1) {
                    currentSatisfied += customers[i];
                }
                if (grumpy[i-minutes] == 1) {
                    currentSatisfied -= customers[i-minutes];
                }
                result = Math.max(result, currentSatisfied);
            }
        }
        return result;
    }
    static void main() {
        int [] customers = {1,0,1,2,1,1,7,5};
        int [] grumpy = {0,1,0,1,0,1,0,1};
        int minutes = 3;
        System.out.println(maxSatisfied(customers, grumpy, minutes));
    }
}
