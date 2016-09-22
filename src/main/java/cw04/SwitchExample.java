package cw04;

/**
 * Created by evgeniy on 22/09/16.
 */
public class SwitchExample {
    public static void main(String[] args) {
        String s = "10";

        if (s.equals("10")) {
            System.out.println("10");
        }

        if (s.equals("11")) {
            System.out.println("11");
        }

        if (s.equals("12")) {
            System.out.println("12");
        }

        if (s.equals("10")) {
            System.out.println("10");

        } else if (s.equals("11")) {
            System.out.println("11");

        } else if (s.equals("12")) {
            System.out.println("12");

        } else {
            System.out.println("Default");
        }
    }
}
