package Implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CavityMap {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] newList = new String[n];
        String[][] list = new String[n][n];
         String[][] copy = new String[n][n];
        for(int grid_i=0; grid_i < n; grid_i++){
                newList[grid_i] = in.next();
            for (int i = 0; i < n; i++) {
                list[grid_i][i] = "" + newList[grid_i].charAt(i);
                copy[grid_i][i] = "" + newList[grid_i].charAt(i);
                
                }
            }
       
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                
                int num = Integer.parseInt(list[i][j]);
                int num1 = 0;
                int num2= 0;
                int num3 = 0;
                int num4 = 0;
                 if (i > 0 && i < n-1 && j> 0 && j < n-1) {
                     
                  num1 = Integer.parseInt(copy[i][j-1]);
                    num3 = Integer.parseInt(copy[i][j+1]);
                    num2 = Integer.parseInt(copy[i-1][j]);
                    num4 = Integer.parseInt(copy[i+1][j]);
                
                if (num > num1 && num > num2 && num > num3 && num> num4 ) {
                    list[i][j] = "X";
                }
                 }
                System.out.print(list[i][j]);
            }
            System.out.println();
        }
       
    }
}

