package Implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TheHurdleRace {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        ArrayList<Integer> height = new  ArrayList<Integer>();
        for(int height_i=0; height_i < n; height_i++){
            height.add(in.nextInt());
        }
        int max = Collections.max(height);
        if (max > k) {
            System.out.println(max - k);
        } else {
            System.out.println(0);
        }
    }
}