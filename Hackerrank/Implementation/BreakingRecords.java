package Implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BreakingRecords {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int max = s[0];
        int min = s[0];
        int count1 = 0;
        int count2 = 0;
        for (int num: s) {
            if (num < min) {
                count2++;
                min = num;
            } else if(num > max) {
                count1++;
                max = num;
            }
        }
        System.out.println(count1 + " " + count2);
    }
}
