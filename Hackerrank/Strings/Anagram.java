package Strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Anagram {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i_n = 0; i_n < n; i_n++) {
                    int count = 0;
            String s = in.next();
            if (s.length() %2==1 ) {
                count = -1;
            } else {
                int[] arr = new int[26];
                for (int i =0; i< s.length()/2; i++) {
                    arr[s.charAt(i) - 97]++;
                }
                int[] arr2 = new int[26];
                for (int i =s.length()/2; i< s.length(); i++) {
                    arr2[s.charAt(i) - 97]++;
                }
                for (int i = 0; i< 26;i++) {
                    if (arr2[i] > arr[i]) {
                        count+= arr2[i] - arr[i];
                    }
                }
            }
            System.out.println(count);
        }
    }
}