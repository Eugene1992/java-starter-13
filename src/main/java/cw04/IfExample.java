package cw04;

public class IfExample {
    public static void main(String[] args) {
        int a = 7;
        boolean b = false;

        /*if (a > 5) { // > < >= <= != ==
            if (a < 10) {
                System.out.println("a > 0");
            }
            System.out.println("a > 5 and a > 10");
        }*/

        if (a < 5 && a / 0 == 10) {
            System.out.println("a > 0");
        }
    }
}
