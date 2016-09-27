package cw06;

import java.util.Scanner;

/**
 * Created by evgeniy on 27/09/16.
 */
public class LogicAndBinaryNOT {
    public static void main(String[] args) {
        boolean isAuthorized = false;
        String password = "qwerty";
        Scanner scanner = new Scanner(System.in);
        while (!isAuthorized) {
            System.out.println("Enter password: ");
            if (scanner.next().equals(password)) isAuthorized = true;
        }
        System.out.println(~0);
    }
}
