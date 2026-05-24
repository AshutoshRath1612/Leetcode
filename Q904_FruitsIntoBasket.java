import java.util.HashMap;

public class Q904_FruitsIntoBasket {
    public static int totalFruit(int[] fruits) {
        int left = 0, maxFruits = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < fruits.length; i++) {
            int fruit = fruits[i];
            hm.put(fruit, hm.getOrDefault(fruit, 0)+1);

            while (hm.size() > 2) {
                hm.put(fruits[left], hm.getOrDefault(fruits[left], 0)-1);

                if (hm.get(fruits[left]) == 0) {
                    hm.remove(fruits[left]);
                }
                left++;
            }
            maxFruits = Math.max(maxFruits, i - left + 1);
        }

        return maxFruits;
    }

    static void main() {
        int [] fruits = {1,0,1,4,1,4,1,2,3};
        System.out.println(totalFruit(fruits));
    }
}
