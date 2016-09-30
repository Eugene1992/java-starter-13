package hw;

import java.util.Scanner;

/**
 * Class HW04_Interval
 */
public class HW04Interval {
    /**
     * main() function
     */
    public static void main(String[] args) {
        //ex.8
        Scanner scan = new Scanner(System.in);
        int inputNumber = scan.nextInt();
        if (inputNumber >= 0 & inputNumber <= 14){
            System.out.println("Число попало в промежуток [0 - 14]");
        }
        else if (inputNumber >= 15 & inputNumber <= 35){
            System.out.println("Число попало в промежуток [15 - 35]");
        }
        else if (inputNumber >= 36 & inputNumber <= 50){
            System.out.println("Число попало в промежуток [36 - 50]");
        }
        else if (inputNumber >= 51 & inputNumber <= 100){
            System.out.println("Число попало в промежуток [51 - 100]");
        }
        else {
            System.out.println("Число не попало в промежуток [0 - 100]");
        }
    }
}
