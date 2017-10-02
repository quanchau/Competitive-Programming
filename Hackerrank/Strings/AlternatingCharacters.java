package Strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AlternatingCharacters {

    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i =0; i< n; i++) {
            String s = in.next();
            char start = s.charAt(0);
            int count = 0;
            for (int j = 1; j < s.length(); j++) {
                if (s.charAt(j) != start) {
                    start = s.charAt(j);
                } else {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
