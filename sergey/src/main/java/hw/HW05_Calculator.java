package hw;

import java.util.Scanner;

/**
 * Created by Serezha on 26.09.2016.
 */
public class HW05_Calculator {
    public static void main(String[] args) {
       /* 6. Написать программу, которая реализует следующий функционал:
        6.1 Пользователь вводит число в 10-ой системе счисления.
        6.2 Программа выводит сообщение в котором предлагает пользователю перевести данное число в одну из систем счисления на выбор:
        1) в 2-ую
        2) в 8-ую
        3) в 16-ую
        6.3 Пользователь выбирает один из предложенных вариантов, программа выполняет соответствующий перевод числа и выводит
        на экран результат.*/

        System.out.print("Enter number in Dec: ");

        Scanner scan = new Scanner(System.in);
        int inputNumber = scan.nextInt();

        System.out.print("Choose calculation system (Example: 2 , 8 , 16): ");

        int inputSystem = scan.nextInt();
        String result = "";
        if (inputSystem == 2) {
            for (int i = inputNumber; i >= 1; i /= 2) {
                result = i % 2 + result;
            }
            System.out.println("Result to Bin -> " + result);
        } else if (inputSystem == 8) {
            for (int i = inputNumber; i >= 1; i /= 8) {
                result = i % 8 + result;
            }
            System.out.printf("Result to Oct -> " + result);
        } else if (inputSystem == 16) {
            for (int i = inputNumber; i >= 1; i /= 16) {
                if ((i % 16) < 10) {
                    result = i % 16 + result;
                }
                switch (i % 16) {
                    case 10:
                        result = "A" + result;
                        break;
                    case 11:
                        result = "B" + result;
                        break;
                    case 12:
                        result = "C" + result;
                        break;
                    case 13:
                        result = "D" + result;
                        break;
                    case 14:
                        result = "E" + result;
                        break;
                    case 15:
                        result = "F" + result;
                        break;
                }
            }
            System.out.printf("Result to Hex -> " + result);
        } else {
            System.out.println("Choose only 2 or 8 or 16 !");
        }
    }
}
