package Strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BearAndSteadyGene {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        s = in.next();
        HashMap<Character, Integer> list = new HashMap<Character, Integer>();
        list.put('A', 0);
        list.put('C', 1);
        list.put('T', 2);
        list.put('G', 3);
        arr = new int[4];
        boolean ok = true;
        for (int i = 0; i < s.length(); i++) {
            arr[list.get(s.charAt(i))]++;
            if ( arr[list.get(s.charAt(i))] > n/4) {
                ok = false;
            }
        }
        if (ok) {
            System.out.println(0);
        } else {
        int right = 0;
        int left = 0;
        min = 500001;
        int[] arr2 = new int[4];
        while (right < n) {
            arr[list.get(s.charAt(right++))]--;
          
            while (check()) {
                min = Math.min(min,right-left);
                arr[list.get(s.charAt(left++))]++;
               
            }
        }
        
        
        System.out.println(min);
        }

        
    }
    
    static String s;
    static int[] arr;
    static int min;
    
    public static boolean check() {
        for (int i : arr) {
            if (i > s.length()/4) {
                return false;
            }
        }
        return true;
         
    }
}