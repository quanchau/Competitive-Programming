package Implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BeautifulDaysAtTheMovies {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int start = in.nextInt();
        int end = in.nextInt();
        int k = in.nextInt();
        int count = 0;
        for (int i = start; i<=end; i++) {
            String str = "" + i;
            String str1 = "";
            for (int j = str.length() -1; j>=0; j--) {
                str1 += "" + str.charAt(j);
            }
            int i2 = Integer.parseInt(str1);
            if (Math.abs(i2 - i) %k ==0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
