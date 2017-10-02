package Implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TheTimeInWords {
        
         private static final String[] tensNames = {
    "",
    "ten",
    "twenty",
    "thirty",
    "forty",
    "fifty",
    "sixty",
    "seventy",
    "eighty",
    "ninety"
  };

  private static final String[] numNames = {
    "",
    "one",
    "two",
    "three",
     "four",
    "five",
    "six",
    "seven",
    "eight",
    "nine",
    "ten",
    "eleven",
    "twelve",
    "thirteen",
    "fourteen",
    "fifteen",
    "sixteen",
    "seventeen",
    "eighteen",
    "nineteen"
  };

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int m = in.nextInt();
            if (m == 0) {
                    System.out.println(numNames[h] + " o' clock" );
            } else
            if (m < 15) {
                    System.out.println(numNames[m] + " minutes past " + numNames[h] );
            } else if (m == 15) {
                    System.out.println("quarter past " + numNames[h]);
            } else if (m < 30) {
                    if (m < 20) {
                    System.out.println(numNames[m] + " minutes past " +numNames[h] );
                    } else {
                    System.out.println(tensNames[2] + " " + numNames[m%10] + " minutes past " + numNames[h] );
                    }
            } else if (m == 30) {
                    System.out.println("half past " + numNames[h] );
            } else if (m < 45 || m > 45) {
                    m = 60 - m;
                    if (m > 20) {
                    System.out.println(tensNames[m/10] + " " + numNames[m%10] + " minutes to " + numNames[h+1] );
                    } else {
                    System.out.println(numNames[m] + " minutes to " + numNames[h+1]);
                    }
            } else {
                   System.out.println("quarter to " + numNames[h+1]);
            }
    }
}

