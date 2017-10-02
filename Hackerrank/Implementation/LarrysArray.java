package Implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LarrysArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i_t = 0; i_t < t; i_t++) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i<n; i++) {
                arr[i] = in.nextInt();
            }
            int ind = 1;
            boolean ok = true;
            int count = 0;
            while(ind<n) {
                int num = ind;
                int temp = arr[ind];
                while (num-1 >=0 && temp < arr[num-1]  ) {
                    num--;
                }
             //   System.out.println(ind + " " + num);
                for (int i = ind; i >num; i--) {
                    arr[i] = arr[i-1];
                    count++;
                }
                arr[num] = temp;
                ind++;
            }
           // System.out.println(count);
            if (count%2 ==0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
