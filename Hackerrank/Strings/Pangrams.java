package Strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Pangrams {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = "";
        while (in.hasNext()) {
            String ex = in.next().toLowerCase();
            s += ex;
        }
       
        int[] arr = new int[26];
        for (int i = 0; i< s.length(); i++) {
            arr[(int)s.charAt(i) - 97]++;
        }
        boolean ok = true;
        for (int i : arr) {
            if (i == 0) {
                ok = false;
            }
        }
        if (!ok) {
            System.out.println("not pangram");
        } else {
            System.out.println("pangram");
        }
    }
}
