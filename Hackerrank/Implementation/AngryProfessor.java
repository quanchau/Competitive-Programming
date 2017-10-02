package Implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AngryProfessor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            //int a[] = new int[n];
            int num = 0;
            for(int a_i=0; a_i < n; a_i++){
               // a[a_i] = in.nextInt();
                int count = in.nextInt();
                if (count <= 0) {
                    num++;
                }
            }
            if (num >= k) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
    
            
        }
    }
}
