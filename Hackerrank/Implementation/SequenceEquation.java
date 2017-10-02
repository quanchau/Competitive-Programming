package Implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SequenceEquation {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][1];
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            a[num-1][0] = i+1;
        }
        for (int i = 1; i<= n; i++) {
            int num = a[i-1][0];
            System.out.println(a[num-1][0]);
                 }
    }
}