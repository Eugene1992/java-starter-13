package hw;

import java.util.Scanner;

/**
 * Home work 04
 */
public class HW_04 {
    /**
     * main() function
     */
    public static void main(String[] args) {
//ex.2
       /* Scanner scan = new Scanner(System.in);
        int inputNumber = scan.nextInt();

        if (inputNumber % 2 == 0) {
            System.out.println("Number : " + inputNumber + " is EVEN.");
        } else {
            System.out.println("Number : " + inputNumber + " is NOT even.");
        }*/

//ex.3
       /* Scanner scan = new Scanner(System.in);
        Double inputNumber1 = scan.nextDouble();
        Double inputNumber2 = scan.nextDouble();

        if (inputNumber1 >= 10 & inputNumber2 > inputNumber1) {
            System.out.println("The Number : " + inputNumber1 + " closer to 10.");
        } else {
            if (inputNumber1.equals(inputNumber2)) {
                System.out.println("Number1 == Number2");
            } else {
                System.out.println("The Number : " + inputNumber2 + " closer to 10.");
            }
        }*/
//ex.4
        /*
        int varA = -40;
        int varB = 30;
        int varC = 200;

        if (varA > varB) {
            System.out.println("varA " + varA + " biger.");
        } else {
            if (varB > varC) {
                System.out.println("varB " + varB + " biger.");
            } else {
                System.out.println("varC " + varC + " biger.");
            }
        }*/
//ex.5
        /*Задано четыре переменных, найти и вывести на экран вторую по величине.
        *                        Tests                                         */
        int var1 = 178;       //  1   1   1   4   3
        int var2 = 114;       //  2   2   4   3   4
        int var3 = 147;       //  3   4   3   2   2
        int var4 = 247;       //  4   3   2   1   1

        System.out.println("var1 = " + var1 + "\nvar2 = " + var2 + "\nvar3 = " + var3 + "\nvar4 = " + var4);
        // при условии что 1 < 2, но 2 больше остальных и 1 > 3,4                ИЛИ          при условии что 1 < 3, но 3 больше остальных и 1 > 2 и 4    ИЛИ  при условии что 1 < 4, но 4 больше остальных и 1 > 2 и 3
        if ((var1 < var2 & var2 > var3 & var2 > var4 & var1 > var3 & var1 > var4) | (var1 < var3 & var3 > var2 & var3 > var4 & var1 > var2 & var1 > var4) || (var1 < var4 & var4 > var3 & var4 > var2 & var1 > var2 & var1 > var3)) {
            System.out.println("----------> var1 = " + var1);
        }
        // при условии что 2 < 1, но 1 больше остальных и 2 > 3,4                     ИЛИ  при условии что 2 < 3, но 3 больше остальных и 2 > 1 и 4            ИЛИ  при условии что 2 < 4, но 4 больше остальных и 2 > 1 и 3
        else if ((var2 < var1 & var1 > var3 & var1 > var4 & var2 > var3 & var2 > var4) | (var2 < var3 & var3 > var1 & var3 > var4 & var2 > var1 & var2 > var4) || (var2 < var4 & var4 > var3 & var4 > var1 & var2 > var1 & var2 > var3)) {
            System.out.println("----------> var2 = " + var2);
        }
        // при условии что 3 < 1, но 1 больше остальных  и 3 > 2,4                    ИЛИ  при условии что 3 < 2, но 2 больше остальных и 3 > 1 и 4            ИЛИ  при условии что 3 < 4, но 4 больше остальных и 3 > 1 и 2
        else if ((var3 < var1 & var1 > var2 & var1 > var4 & var3 > var2 & var3 > var4) | (var3 < var2 & var2 > var1 & var2 > var4 & var3 > var1 & var3 > var4) || (var3 < var4 & var4 > var1 & var4 > var2 & var3 > var1 & var3 > var2)) {
            System.out.println("----------> var3 = " + var3);
        }
        // при условии что 4 < 1, но 1 больше остальных и 4 > 2,3                     ИЛИ  при условии что 4 < 2, но 2 больше остальных и 4 > 1 и 3            ИЛИ  при условии что 4 < 3, но 3 больше остальных и 4 > 1 и 2
        else if ((var4 < var1 & var1 > var2 & var1 > var3 & var4 > var2 & var4 > var3) | (var4 < var2 & var2 > var1 & var2 > var3 & var4 > var1 & var4 > var3) || (var4 < var3 & var3 > var1 & var3 > var2 & var4 > var1 & var4 > var2)) {
            System.out.println("----------> var4 = " + var4);
        } else {
            System.out.println("false");
        }
    }
}
