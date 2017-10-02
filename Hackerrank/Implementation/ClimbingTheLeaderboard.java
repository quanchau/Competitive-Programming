package Implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ClimbingTheLeaderboard {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] scores = new int[n];
        for(int scores_i=0; scores_i < n; scores_i++){
            scores[scores_i] = in.nextInt();
        }
   //     Arrays.sort(scores);
        int m = in.nextInt();
        int[] alice = new int[m];
        Set<Integer> hash = new HashSet<Integer>();
        for(int alice_i=0; alice_i < m; alice_i++){
            alice[alice_i] = in.nextInt();
          
        }
        ArrayList<Integer> res  = new ArrayList<Integer>();
        int ind = m-1;
        int ind2 = 0;
        int rank = 1;
        while (ind >=0) {
            while (ind2 < n && scores[ind2] > alice[ind]) {
                if (ind2 < n-1 && scores[ind2+1] < scores[ind2]) {
                    rank++;
                }
                ind2++;
            }
            if (ind2 == n && alice[ind] < scores[n-1] ) {
                rank++;
                res.add(rank);
                rank--;
            }else{
            res.add(rank);
            }
            ind--;
        }
        
        for (int i = m-1; i >= 0; i--) {
            System.out.println(res.get(i));
        }
    }
}

