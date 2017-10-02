package Strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MakingAnagrams {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        int[] arr = new int[26];
        int[] arr2 = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            arr[(int) s1.charAt(i) - 97]++;
        }
        for (int i = 0; i < s2.length(); i++) {
            arr2[(int) s2.charAt(i) - 97]++;
        }
        int count = 0;
        for (int i = 0; i < 26; i++) {
            count += Math.abs(arr[i] - arr2[i]);
            
        }
        System.out.println(count);
    }
}