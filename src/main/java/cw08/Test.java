package cw08;

/**
 * Created by evgeniy on 29/09/16.
 */
public class Test {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[3];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        System.out.println(arr[2]);
//        arr[3] = 30;  // java.lang.ArrayIndexOutOfBoundsException
//        arr[-3] = 30; // java.lang.ArrayIndexOutOfBoundsException

        arr[2] = 40;
        System.out.println(arr[2]);
    }

    static int getSum(int a, int b, int c) {
        return a + b + c;
    }
}
