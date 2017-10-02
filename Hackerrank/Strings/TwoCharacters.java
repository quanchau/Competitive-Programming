package Strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TwoCharacters {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        String s = in.next();
        char[] list = s.toCharArray();
        int[] arr = new int[26];
        ArrayList<Character> letter = new ArrayList<Character>();
        int count = 0;
        for (char i: list) {
            if (arr[i-97] == 0) {
                count++;
                letter.add(i);
            }
            arr[i-97]++;
        }
        
        int max = 0;
        for (int i = 0; i < letter.size(); i++) {
            for (int j = i+1; j < letter.size(); j++) {
                if (Math.abs(arr[letter.get(i) - 97]- arr[letter.get(j)- 97]) <=1) {
                    boolean ok = true;
                        int num = -1;
                    for (char c : list) {
                    
                        if (c == letter.get(i)) {
                            if (num == 1) {
                                ok = false;
                                break;
                            } else {
                                num = 1;
                            }
                        } else if (c == letter.get(j)) {
                            if (num == 0) {
                                ok = false;
                                break;
                            } else {
                                num = 0;
                            }
                        }
                    }
                    if (ok && arr[letter.get(i) - 97] + arr[letter.get(j)- 97] > max) {
                        max =  arr[letter.get(i) - 97] + arr[letter.get(j)- 97];
                    }
                }
            }
        }
               
        System.out.println(max);
    }
}
