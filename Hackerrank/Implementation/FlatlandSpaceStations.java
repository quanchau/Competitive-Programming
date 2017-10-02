package Implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FlatlandSpaceStations {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int c[] = new int[m];
        for(int c_i=0; c_i < m; c_i++){
            c[c_i] = in.nextInt();
        }
        Arrays.sort(c);
        int indM = 0;
        int indN = 0;
        int max = 0;
        while (indM <= c.length-1 && indN < n) {
             if (indM == c.length -1) {
                     
                     if (Math.abs(c[indM] - indN) > max) {
                             max = Math.abs(c[indM] - indN);
                     }
             } else {
             int first = Math.abs(c[indM] - indN);
             int second = Math.abs(c[indM+1] - indN);
             if (first >= second) {
                     indM++;
                     if (second > max) {
                             max = second;
                     }
                     
             } else {
                    if (first > max) {
                             max = first;
                     } 
             }
             }
                indN++;
        }
            System.out.println(max);
    }
}

