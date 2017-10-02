package Implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JumpingOnTheCloudRevisited {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int num = 0;
        int e = 100;
        boolean ok = false;
        while (num!=0 || !ok) {
            num = (num+k)%n;
            e -= 1;
            if (c[num] == 1) {
                e -=2;
            }
            ok = true;
        }
        System.out.println(e);
    }
}
