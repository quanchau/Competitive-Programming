package Strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class WeightedUniformStrings {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int n = in.nextInt();
       char[] list = s.toCharArray();
        long cur = list[0] - 96;
        HashSet<Long> set = new HashSet<Long>();
        set.add(cur);
        for (int i = 1; i < list.length; i++) {
            if (list[i] == list[i-1]) {
                cur += list[i]-96;
                set.add(cur);
            } else {
                cur = list[i] - 96;
                set.add(cur);
            }
        }
        for(int a0 = 0; a0 < n; a0++){
            long x = in.nextInt();
            if (set.contains(x)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            
        }
    }
}
