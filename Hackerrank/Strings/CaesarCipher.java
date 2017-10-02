package Strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CaesarCipher {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < n; i++){
            char c = s.charAt(i);
            if (c >= 'A' && c<= 'Z') {
                c = (char) (c+k);
                if (c > 'Z') {
                    c =(char)('A' +(c-'A')%26);
                }
            } else if (c >= 'a' && c <= 'z') {
                c= (char)(c+k);
                if (c >'z') {
                    c = (char) ('a' +(c-'a')%26);
                }
            }
            buffer.append(c);
        }    
        System.out.println(buffer);
    }
}

