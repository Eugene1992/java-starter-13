package HW;

public class Main {

    public static void main(String[] args) {

        /**
         *  Task 1
         */

        byte a;
        short a1;
        int a2;
        long a3L;

        /**
         * Task 2
         */

        byte b = (3 + 121);
        System.out.println(b);

        /**
         * Task 3
         */

        short c = (13055 - 20);
        System.out.println(c);

        /**
         * Task 4
         */

        int d = (2545628 / 40);
        System.out.println(d);

        /**
         * Task 5
         */

        long e = (2545628 * 40);
        System.out.println(e);

        /**
         * Task 6
         */
        byte f, f1, f2;
        f1 = 2;
        f2 = 6;
        f = (byte) (f1 + f2);
        System.out.println(f);

        /**
         * Task 7
         */

        byte h, h1;
        short g = 2;
        short g1 = 7;
        h1 = 3;
        h = (byte) ((g + g1) / 3);
        System.out.println(h);

        /**
         * Task 8
         */

        int k;
        short m = 21;
        short m1 = 7;
        byte n = 10;
        byte n1 = 5;
        k = ((m / m1) * ((byte) (n/n1)));
        System.out.println(k);

        /**
         * Task 9
         */

        byte l;
        byte l1 = 10;
        byte l2 = 5;

        l = l1;
        l1 = l2;
        l2 = l;

        System.out.println(l1);
        System.out.println(l2);

        /**
         * Task 10
         */

        int c1 = 10;
        int c2 = 5;

        c1 = c1 - c2;
        c2 = c1 + c2;
        c1 = c2 - c1;


        System.out.println(c1);
        System.out.println(c2);

        /**
         * Task Bonus
         */

        byte x = 17;
        byte x1;
        byte x2;
        byte x3;
        byte x4;
        byte x5;
        byte x6;
        byte x7;

        x1 = (byte) (x/2);
        x2 = (byte) (x1/2);
        x3 = (byte) (x2/2);
        x4 = (byte) (x3/2);
        x5 = (byte) (x4/2);
        x6 = (byte) (x5/2);
        x7 = (byte) (x6/2);

        System.out.print(x7);
        System.out.print(x6 % 2);
        System.out.print(x5 % 2);
        System.out.print(x4 % 2);
        System.out.print(x3 % 2);
        System.out.print(x2 % 2);
        System.out.print(x1 % 2);

    }
}
