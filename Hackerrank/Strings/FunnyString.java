package Strings;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FunnyString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i_t = 0; i_t < t; i_t++) {
            String s = in.next();
            String s1 = "";
            for (int i = s.length()-1; i >=0; i--) {
                s1 += s.charAt(i);
            }
            boolean ok = true;
            for (int i = 1; i < s.length(); i++) {
                if (Math.abs(s.charAt(i) - s.charAt(i-1)) != Math.abs(s1.charAt(i) - s1.charAt(i-1))) {
                    ok =false;
                    System.out.println("Not Funny");
                    break;
                }
            }
            if (ok) {
                System.out.println("Funny");
            }
        }
    }
}
