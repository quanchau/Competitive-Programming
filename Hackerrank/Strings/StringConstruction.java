package Strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StringConstruction {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
             int[] list = new int[26];
             int pay = 0;
            String s = in.next();
            for (int i = 0; i < s.length(); i++) {
                if (list[s.charAt(i)-97] == 0) {
                    pay++;
                    list[s.charAt(i)-97]++;
                }
            }
            System.out.println(pay);
        }
        
    }
}

