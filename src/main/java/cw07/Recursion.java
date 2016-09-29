package cw07;

/**
 * Created by evgeniy on 28/09/16.
 */
public class Recursion {
    public static void main(String[] args) {
        System.out.println(getFibRec(5));
    }

    static int getFibIter(int num) {
        int num1 = 1, num2 = 1, temp = 0;
        for (int i = 0; i < num - 2; i++) {
            temp = num1 + num2;
            num1 = num2;
            num2 = temp;
        }
        return temp;
    }

    static int getFibRec(int num) {
        if (num < 2) return num;
        return getFibRec(num - 1) + getFibRec(num - 2);
    }

}
