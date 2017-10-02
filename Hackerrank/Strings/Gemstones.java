package Strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Gemstones {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] list = new String[n];
        boolean[] res = new boolean[26];
        String s1 = in.next();
        for (int i = 0; i < s1.length(); i++) {
            res[(int) s1.charAt(i) - 97] = true;
        }
        for (int i = 0; i < n-1; i++) {
            boolean[] temp = new boolean[26];
            String s = in.next();
            for (int j = 0; j < s.length(); j++) {
                if (res[(int)s.charAt(j) -97]) {
                    temp[(int)s.charAt(j) -97] = true;
                }
            }
            res = temp;
        }
        int count = 0;
        for (boolean i : res) {
            if (i) {
                count++;
            }
        }
        System.out.println(count);
    }
}
