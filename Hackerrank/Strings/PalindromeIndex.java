package Strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PalindromeIndex {
    static int num;

    static int palindromeIndex(String s){
        
        int res = generate(s, 0, s.length() -1,0);
        if (res > 1 || res == 0) {
            return -1;
        } else {
            return num;
        }
    }
    
    static int generate(String s, int start, int end, int count) {
        if (count <=1) {
        if (start >= end) {
            return count;
        } else {
            if (s.charAt(start) == s.charAt(end)) {
                return generate(s, start+1, end-1, count);
            } else {
                int num1 = generate(s, start +1, end, count+1);
                int num2 = generate(s, start, end-1, count+1);
                if (num1 < num2) {
                    num = start;
                    return num1;
                } else {
                    num = end;
                    return num2;
                }
            }
        }
        } else {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = palindromeIndex(s);
            System.out.println(result);
        }
    }
}
