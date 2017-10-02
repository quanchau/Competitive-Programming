package Implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MigratoryBirds {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] types = new int[n];
        for(int types_i=0; types_i < n; types_i++){
            types[types_i] = in.nextInt();
        }
        int[] count = new int[6];
        for (int i = 0; i<types.length;i++) {
            count[types[i]]++;
        }
        int max = 0;
        int res = 0;
        for (int i = 1; i<count.length; i++) {
            if (count[i]> max) {
                max=count[i];
                res=i;
            }
        }
        System.out.println(res);
    }
}
