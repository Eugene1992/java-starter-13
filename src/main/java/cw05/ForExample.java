package cw05;

/**
 * Created by evgeniy on 26/09/16.
 */
public class ForExample {
    public static void main(String[] args) {
//        for (initialize; condition; counter)
        int b = 10;

        for (int a = 0; a < 10; a++, b += 2) {
            System.out.println(a + " " + b);
        }


        int k = 120;
        String result = "";

        result = result + 1;
        result = 0 + result;

        System.out.println(result);
    }
}
