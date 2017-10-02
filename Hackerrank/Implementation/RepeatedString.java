package Implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RepeatedString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        long num = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                num++;
            }
        }
        long length = s.length();
        long mod = n%length;
        long result = 0;
        for (long i = 0; i < mod; i++) {
            if (s.charAt((int)i) == 'a') {
                result++;
            }
        }
        result += (n/length)*num;
        System.out.println(result);
    }
}
