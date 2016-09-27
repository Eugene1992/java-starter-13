package cw06;

/**
 * Created by evgeniy on 27/09/16.
 */
public class InnerLoops {
    public static void main(String[] args) {
        outer:
        for (int i = 0; i < 10; i++) {
            inner:
            for (int j = 0; j < 25; j++) {
                if (j == 10) break outer;
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
