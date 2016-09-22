package hw;

import java.util.Scanner;

/**
 * Created by Serezha on 22.09.2016.
 */
public class HW_04 {
    public static void main(String[] args) {
//ex.2
        Scanner scan = new Scanner(System.in);
        Double inputNumber = scan.nextDouble();
        boolean wholeNumber = inputNumber % 1 == 0 ? true : false;

        if (wholeNumber) {
            if (inputNumber % 2 == 0) {
                System.out.println("Number IS WHOLE : " + inputNumber + " and EVEN.");
            } else {
                System.out.println("Number IS WHOLE : " + inputNumber + " and NOT even.");
            }
        } else {
            System.out.println("Number is NOT whole : " + inputNumber);
        }
    }
}