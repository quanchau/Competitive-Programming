package Implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TheGridSearch {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int R = in.nextInt();
            int C = in.nextInt();
            String[] G = new String[R];
            for(int G_i=0; G_i < R; G_i++){
                G[G_i] = in.next();
            }
            int r = in.nextInt();
            int c = in.nextInt();
            String[] P = new String[r];
            for(int P_i=0; P_i < r; P_i++){
                P[P_i] = in.next();
            }
            boolean alr = false;
            char start = P[0].charAt(0);
            for (int j = 0; j + r -1 < R; j++) {
                String str = G[j];
                for (int i = 0; i+c-1 < C; i++) {
                    if (str.charAt(i) == start) {
                        if (str.substring(i, i+c).equals(P[0])) {
                            int ind = 1;
                            boolean ok = true;
                            for (int m = j+1; m < j+r; m++) {
                                if (G[m].substring(i,i+c).equals(P[ind])) {
                                    ind++;
                                } else {
                                    ok = false;
                                    break;
                                }
                            }
                            if (ok) {
                                System.out.println("YES");
                                alr = true;
                                break;
                            }
                        }
                    }   
                }
            }
            if (!alr) {
                System.out.println("NO");
            }
        }
    }
}
