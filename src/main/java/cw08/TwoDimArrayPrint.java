package cw08;

/**
 * Created by evgeniy on 29/09/16.
 */
public class TwoDimArrayPrint {
    public static void main(String... args) {
        int[][] arr2 = {
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        };

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        int[] arr = {1, 2, 3, 4, 5};
//        printArray(1, 2, 3, 4);
        printArray(arr);

        printArrayArgs(1, 2, 3, 4, 5);
        printArrayArgs(1, arr);

//        System.out.printf(); // jdk example
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static void printArrayArgs(int k, int... arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
