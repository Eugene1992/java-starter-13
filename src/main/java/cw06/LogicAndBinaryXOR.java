package cw06;

/**
 * Created by evgeniy on 27/09/16.
 */
public class LogicAndBinaryXOR {
    public static void main(String[] args) {
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);
        System.out.println(true ^ true);

        System.out.println(13 ^ 7);
//        0000 1101
//       ^
//        0000 0111
//        ---------
//        0000 1010

        int x = 5, y = 7;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        x = x^y; // x == 2
        y = x^y; // y == 5
        x = x^y; // x == 7

        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
}
