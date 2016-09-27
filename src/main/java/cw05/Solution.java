package cw05;

/**
 * Created by evgeniy on 26/09/16.
 */
public class Solution {
    public static void main(String[] args) {
        String result = "";
        for (int i = 345; i >= 1; i /= 2) {
            result = i % 2 + result;
        }
        System.out.println(result);
    }
}