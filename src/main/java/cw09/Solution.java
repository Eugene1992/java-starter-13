package cw09;

import java.util.Arrays;

/**
 * Created by evgeniy on 30/09/16.
 */
public class Solution {
    public static void main(String[] args) {

            String s1 = "world";
            String s2 = "world";

           System.out.println(equals (s1,s2));

    }
    static boolean equals(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;
        char[] chars = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        for (int i = 0; i < chars.length ; i++) {
            if (chars[i] != chars2[i]) {
            return false;
            }
        }
        return true;
    }
}
