package cw08;

/**
 * Created by Serezha on 30.09.2016.
 */
public class CW08Arrays {

    public static void main(String[] args) {
        int[] arr = {};

        System.out.println(getArraySum(arr));
        System.out.println(toString(arr));

    }
    static int getArraySum(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
    static void inversArray(int[] array){
        for (int i = array.length - 1; i >= 0; --i) {
            System.out.println(array[i]);
        }
    }
    static String toString (int[] array){
        String result = "[";
        for (int i = 0; i < array.length; i++) {
            result += array.length - 1 == i ? array[i] : array[i] + ", ";
        }
        return result + "]";
    }
}
