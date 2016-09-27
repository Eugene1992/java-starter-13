package cw_5;

/**
 * Created by Student on 9/27/2016.
 */
public class CW_6 {
    public static void main(String [] args) {
        for (int i = 0; i < 100; i += 2) {
            if (i == 2) continue;
            System.out.println(i);
        }

        for (int i = 1; i <= 10; i++){
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
