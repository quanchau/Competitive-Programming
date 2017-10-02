package Implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TheBombermanGame {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int r = in.nextInt();
       int c = in.nextInt();
        int count =1;
        int n = in.nextInt();
        in.nextLine();
        int[][] arr=  new int[r][c];
        for (int i = 0; i <r; i++) {
            String s = in.nextLine();
            for (int j = 0; j<c; j++) {
                if (s.charAt(j) == 'O') {
                    arr[i][j] = -1;
                }
            }
        }
        int[][] arr3 = new int[r][c];
        int[][] arr2 = new int[r][c];
        for (int i = 0; i <r; i++) {
            for (int j = 0; j<c; j++) {
                arr2[i][j] = -1;
                arr3[i][j] = -1;
                if(arr[i][j] == -1) {
                    arr2[i][j] = 0;
                } else if (j -1 >=0 && arr[i][j-1] == -1) {
                    arr2[i][j] = 0;
                } else if (j + 1 < c && arr[i][j+1] == -1) {
                    arr2[i][j] = 0;
                } else if (i -1 >=0 && arr[i-1][j] == -1) {
                    arr2[i][j] = 0; 
                } else if (i+1 < r && arr[i+1][j] == -1) {
                    arr2[i][j] = 0;
                }
            }
        }
        int[][] arr4 = new int[r][c];
        for (int i = 0; i <r; i++) {
            for (int j = 0; j<c; j++) {
                arr4[i][j] = -1;
                if(arr2[i][j] == -1) {
                    arr4[i][j] = 0;
                } else if (j -1 >=0 && arr2[i][j-1] == -1) {
                    arr4[i][j] = 0;
                } else if (j + 1 < c && arr2[i][j+1] == -1) {
                    arr4[i][j] = 0;
                } else if (i -1 >=0 && arr2[i-1][j] == -1) {
                    arr4[i][j] = 0; 
                } else if (i+1 < r && arr2[i+1][j] == -1) {
                    arr4[i][j] = 0;
                }
            }
        }
        int[][] res = new int[r][c];
        if (n == 1) {
            res = arr;
        }  else if (n%2 == 0) {
            res = arr3;
         //   System.out.println("arr3");
        } else if (n%4 == 1) {
            res = arr4;
 //   System.out.println("arr");
        } else {
            res = arr2;
            //    System.out.println("arr2");
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j <c; j++) {
                if (res[i][j] == -1) {
                    System.out.print('O');
                } else {
                     System.out.print('.');
                }
            }
            System.out.println();
        }
        
    }
}
