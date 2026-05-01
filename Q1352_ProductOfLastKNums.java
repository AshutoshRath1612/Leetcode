package Leetcode;

import java.util.ArrayList;
import java.util.List;

class ProductOfNumbers {
    List<Integer> nums;

    public ProductOfNumbers() {
        nums = new ArrayList<>();
        nums.add(1);
    }

    public void add(int num) {
        if (num == 0) {
            nums = new ArrayList<>(); // Any number before that will be 0;
            nums.add(1);
        } else {
            nums.add(num * nums.get(nums.size() - 1));
        }
    }

    public int getProduct(int k) {
        int n = nums.size();

        return k >= n ? 0 : nums.get(n - 1) / nums.get(n - k - 1);
    }
}

public class Q1352_ProductOfLastKNums {
    public static void main(String[] args) {
        ProductOfNumbers productOfNumbers = new ProductOfNumbers();
        productOfNumbers.add(3);        // [3]
        productOfNumbers.add(0);        // [3,0]
        productOfNumbers.add(2);        // [3,0,2]
        productOfNumbers.add(5);        // [3,0,2,5]
        productOfNumbers.add(4);        // [3,0,2,5,4]
        productOfNumbers.getProduct(2); // return 20. The product of the last 2 numbers is 5 * 4 = 20
        productOfNumbers.getProduct(3); // return 40. The product of the last 3 numbers is 2 * 5 * 4 = 40
        productOfNumbers.getProduct(4); // return 0. The product of the last 4 numbers is 0 * 2 * 5 * 4 = 0
        productOfNumbers.add(8);        // [3,0,2,5,4,8]
        productOfNumbers.getProduct(2); // return 32. The product of the last 2 numbers is 4 * 8 = 32
    }
}
