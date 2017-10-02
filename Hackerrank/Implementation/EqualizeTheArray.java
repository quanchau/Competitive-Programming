package Implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class EqualizeTheArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < n; i++ ) {
             arr.add(in.nextInt());
        }
        Collections.sort(arr);
        int max = 0;
        int num = arr.get(0);
        int count = 1;
        for (int i = 1; i< n; i++) {
            if (arr.get(i) == num) {
                count++;
                if (count > max && i == n-1) {
                    max = count;
                }
            } else {
                num = arr.get(i);
                if (count > max) {
                    max = count;
                }
                count = 1;
            }

        }
        
        System.out.println(n- max);
    }
}
