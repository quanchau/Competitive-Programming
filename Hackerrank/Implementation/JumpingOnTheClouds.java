package Implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JumpingOnTheClouds {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int start = 0;
        int num = 0;
        while(start!= n-1) {
        if (start + 2< n && c[start+2] != 1) {
            start +=2;
            num++;
        } else if (start+1 <n) {
            start +=1;
            num++;
        }
        }
        System.out.println(num);
    }
}
