package HW;

/**
 * Created by sasha on 27.09.2016.
 */
public class HW_5 {
    public static void main(String[] args) {

        /** 1. Создайте программу, выводящую на экран все четырёхзначные
                числа последовательности 1000 1003 1006 1009 1012 1015 …. */

        System.out.println("ex_1");

        for (int x = 1000; x > 999 && x < 10000; x = x + 3) {
            System.out.println("x = " + x);
        }

        /** 2. Создайте программу, выводящую на экран первые 55 элементов
                последовательности 1 3 5 7 9 11 13 15 17 …. */

        System.out.println("ex_2");
        int k2 = 0;

        for (int x = 1; k2 <= 54; x = x + 2) {
            System.out.println("x = " + x);
            k2 = k2 + 1;
        }
        System.out.println("k2 = " + k2);

        /**3. Создайте программу, выводящую на экран все неотрицательные элементы
            последовательности 90 85 80 75 70 65 60 …. */

        System.out.println("ex_3");

        for (int x = 90; x > 0; x = x - 5) {
            System.out.println("x = " + x);
        }

        /**4. Создайте программу, выводящую на экран первые 20 элементов
            последовательности 2 4 8 16 32 64 128 …. */

        System.out.println("ex_4");

        int q = 2;
        int n = 2;
        int k4 = 0;

        Math.pow(q,(n - 1));

        for (int x = 2; k4 <= 19; x = x * q) {
            System.out.println("x = " + x);
            k4 = k4 + 1;
        }
        System.out.println("k4 = " + k4);

        /**5. Выведите на экран первые 20 членов последовательности Фибоначчи. */

        System.out.println("ex_5");

        int x2 = 1;
        int x3 = 1;
        int k5 = 0;

        for (int x4 = 2; k5 <= 9; x4 = x3 + x2) {
            System.out.println("x = " + x4);
            k5 = k5 + 1;
        }
        System.out.println("k5 = " + k5);

        System.out.println("End");
    }
}
