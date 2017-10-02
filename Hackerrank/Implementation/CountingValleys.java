package Implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CountingValleys {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String list = in.next();
        int prev = 0;
        int cur =0;
        int count = 0;
        for (int i_n = 0; i_n<n; i_n++) {
            char c = list.charAt(i_n); 
            if (c == 'U') {
                prev = cur;
                cur++;
            } else {
                prev = cur;
                cur--;
            }
            if (prev < 0 && cur ==0) {
                count++;
            }
            
        }
        System.out.println(count);
    }
}