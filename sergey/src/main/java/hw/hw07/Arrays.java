package hw.hw07;

/**
 * Created by Serezha on 30.09.2016.
 */
public class Arrays {
    public static void main(String[] args) {
        /*
        1. Вывести в консоль все парные числа одномерного массива

        3. Вывести первую и вторую половину одномерного массива
        4. Вывести первую и вторую половину одномерного массива в обратном порядке

        6. Найти среднеарифметическое всех чисел массива




        11. Инвертировать массив
        12. Вывести в консоль половину массива, среднеарифметическое которых является большим
        13. Найти сумму отрицательных чисел в одномерном массиве
        14. Дан массив чисел, среди которых имеется один ноль. Вывести на печать все числа до нуля включительно.
        15. Написать программу, меняющую местами два наибольших элемента одномерного массива с первым и последним.
        16. Написать программу, которая выводит на экран элементы одномерного массива, которые расположены до минимального элемента всего массива
        17. Найти сумму всех чисел находящихся между минимальным и максимальным числом в массиве
        18. Вывести в консоль половину массива в которой находиться наименьшее число массива
        19. Написать программу, которая перемещает в конец массива все элементы, значения которых находится в отрезке [a,b].*/


        int[] arr1 = {1, 3, 9, -1, -9, 34, 0, 3, -2, 25};
        System.out.println("Original value in Array: ");
        printArray(arr1);
        System.out.println();
        System.out.print("Ex.2 inversArray: ");
        inversArray(arr1);
        System.out.println("Ex.5 Sum: " + getArraySum(arr1));
        System.out.println("Ex.7 Min: " + getMinValue(arr1));
        System.out.println("Ex.7 Max: " + getMaxValue(arr1));
        System.out.println("Ex.8 ChangeMinValue: ");
        changeMinValue(arr1, 1);
        printArray(arr1);
    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; ++i) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    //        2. Вывести все числа одномерного массива в обратном порядке
    static void inversArray(int[] array) {
        for (int i = array.length - 1; i >= 0; --i) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    //        5. Найти сумму всех элементов в массиве
    static int getArraySum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    //7. Найти минимальное и максимальное число в массиве
    static int getMinValue(int[] array) {
        int minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue)
                minValue = array[i];
        }
        return minValue;
    }

    //7. Найти минимальное и максимальное число в массиве
    static int getMaxValue(int[] array) {
        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxValue)
                maxValue = array[i];
        }
        return maxValue;
    }

    //8. Заменить все отрицательные числа в массиве на 0
    static void changeMinValue(int[] arrayToChange, int changeToValue) {
        for (int i = 1; i < arrayToChange.length; i++) {
            if (arrayToChange[i] < 0)
                arrayToChange[i] = changeToValue;
        }
    }

    //9. Подсчитать одинаковые числа в одномерном массиве
}
