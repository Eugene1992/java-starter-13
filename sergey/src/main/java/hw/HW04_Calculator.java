package hw;

import java.util.Scanner;

/**
 * Class HW04_Calculator
 */
public class HW04_Calculator {
    /**
     * main() function
     */
    public static void main(String[] args) {
        System.out.println("Calculator\nEnter: operand 1 OPERATION operand 2");
        Scanner scan = new Scanner(System.in);
        Double inputOperand1 = scan.nextDouble();
        String inputOperation = scan.next();
        Double inputOperand2 = scan.nextDouble();

        switch (inputOperation) {
            case "+":
                System.out.println(inputOperand1 + " + " + inputOperand2 + " = " + (inputOperand1 + inputOperand2));
                break;
            case "-":
                System.out.println(inputOperand1 + " - " + inputOperand2 + " = " + (inputOperand1 - inputOperand2));
                break;
            case "*":
                System.out.println(inputOperand1 + " * " + inputOperand2 + " = " + (inputOperand1 * inputOperand2));
                break;
            case "/":
                if (inputOperand2 == 0) {
                    System.out.println("Error --->  " + inputOperand1 + " / " + inputOperand2);
                } else {
                    System.out.println(inputOperand1 + " / " + inputOperand2 + " = " + (inputOperand1 / inputOperand2));
                }
                break;
            default:
                System.out.println("Error in operation --->  " + inputOperation);
                break;
        }
    }
}
