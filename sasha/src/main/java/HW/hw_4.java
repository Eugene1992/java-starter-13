package HW;

import java.util.Scanner;

public class hw_4 {

    public static void main(String[] args) {

/** Задание 2
        Создать программу, проверяющую и сообщающую на экран, является ли введенное с
        консоли целое число, чётным либо нечётны   */

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        if (a % 2 == 0) {
            System.out.println("even number");
        } else if (a % 2 == 1) {
            System.out.println("not even number");
        }

/** Задание 3
        Создать программу, выводящую на экран ближайшее к 10 из двух чисел, введенных с консоли.
        Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45. */


        double b = scan.nextDouble();
        double c = scan.nextDouble();

        if ((a - b) < (a - c)) {
            System.out.println(b);
        } else if ((a - b) > (a - c)) {
            System.out.println(c);
        }

/** Задание 4
        Задано три переменных, найти и вывести на экран переменную с максимальным значением
        (значения всех переменных разные). */

        int x, y, z;

        if (a > b && a > c) {
            System.out.println("a = max");
        } else if (a < b && a > c) {
            System.out.println("b = max");
        } else if (a > b && a < c) {
            System.out.println("c = max");
        } /**else if (a < b && a < c) {
            System.out.println("c = max");
        } */



    }
}