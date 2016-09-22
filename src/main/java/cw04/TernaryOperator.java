package cw04;

public class TernaryOperator {
    public static void main(String[] args) {
        int a = 10;
        int b;

        if (a > 5) {
            b = 10;
        } else {
            b = 100;
        }

        //       condition ? if true : if false
        int b1 = a > 5     ?    10   :    100;

        if (a > 7) {
            if (a == 8) {
                a = 11;
            } else {
                a = 10;
            }
        } else {
            a = 100;
        }

        int b2 = a > 7 ? a == 8 ? 11 : 10 : 100;

        System.out.println(b2);
    }
}
