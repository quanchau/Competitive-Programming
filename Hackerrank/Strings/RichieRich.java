package Strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RichieRich {

    static String richieRich(String s, int n, int k){
        int ind1 = 0;
        int ind2=  n-1;
        boolean[] m = new boolean[n];
          int[] arr = new int[n];
        while (ind1 <= ind2) {
            arr[ind1] = Integer.parseInt("" + s.charAt(ind1));
            arr[ind2] = Integer.parseInt("" + s.charAt(ind2));
             if (k > 0 && arr[ind1] != arr[ind2]) {
                arr[ind1] = Math.max(arr[ind1], arr[ind2]);
                arr[ind2] = Math.max(arr[ind1], arr[ind2]);
                m[ind1] = true;
                m[ind2] = true;
                k--;
            } 
            ind1++;
            ind2--;
        }
      
        ind1 = 0;
        ind2 = n-1;
        while(ind1 <= ind2) {
            if (k > 0 && arr[ind1] < 9) {
                if (ind1 == ind2) arr[ind1] = 9;
                else if (k >= 2 || (m[ind1] && m[ind2])) {
                    arr[ind1] = 9;
                    arr[ind2] = 9;
                }
                if (m[ind1] && m[ind2]) k -= 1;
                else if (k>=2) k-=2;
            } else if (k == 0) break;

            ind1++;
            ind2--;
        }
        StringBuffer buffer = new StringBuffer();
        for (int i : arr) {
            buffer.append(""+ i);
            
        }
        return buffer.toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        String s = in.next();
        String result = richieRich(s, n, k);
        if (isPalindrome(result))
        System.out.println(result);
        else System.out.println(-1);
    }
    
    public static boolean isPalindrome(String s) {
        int ind1 = 0;
        int ind2 = s.length()-1;
        while(ind1 < ind2) {
            if (s.charAt(ind1) != s.charAt(ind2)) return false;
            ind1++;
            ind2--;
        }
        return true;
    }
}
