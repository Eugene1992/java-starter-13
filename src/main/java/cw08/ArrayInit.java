package cw08;

/**
 * Created by evgeniy on 29/09/16.
 */
public class ArrayInit {
    public static void main(String[] args) {
        int[] arr1 = new int[3]; // Java style
        int arr2[] = new int[3]; // C++ style

//                             0  1  2  3   4   5   6
        int[] arr3 = new int[]{1, 2, 4, 10, 6, -12, 0};
        System.out.println(arr3.length);

        int[] arr4 = {1, 2, 4, 10, 6, -12, 0};
        System.out.println(arr4.length);
    }
}
