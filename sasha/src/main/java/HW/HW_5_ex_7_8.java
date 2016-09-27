package HW;

import java.util.Scanner;

/**
 * Created by adnin on 27.09.2016.
 */
public class HW_5_ex_7_8 {
    public static void main(String[] args) {

        /**7. Создайте программу, вычисляющую факториал натурального числа n,
         введенного пользователем. */

        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        int i = scan.nextInt();

        for (n = 1; n > 0; n = n * i)
            System.out.println("n = " + n);
    }
}
