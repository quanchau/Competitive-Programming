package Implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AlmostSorted {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        boolean ok = true;
        int start = 0;
        int end = 0;
        int count = 0;
        ArrayList<Integer> r = new ArrayList<Integer>();
        for (int i = 0; i <n; i++) {
            arr[i] = in.nextInt();
            if (i > 0 && arr[i] < arr[i-1]) {
                if (ok) {
                count++;
                ok = false;
                start = i-1;
                r.add(i-1);
                }
                r.add(i);
                if (i == n-1 && !ok) {
                end = n-1;
                }
            } else if ((i > 0 && arr[i] > arr[i-1] && !ok)) {
                end = i-1;
                ok = true;
            }
        }
       
    //   System.out.println(start + " " + end);
        if (count == 0) {
            System.out.println("yes");
        } else if (count == 1) {
            if (n == 2) {
                System.out.println("yes \nswap 1 2");
            } else
            if ((start -1 >=0 && arr[end] > arr[start-1] && end+1 <n && arr[start] < arr[end+1]) || (start == 0 && end == n-1) ) {
                 System.out.println("yes");
                if (Math.abs(end - start) == 1) {
                        System.out.println("swap " + (start+1) + " " + (end+1));
                } else {
              
                System.out.println("reverse " + (start+1) + " " + (end+1));
                }
            } else {
                if ((start == 0 && arr[start] < arr[end+1]) || (end == n-1 && arr[end] > arr[start-1]) ) {
                    System.out.println("yes");
                     if (Math.abs(end - start) == 1) {
                        System.out.println("swap " + (start+1) + " " + (end+1));
                } else {
                    System.out.println("reverse " + (start+1) + " " + (end+1));
                     }
                    
                } else {
                System.out.println("no");
                }
            }
        } else if (count == 2 && r.size() == 4) {
            int u = r.get(0);
            int v = r.get(3);
         //   System.out.println(u + " " + v);
            int temp = arr[u];
            arr[u] = arr[v];
            arr[v] = temp;
            boolean sorted= true;
            for (int i = 0 ; i< n-1;i ++) {
                if (arr[i+1] < arr[i]) {
                    sorted = false;
                }
            }
            if (sorted) {
                System.out.println("yes");
                System.out.println("swap " + (u+1) + " " + (v+1));
            } else {
                System.out.println("no");
            }
        } else {
            System.out.println("no");
        }
        
    }
}
