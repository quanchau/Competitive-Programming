package Strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CommonChild {
   
    static int[][] visited;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        s1 = in.next();
        s2 = in.next();
        max = 0;
        visited = new int[s1.length()+1][s2.length()+1];

        for (int i = 1 ; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                if (s1.charAt(i-1) == s2.charAt(j-1)) {
                    visited[i][j] = visited[i-1][j-1] + 1;
                } else  {
                    visited[i][j] = Math.max(visited[i][j-1], visited[i-1][j]);
                }
                }
            }
        
        System.out.println(visited[s1.length() ][s2.length()]);
    }
    static int max;
    static String s1;
    static String s2;
   
 
    
}

