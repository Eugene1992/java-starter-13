package cw08;

/**
 * Created by evgeniy on 29/09/16.
 */
public class TwoDimArray {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];

        arr[0][0] = 1;
        arr[0][1] = 1;
        arr[0][2] = 1;
        arr[1][0] = 1;
        arr[1][1] = 0;
        arr[1][2] = 1;
        arr[2][0] = 1;
        arr[2][1] = 1;
        arr[2][2] = 1;

        int[][] arr2 = {
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        };

        int[][] arr3 = {
                {0, 0, 0, 1, 0},
                {0, 1, 0, 0},
                {0, 0, 0, 1, 1, 1}
        };

        int[][] arr4 = new int[3][];

        arr4[0] = new int[]{0, 0, 0, 1, 0};
        arr4[1] = new int[]{0, 1, 0, 0};
        arr4[2] = new int[]{0, 0, 0, 1, 1, 1};

        int[][][][][] arr5 = new int[2][2][2][2][2];
    }
}
