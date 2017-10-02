package Implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class NonDivisibleSubset {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        int k = in.nextInt();
        long[] arr = new long[(int)n];
        long[] list = new long[k];
        for (int i = 0; i<n ;i++) {
            arr[i] = in.nextLong();
            list[(int)arr[i]%k]++;
        }
        if (list[0] > 0) {
            n = n- list[0] +1;
        }
        for (int i = 1; i < k; i++) {
            if (i == k-i) {
                n  = n - list[k-i] + 1;
            } else {
            if (list[i] >= list[k-i]) {
                n-= list[k-i];
                list[k-i] = 0;
            } else if (list[k-i] >= list[i]) {
                n-= list[i];
                list[i] = 0;
            }
            }
        }
            
        long res = n;
        if (res == 0) {
            res = 1;
        }
        System.out.println(res);
        
    }
}