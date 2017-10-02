package Strings;

import java.io.*;
import java.util.*;

public class TheLoverLetterMystery {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 0; i< num; i++) {
            System.out.println(palindrome(sc.next()));
        }
        
    }
    
    public static int palindrome(String str) {
        int count = 0;
        char[] list = new char[str.length()];
        for (int i = 0; i < list.length; i++) {
            list[i] = str.charAt(i);
        }
        int start = 0;
        int end = list.length -1;
        while (start < end) {
            if (list[start] > list[end] ) {
                while(list[start] > list[end]) {
                    list[start]--;
                    count++;
                }
            } else {
                while(list[start]< list[end]) {
                    list[end]--;
                    count++;
                }
            }
            
            start++;
            end--;
        }
        return count;
        }
    
}
