package Implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BeautifulTriplets {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d= in.nextInt();
        int[] a = new int[n];
        int count = 0;
        for (int i = 0; i <n; i++) {
            a[i] = in.nextInt();
            
        }
        for (int i = 1; i <n-1; i++) {
           int prev = i -1;
           int next = i+1;
            
            while (next<= n-1 && prev >= 0) {
                if(a[i] - a[prev] == d && a[next] - a[i]==d) {
                    count++;
                    break;
                } else if (a[next] - a[i] < d){
                    next++;
                } else 
                if (a[i] - a[prev] < d) {
                    prev--;
                } else {
                    break;
                }
               
            }   

            
        }
        System.out.println(count);
        
    }
}
