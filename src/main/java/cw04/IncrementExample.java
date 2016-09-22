package cw04;

/**
 * Created by evgeniy on 22/09/16.
 */
public class IncrementExample {
    public static void main(String[] args) {
        int a = 10;
        /*a += 1; // a = a + 1;
        a -= 1; // a = a - 1;
        a *= 1; // a = a * 1;
        a /= 1; // a = a / 1;
        a %= 1; // a = a % 1;*/
        System.out.println(a++);
        System.out.println(++a);
    }
}
