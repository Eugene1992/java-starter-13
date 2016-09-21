package cw03;

public class PrintFormat {
    public static void main(String[] args) {
        int swapVarA = 10;
        int swapVarB = 20;
        System.out.println("Swap variables, method 1:\n A = " + swapVarA + "    B = " + swapVarB);

        System.out.printf("Swap variables, method 1:\n A = %d    B = %d", swapVarA, swapVarB);
    }
}
