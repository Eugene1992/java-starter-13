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
        long a = scan.nextLong();
        int n = scan.nextInt();

        for (int i = 1; n >= i; ++i) {
            a = a * i;
        }                                           // Вопросы по месту скобки!
            System.out.println("n! = " + a);
    }
}