package Implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PickingNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        Arrays.sort(a);
        int num = a[0];
        int count = 1;
        int max = 0;
        boolean check = false;
        for (int i = 1; i< a.length; i++) {
            if (!check) {
            if (a[i] == num || a[i] == num+1) {
                if (a[i] == num+1) {
                    check = true;
                }
                num = a[i];
                count++;
                if (i == a.length -1 && count > max) {
                    max = count;
                }
                
            } else {
                num = a[i];
                if (count > max) {
                   max = count; 
                }
                count = 1;
           }
           } else {
           if (a[i] == num) {
               count++;
                if (i == a.length -1 && count > max) {
                    max = count;
               }
           } else {
              num = a[i];
                if (count > max) {
                   max = count; 
                }
               count = 1;
               check = false;
           }   
            }
        }
        System.out.println(max);
        }
    
}

