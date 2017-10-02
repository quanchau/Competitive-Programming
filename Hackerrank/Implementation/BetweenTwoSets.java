package Implementation;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BetweenTwoSets {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(b);
        int maxA = a[n-1];
        int maxB = b[m-1];
        int num = 1;
        int count = 0;
        int i = maxA *num;
        
        while (i <= maxB) {
            boolean r = true;
            for (int j = 0; j < n; j++) {
                if (i % a[j]!= 0) {
                    r = false;
                    break;
                }
            } 
            for (int k = 0; k< m; k++) {
                if(b[k] %i !=0) {
                    r=false;
                    break;
                }
            }
            if (r) {
                count++;
            }
           
        num++;
        i = maxA*num;
        }
        
        System.out.println(count);
        
    }
}
