package Strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SherlockAndAnagrams {

    static int sherlockAndAnagrams(String s){
        int num = 1;
        int count = 0;
        while (num <= s.length()) {
            ArrayList<String> list = new ArrayList<String>();
            int ind = 0;
            while (ind + num <= s.length()){
                list.add(s.substring(ind, ind+num));
                ind++;
            }
            for (int i = 0; i < list.size(); i++) {
                int[] arr = new int[27];
                String temp = list.get(i);
                for (int m = 0; m < temp.length(); m++) {
                    arr[temp.charAt(m) - 96]++;
                }
                for (int j = i+1; j < list.size();j++) {
                    boolean  ok = true;
                    String temp1 = list.get(j);
                    int[] arr2 = new int[27];
                    for (int m = 0; m < temp1.length(); m++) {
                        arr2[temp1.charAt(m) - 96]++;
                    }
                    for (int t = 0; t < arr.length; t++) {
                        if (arr2[t] != arr[t]) {
                            ok = false;
                            break;
                        }
                    }
                    if (ok) {
                        count++;
                    }
                }
            }
            num++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = sherlockAndAnagrams(s);
            System.out.println(result);
        }
    }
}
