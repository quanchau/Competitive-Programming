package Strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BeautifulBinaryString {

    static int minSteps(int n, String B){
        int count = 0;
        for (int i = 0; i+2 < n; i++) {
            if (B.charAt(i) == '0' && B.charAt(i+1) == '1' && B.charAt(i+2) == '0') {
                count++;
                i= i+2;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String B = in.next();
        int result = minSteps(n, B);
        System.out.println(result);
    }
}

