package Leetcode;

import java.util.ArrayList;
import java.util.List;

class MovingAverage {
    int size;
    double sum = 0;
    List<Integer> values;
    public MovingAverage(int size) {
        this.size = size;
        values = new ArrayList<>();
    }
    public double next(int val) {
        sum += val;
        values.add(val);
        if (values.size() > size) {
            sum -= values.get(0);
            values.remove(0);
            return sum/size;
        }
        return sum/values.size();
    }
}

public class Q346_MovingAverageFromDataStream {
    public static void main(String[] args) {
        MovingAverage ma = new MovingAverage(3);
        System.out.println(ma.next(1));
        System.out.println(ma.next(10));
        System.out.println(ma.next(3));
    }
}
