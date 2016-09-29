package cw07;

public class Test {
    public static void main(String[] args) {
        int start = 10;
        int sum1 = calcIntervalSum(1, 3);
        System.out.println(sum1);

        int sum2 = calcIntervalSum(10, 100);
        System.out.println(sum2);

        printNtimes("Hello world!", 5);

        int sum3 = calcIntervalSum(calcIntervalSum(calcIntervalSum(2, 6), 3), calcIntervalSum(2, 5));
        System.out.println(sum3);
    }

    static int calcIntervalSum(int start, int end) {
        int sum = 0;
        for (; start < end; start++) {
            sum += start;
        }
        return sum;
    }

    static void printNtimes(String message, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(message);
        }
    }

    static int max(int arg1, int arg2) {
        return arg1 >= arg2 ? arg1 : arg2;
    }

    static boolean isGreater(int arg1, int arg2) {
        if (arg1 > arg2) {
            return true;
        }
        return false;
    }

}
