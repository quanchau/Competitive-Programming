package Strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GameOfThronesI {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String inputString = myScan.nextLine();
        int count = 0;
        char[] list = new char[inputString.length()];
        for (int i = 0; i< inputString.length(); i++) {
            list[i] = inputString.charAt(i);
        }
        Arrays.sort(list);
        char start = list[0];
        int c = 1;
        for (char i : list) {
            if (i == start) {
                c++;
            } else {
                start = i;
                if (c%2 == 1) {
                    count++;
                }
                c=1;
            }
        }
          String ans = "";
        if (count > 1) {
            ans = "NO";
        } else {
            ans = "YES";
        }
      
        System.out.println(ans);
        myScan.close();
    }
}

