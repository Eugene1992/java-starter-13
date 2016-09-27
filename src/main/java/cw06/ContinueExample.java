package cw06;

/**
 * Created by evgeniy on 27/09/16.
 */
public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 2) continue;
            System.out.print(i + " ");
        }
    }
}
