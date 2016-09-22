package hw;

/**
 * Created by Serezha on 20.09.2016.
 *
 1. Создать четыре целочисленные переменные типов byte, short, int, long.
 2. Инициализировать переменную типа byte результатом суммы двух любых чисел
 3. Инициализировать переменную типа short  результатом вычитания двух любых чисел
 4. Инициализировать переменную типа int результатом деления двух любых чисел
 5. Инициализировать переменную типа long результатом умножения двух любых чисел
 6. Передать переменной типа byte результат суммы двух переменных типа byte
 7. Передать переменной типа byte результат суммы двух переменных типа short, деленных на третью переменную типа byte
 8. Переменной типа int передать результат деления двух short, умноженных на результат деления двух byte
 9. Поменять значения двух целочисленных переменных используя третью
 10. Поменять значения двух переменных без использования третей
 ---------------------------------------------------- BONUS -------------------------------------------------------------
 Дано число от 0 до 127 в десятичной системе исчисления. Написать программу, которая переводит данное число в двоичную
 систему исчисления и выводит в консоль. Запрещается использовать циклы (for, while и т.д.) или условия(if)! Пример:
 byte b = 103;
 ...
 < Ваш код >
 ...
 Вывод в консоль в следующем виде:
 0110 0111
 Важно чтобы вывод включал в себя все разряды! То есть, даже если число 3 в двоичной системе равно 11, вывод в консоль
 должен быть в ввиде 00000011.
 ------------------------------------------------------------------------------------------------------------------------
 Полезные материалы по теме:
 http://www.znannya.org/?view=Java_DataTypes
 http://www.znannya.org/?view=Java_PrimitiveTypes
 */
public class HW_02 {
    public static void main(String[] args) {
//ex.1
        byte b1;
        short s1;
        int i1;
        long l1;
//ex.2
        b1 = 10 + 20;
//ex.3
        s1 = 20 - 10;
//ex.4
        i1 = 20 / 10;
//ex.5
        l1 = 20 * 10;
//ex.6
        byte b2 = 20;
        byte b3 = 40;
        b1 = (byte)(b2 + b3);
//ex.7
        short s2 = 100;
        short s3 = 150;
        b1 = (byte)((s2 + s3) / b2);
//ex.8
        i1 = (s2 / s3) * (b1 / b2);
//ex.9
        int swapVarA = 10;
        int swapVarB = 20;
        int tempSwap;
        System.out.println("\nSwap variables, method 1:\n A = " + swapVarA + "    B = " + swapVarB);

        tempSwap = swapVarA;
        swapVarA = swapVarB;
        swapVarB = tempSwap;

        System.out.println("Result:\n A = " + swapVarA + "    B = " + swapVarB);
//ex.10
        System.out.println("Swap variables, method 2:\n A = " + swapVarA + "    B = " + swapVarB);

        swapVarA = swapVarA + swapVarB - (swapVarB = swapVarA);

        System.out.println("Result:\n A = " + swapVarA + "    B = " + swapVarB);

//ex. Bonus : Dec to Bin

        byte b = 103;
        System.out.println("\nDec = " + b);
        System.out.println("Result bin:  " + (b / 128 )%2 + (b / 64 )%2 + (b / 32 )%2 + (b / 16 )%2 + " " + (b / 8 )%2 + (b / 4 )%2 + (b / 2)%2 + b%2);

    }
}