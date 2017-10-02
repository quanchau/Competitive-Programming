package Implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ModifiedKaprekarNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long p = sc.nextInt();
        long q = sc.nextInt();
        int count = 0;
        for (long i = p; i <= q; i++) {
            long num = i*i;
            String numString = "" + num;
            long firstNum =0;
            long secNum = 0;
 
       
                String first= "";
                String second = "";
               for (int j = 0; j< numString.length()/2; j++) {
                   first = first + numString.charAt(j);
               }
                for (int j = numString.length()/2; j < numString.length(); j++) {
                    second = second + numString.charAt(j);
                }
                              if (first.length() > 0) {
                    firstNum = Integer.parseInt(first);
                }
                if (second.length() > 0) {
                    secNum = Integer.parseInt(second);
                }
            
            if (firstNum + secNum == i) {
                System.out.print(i + " ");
                count++;
            }
        }
        if (count == 0) {
            System.out.println("INVALID RANGE");
        }
    }
}
