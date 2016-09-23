package hw;

import java.util.Scanner;

/**
 * Home work 04
 */
public class HW_04 {
    /**
     * Class main
     */
    public static void main(String[] args) {
//ex.2
        Scanner scan = new Scanner(System.in);
        int inputNumber = scan.nextInt();

        if (inputNumber % 2 == 0) {
            System.out.println("Number : " + inputNumber + " is EVEN.");
        } else {
            System.out.println("Number : " + inputNumber + " is NOT even.");
        }
    }
}