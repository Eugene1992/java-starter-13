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
        7. Найти минимальное и максимальное число в массиве
        8. Заменить все отрицательные числа в массиве на 0
        9. Подсчитать одинаковые числа в одномерном массиве
        10. Поменять минимальное и максимальное числа в массиве местами
        11. Инвертировать массив
        12. Вывести в консоль половину массива, среднеарифметическое которых является большим
        13. Найти сумму отрицательных чисел в одномерном массиве
        14. Дан массив чисел, среди которых имеется один ноль. Вывести на печать все числа до нуля включительно.
        15. Написать программу, меняющую местами два наибольших элемента одномерного массива с первым и последним.
        16. Написать программу, которая выводит на экран элементы одномерного массива, которые расположены до минимального элемента всего массива
        17. Найти сумму всех чисел находящихся между минимальным и максимальным числом в массиве
        18. Вывести в консоль половину массива в которой находиться наименьшее число массива
        19. Написать программу, которая перемещает в конец массива все элементы, значения которых находится в отрезке [a,b].*/
    }
    //        2. Вывести все числа одномерного массива в обратном порядке
    static void inversArray(int[] array){
        for (int i = array.length - 1; i >= 0; --i) {
            System.out.println(array[i]);
        }
    }
    //        5. Найти сумму всех элементов в массиве
    static int getArraySum(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
