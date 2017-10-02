package Implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LisaWorkbook {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] chaps = new int[n];
        for (int i_n = 0; i_n < n; i_n++) {
                chaps[i_n] = in.nextInt();
        }
        int page = 1;
        int chap = 0;
            int num = 0;
            while (chap <n ) {
                 int count = 1;
                 while (count <= chaps[chap]) {                  
                       if (count == page) {
                              num++;
                         
          
                       }
                      if (count% k == 0 && count!= chaps[chap]) {
                              page++;
                       }     
                       count++;
                 }
                    chap++;
                    page++;
            }
        System.out.println(num);
    }
}