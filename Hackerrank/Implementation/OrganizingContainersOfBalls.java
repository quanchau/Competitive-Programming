package Implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class OrganizingContainersOfBalls {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            HashMap<Integer,Long> list = new HashMap<Integer,Long>();
            for (int i = 0; i<n; i++) {
                list.put(i,0L);
            }
            long[][] M = new long[n][n];
            boolean ok = true;
            for(int M_i=0; M_i < n; M_i++){
                for(int M_j=0; M_j < n; M_j++){
                    M[M_i][M_j] = in.nextLong();
                    list.put(M_j, list.get(M_j) + M[M_i][M_j]);
                }
            }
            for (long[] m:M) {
                long sum = 0;
                for (int i = 0; i< n; i++) {
                    sum += m[i];
                }
                boolean found = false;
                for (int i = 0; i <n; i++) {
                    if (sum == list.get(i)) {
                        list.remove((long) i);
                        found = true;
                        break;
                    }
                }
                      if (!found) {
                        ok = false;
                        break;
                    }
                }

            
            
            if (ok) {
                System.out.println("Possible");
            } else {
                System.out.println("Impossible");
            }
          
            
        }
    }
    }

