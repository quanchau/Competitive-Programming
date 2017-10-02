package Implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ViralAdvertising {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int num =5;
        int sum = 0;
        for (int a0= 0; a0<n; a0++) {
            int i = num/2;
            sum+= i;
            num= i*3;
        }
        System.out.println(sum);
    }
}