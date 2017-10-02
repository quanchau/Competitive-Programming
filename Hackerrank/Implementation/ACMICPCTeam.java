package Implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ACMICPCTeam {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        String topic[] = new String[n];
        for(int topic_i=0; topic_i < n; topic_i++){
            topic[topic_i] = in.next();
        }
        int max = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j< n; j++ ){
                int count = 0;
                for (int z = 0; z <m ; z++) {
                    if((Integer.parseInt(""+topic[i].charAt(z))|Integer.parseInt(""+topic[j].charAt(z)))==1) {
                        count++;
                    }
                }
                if (count > max) {
                    max = count;
                }
                arr.add(count);
            }
        }
        
        int reachMax = 0;
        for (int i: arr) {
            if (i == max ){
                reachMax++;
            }
        }
        System.out.println(max);
        System.out.println(reachMax);
        
        
        
    }
}
