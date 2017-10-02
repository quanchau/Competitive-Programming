package Implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ExtraLongFactorials {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        BigInteger res = BigInteger.valueOf(n);
        n--;
        while (n > 0) {
            res = res.multiply(BigInteger.valueOf(n));
            n--;
        }
        System.out.println(res);
    }
}