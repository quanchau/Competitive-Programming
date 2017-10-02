package Implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TaumAndBDay {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long b = in.nextLong();
            long w = in.nextLong();
            long x = in.nextLong();
            long y = in.nextLong();
            long z = in.nextLong();
            if (x < y) {
                if (y > x + z) {
                    System.out.println((b+w)*x + z*w);
                }   else {
                    System.out.println(b*x + w*y);
                }
            } else if (y < x) {
                if (x > y+z) {
                    System.out.println((b+w)*y + z*b);
                }   else {
                    System.out.println(b*x + w*y);
                }
                
            } else {
                  System.out.println(b*x + w*y);
            }
        }
        
    }
}
