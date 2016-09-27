package HW;

import java.util.Scanner;

public class HW04 {

    public static void main(String[] args) {

/** Задание 2
 Создать программу, проверяющую и сообщающую на экран, является ли введенное с
 консоли целое число, чётным либо нечётны   */

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        if (a % 2 == 0) {
            System.out.println("even number");
        } else  {
            System.out.println("not even number");
        }

/** Задание 3
 Создать программу, выводящую на экран ближайшее к 10 из двух чисел, введенных с консоли.
 Например, среди чисел 8,5 и 11,45 ближайшее к десяти 11,45. */


        double b = scan.nextDouble();
        double c = scan.nextDouble();

        if ((a - b) < (a - c)) {
            System.out.println(b);
        } else  {
            System.out.println(c);
        }

/** Задание 4
 Задано три переменных, найти и вывести на экран переменную с максимальным значением
 (значения всех переменных разные). */

        if (b < a & a > c) {
            System.out.println("a = max");
        } else if (a < b & b > c) {
            System.out.println("b = max");
        } else if (a < c & c > b) {
            System.out.println("c = max");
        }

/** Задание 5
 Задано четыре переменных, найти и вывести на экран вторую по величине.

        int d;

        if (a > b & a > c & a > d) | (b > c & b > d) | (c > b & c > d) | (d){
            System.out.println(b);
        } else if (b > a & b > c & b > d) | (a > c & a > d) {
            System.out.println(a);
        } else if (c > a && c > b && c > d) | (d > b & d > a) {
            System.out.println(a);
        } else if (d > a & d > b & d > c) | (c > b & c > d) {
            System.out.println(c);


/** Задание 6
        В три переменные a, b и c записаны три вещественных числа. Создать программу, которая
        будет находить и выводить на экран вещественные корни квадратного уравнения ax²+bx+c=0,
        либо сообщать, что корней нет.

        double x, y, z, descrem;

        descrem = Math.sqrt(
 )*/
    }
}