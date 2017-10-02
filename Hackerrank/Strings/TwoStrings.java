package Strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TwoStrings {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i_t = 0; i_t< t; i_t++) {
            String s1 = in.next();
            String s2 = in.next();
            boolean ok = false;
            int[] arr = new int[26];
            for (int i = 0; i < s1.length(); i++) {
                arr[(int) s1.charAt(i) - 97]++;
            }
            for (int i = 0; i< s2.length(); i++) {
                if (arr[(int) s2.charAt(i) - 97] > 1) {
                    ok = true;
                    System.out.println("YES");
                    break;
                }
            }
            if (!ok) {
                System.out.println("NO");
            }
        }
    }
}
