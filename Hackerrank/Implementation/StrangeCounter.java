package Implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class StrangeCounter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long t = in.nextLong();
        long cur = 3;
        long num = 4;
        long count =3;
        while (count <t) {
            cur = cur*2;
            count = count + cur;
        } 
        long num1 = t- (count - cur+1);
        cur = cur - num1;
        System.out.println(cur);
    }
}

