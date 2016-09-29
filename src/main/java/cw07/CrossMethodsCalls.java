package cw07;

/**
 * Created by evgeniy on 28/09/16.
 */
public class CrossMethodsCalls {
    public static void main(String[] args) {
        System.out.println(method1());
    }

    static int method1() {
        return 100 + method3();
    }

    static int method2() {
        return 1000 + method3();
    }

    static int method3() {
        return 10;
    }
}
