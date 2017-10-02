package Implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MinimumDistances {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int A[] = new int[n];
        HashMap<Integer, Integer> list = new HashMap<Integer,Integer>();
        int min = n;
        for(int A_i=0; A_i < n; A_i++){
            A[A_i] = in.nextInt();
            if (!list.containsKey(A[A_i])) {
                list.put(A[A_i], A_i);
            } else {
                if(Math.abs(A_i - list.get(A[A_i])) < min) {
                    min = Math.abs(A_i - list.get(A[A_i]));
                } 
                list.put(A[A_i], A_i);
            }
        }
        if (min == n) {
            min= -1;
        }
        System.out.println(min);
    }
}
