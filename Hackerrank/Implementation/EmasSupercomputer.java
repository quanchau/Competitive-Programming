package Implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class EmasSupercomputer {
    static int r;
    static int c;
    static int[][] arr;
    public static int generate(boolean[][] visited) {
        int max = 1;
        for (int i = 1; i < r-1; i++) {
            for (int j = 1; j < c-1; j++) {
                if (!visited[i][j] && arr[i][j] == 0) {
                    int count = 1;
                    int num = 1;
                    while (i + num < r && j + num < c && j-num >=0 && i - num>=0 &&arr[i + num][j] == 0 && arr[i - num][j] == 0 && arr[i][j+ num] == 0 && arr[i][j-num] == 0 && !visited[i-num][j] && !visited[i+num][j] && !visited[i][j+num] && !visited[i][j-num]) {
                        count+=4;
                        num++;
                     
                    }
                
                if (count > max) {
                    max = count;
                }
    }
        }
    }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        r = in.nextInt();
        c = in.nextInt();
        arr = new int[r][c];
        in.nextLine();
        for (int i = 0; i <r; i++) {
            String s = in.nextLine();
            for (int j = 0; j <c ; j++) {
                char ch = s.charAt(j);
                if (ch == 'B') {
                    arr[i][j] = -1;
                }
            }
        }
int max = 0;
        for (int i = 1; i < r-1; i++) {
            for (int j = 1; j < c-1; j++) {
                if (arr[i][j] == 0) {
                    int count = 1;
                    int num = 1;
                     boolean[][] visited = new boolean[r][c];
                     visited[i][j] = true;
                    while (i + num < r && j + num < c && j-num >=0 && i - num>=0 &&arr[i + num][j] == 0 && arr[i - num][j] == 0 && arr[i][j+ num] == 0 && arr[i][j-num] == 0) {
                        count+= 4;
                        
                        visited[i][j+num] = true;
                        visited[i][j-num] = true;
                        visited[i+num][j] = true;
                        visited[i- num][j] = true;
                        num++;
                        int temp = count*generate(visited);
                        if (temp > max) {
                            max = temp;
                        }
                    }
                    /** if (count > res[0] && count > res[1]) {
                        res[1] = res[0];
                        res[0] = count;
                    } else if (count > res[1]) {
                        res[1] = count;
                    }
                    */
                    if (count > max) {
                        max = count;
                    }
                }
            }
        }
        System.out.println(max);
    }
}
