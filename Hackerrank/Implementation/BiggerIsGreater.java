package Implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BiggerIsGreater {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i_n = 0; i_n < n; i_n++) {
            String s = in.next();
            char[] list = new char[s.length()];
            for (int i = 0; i < s.length(); i++) {
                list[i] = s.charAt(i);
            }
            int i = s.length() -2;
            while (i>= 0) {
                if (list[i+1] > list[i]) {
                    break;
                }
                i--;
            }
            if(i == -1) {
                System.out.println("no answer");
            } else {
            int min = list[i+1] - list[i];
            int current = i+1;
            for (int j = i+1; j < s.length(); j++) {
                if (list[j] - list[i] < min && list[j] - list[i] > 0) {
                    min = list[j] - list[i];
                    current = j;
                }
            }
            swap(list, current, i);
            char[] list2=  new char[s.length() - i-1];
            for (int j = 0; j < list2.length; j++) {
                list2[j] = list[j+i+1];
            }
            Arrays.sort(list2);
            StringBuffer bff = new StringBuffer();
            for (int j = 0; j <=i ; j++) {
                bff.append(list[j]);
            }
            for (int j = 0; j< list2.length;j++) {
                bff.append(list2[j]);
            }
            System.out.println(bff);
        }
        }
    }
    
    public static void swap(char[] list, int i1, int i2) {
        char c = list[i1];
        list[i1] = list[i2];
        list[i2] = c;
    }
}
