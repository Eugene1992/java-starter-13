package hw;

import java.util.Scanner;

/**
 * Created by Serezha on 26.09.2016.
 */
public class HW05 {
    public static void main(String[] args) {
        /*1. Создайте программу, выводящую на экран все четырёхзначные числа последовательности 1000 1003 1006 1009 1012 1015 ….*/

        // for(int i = 1000; i <=9999; i += 3 ){
        //     System.out.print(i + " ");
        // }

       /* 2. Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….*/

        //for(int i = 1; i <=55; i += 2 ){
        //    System.out.print(i + " ");
        //}

       /* 3. Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….*/

        //for(int i = 90; i >= 0; i -= 5 ){
        //        System.out.print(i + " ");
        //    }

       /* 4. Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….*/
/*
        for (int i = 0, x = 1; i <= 20; ++i, x *= 2) {
            if (x > 1) {
                System.out.print(x + " ");
            }
        }
*/
       /* 5. Выведите на экран первые 20 членов последовательности Фибоначчи.*/

        int f0 = 1, f1 = 1, f2;
        System.out.print(f0 + " " + f1 + " ");

        for (int i = 1; i <= 20; ++i) {
            f2 = f0 + f1;

            System.out.print(f2 + " ");

            f0 = f1;
            f1 = f2;
        }

        /*7. Создайте программу, вычисляющую факториал натурального числа n, введенного пользователем.*/
/*
        Scanner scan = new Scanner(System.in);
        int inputNumber = scan.nextInt();
        int counter = 1, factorial = 1;

        //Used while()

        while (counter < inputNumber + 1) {
            factorial *= counter;
            ++counter;
        }
        System.out.print("Factorial !" + inputNumber + " = " + factorial);
*/

        /*8. Выведите на экран все положительные делители натурального числа, введенного пользователем.*/

        /*Scanner scan = new Scanner(System.in);
        int inputNumber2 = scan.nextInt();
        int counter = inputNumber2;

        //Used do while()
        do {
            if ((inputNumber2 % counter) == 0) {
                System.out.print(counter + " ");
            }
            counter--;
        } while (counter > 0);
        */
    }
}
