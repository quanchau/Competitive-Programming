package Implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FairRations {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int B[] = new int[N];
        int count = 0;
        for(int B_i=0; B_i < N; B_i++){
            B[B_i] = in.nextInt();
            if (B[B_i] %2==1) {
                count++;
            }
        }
        int temp = 0;
        if (count%2 ==1) {
            System.out.println("NO");
        } else {
            int num = 0;
            boolean odd = false;
            for (int i = 0; i < B. length; i++) {
                if (B[i]%2 == 1 && !odd) {
                    odd = true;
                    temp = i;
                } else if (B[i]%2 == 1 && odd) {
                    num += (i - temp)*2;
                    odd = false;
                }
            }
            System.out.println(num);
        }
    }
}
