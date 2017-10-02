package Strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SherlockAndTheValidString {

    static String isValid(String s){
        int[] arr = new int[26];
        for (int i = 0; i<s.length();i++) {
            arr[s.charAt(i) - 'a']++;
        }
        Arrays.sort(arr);
        int start = 0;
        int count = 0;
        int total = 0;
        int dif = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
              //  System.out.println(arr[i]);
                total++;
            }
            if (start == 0 && arr[i] > 0) {
                start = arr[i];
            } else if (arr[i] > 0) {
                if (arr[i] != start) {
                    dif = arr[i] - start;
                    count++;
                }
            }
        }
        
        if (count <= 1 || count == total -1) {
            if (dif <= 1 || start == 1) {
                return "YES";
            } 
        }
        return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = isValid(s);
        System.out.println(result);
    }
}

