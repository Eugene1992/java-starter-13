package cw07;

/**
 * Created by evgeniy on 28/09/16.
 */
public class OverloadExample {
    public static void main(String[] args) {
        System.out.println(calcIntervalSum(1, 3));
    }

    static int calcIntervalSum(int start, int end) {
        int sum = 0;
        for (; start < end; start++) {
            sum += start;
        }
        return sum;
    }


    static int calcIntervalSum(int start, int end, int step) {
        int sum = 0;
        for (; start < end; start += step) {
            sum += start;
        }
        return sum;
    }
}
