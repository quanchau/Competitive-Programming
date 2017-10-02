package Strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HackerRankInAString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        int ind = 0;
        String s1 = "hackerrank";
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            for (int i = 0; i <s.length(); i++) {
                if (s.charAt(i) == s1.charAt(ind)) {
                    ind++;
                    if (ind == 10) {
                        break;
                    }
                }
            }
            if (ind == 10) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            ind = 0;
        }
    }
}
