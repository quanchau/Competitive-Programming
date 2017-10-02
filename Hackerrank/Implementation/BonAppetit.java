package Implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BonAppetit {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] list = new int[n];
        int sum = 0;
        for (int i= 0; i< n; i++) {
            list[i]= in.nextInt();
            if (i != k) {
                sum += list[i];
            }
        }
        int c = in.nextInt();
        if (sum/2 < c) {
            System.out.println(c - sum/2);
        } else {
            System.out.println("Bon Appetit");
        }
    }
}
