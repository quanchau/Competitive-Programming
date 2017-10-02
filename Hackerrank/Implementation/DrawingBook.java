package Implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DrawingBook {

    static int solve(int n, int p){
        int half = 0;
        int count = 0;
        if (n%2==0) {
            half = n/2;
        } else {
            half = n/2+1;
        }
        if (p == half) {
            if (n%2 == 0) {
                half++;
            } else {
                half--;
            }
        }
        if (p > half) {
            int end = n;
            while (end > p) {
                count++;
                end--;
                
            }
            if (n%2==0 && p != n) {
                count++;
            }
        } else if (p < half) {
            int start = 0;
            while (start < p) {
                count++;
                start++;
            }
            if (p == 1) {
                count--;
            }
        } 
        
        return count/2;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }
}
