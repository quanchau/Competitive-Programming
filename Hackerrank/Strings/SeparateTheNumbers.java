package Strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SeparateTheNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            if (s.length() ==1) {
                System.out.println("NO");
            } else {
            int restr = s.length()/2;
            int num =1;
            boolean ok = false;
            while (num <= restr){
                if (isPossible(num, s)) {
                    String str = "";
                    for (int i = 0; i < num; i++) {
                        str+= s.charAt(i);
                    }
                    ok = true;
                    System.out.println("YES " + str);
                    break;
                }
                num++;
            }
        if (!ok) {
            System.out.println("NO");
        }
        
    }
        }
    }
    
    public static boolean isPossible(int num, String s) {
        long n = 0;
        long cur = 0;
        while (n < s.length()) {
            String str ="";
            for (int i = 0; i < num; i++) {
                if (n>= s.length()) {
                    return false;
                } 
                str+= s.charAt((int) n);
                n++;
            }
            if ((""+str.charAt(0)).equals("0")) {
                return false;
            }
            long temp = Long.parseLong(str);
            if (cur == 0) {
                cur = temp;
            } else {
            if (temp != cur+1) {
                return false;
            } else {
                cur = temp;
             }
            }
            String newStr = "" + (cur+1);
            num = newStr.length();
        }
        return true;
    }
}
