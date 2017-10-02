package Implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ManasaAndStones {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i_t = 0; i_t <t; i_t++) {
            int n = in.nextInt();
            int a = in.nextInt();
            int b = in.nextInt();
            int num1= n-1;
            int num2= 0;
            if (a>b) {
                num1 = 0;
                num2 = n-1;
                while (num2 >=0) {
                System.out.print((a*num1 + b*num2) + " ");
                num2--;
                num1++;
           
            }
            } else if (a < b) {
            while (num1 >= 0) {
                System.out.print((a*num1 + b*num2) + " ");
                num2++;
                num1--;
           
            }
            } else {
                System.out.print(a*num1 + b*num2);
            }
            System.out.println();
        }
    }
}