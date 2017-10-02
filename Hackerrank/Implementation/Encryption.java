package Implementation;

import java.io.*;
import java.util.*;

public class Encryption {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        double n = Math.sqrt(str.length());
        double min = Math.floor(n);
        double max = Math.ceil(n);
        if (min*max < str.length()) {
            min++;
        }
        char[][] list = new char[(int)min][(int)max];
        int num= 0;
        for (int i = 0; i<min;i++) {
            for (int j = 0; j< max; j++) {
                if (num == str.length()) {
                    break;
                } else {
                list[i][j] = str.charAt(num);
                num++;
                }
            }
        }
        for (int i = 0; i<max;i++) {
            for (int j = 0; j< min; j++) {
                if (list[j][i] > 0) {
                System.out.print(list[j][i]);
                }
            }
            if (i != max-1) {
            System.out.print(" ");
            }
        }
    
}
}