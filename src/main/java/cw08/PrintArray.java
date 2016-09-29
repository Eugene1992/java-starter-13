package cw08;

import java.util.Arrays;

/**
 * Created by evgeniy on 29/09/16.
 */
public class PrintArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 10, 6, -12, 0};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        /*for (int i = 0; i < arr.length; i++) {
            int j = arr[i];
            System.out.print(j + " ");
        }*/

        for (int j : arr) {
            System.out.print(j + " ");
        }

        System.out.println();

        String[] cars = {"Audi", "Mercedes", "Tesla"};
        for (String car : cars) {
            System.out.print(car + " ");
        }

        Arrays.sort(arr);
        System.out.println();

        System.out.println(Arrays.toString(arr));
    }
}
