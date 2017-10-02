package Implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SaveThePrisoner {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            long n = in.nextLong();
            long m = in.nextLong();
            long s = in.nextLong();
            long num = n-s+1;
            if (m > num) {
                long result = (m-num)%n;
                if (result == 0) {
                    System.out.println(n);
                } else {
                System.out.println(result);
                }
            } else {
                System.out.println(s+m-1);
            }
        }
    }
}