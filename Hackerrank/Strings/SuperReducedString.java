package Strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SuperReducedString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        ArrayList<Character> list = new ArrayList<Character>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }
        boolean ok = false;
        while (!ok) {
            ok = true;
        for (int i = 0; i < list.size()-1; i++) {
            if (list.get(i) == list.get(i+1)) {
                list.remove(i);
                list.remove(i);
                i--;
                ok = false;
            }
        }
        }
       StringBuffer buffer = new StringBuffer();
        for (char s : list) {
            buffer.append(s);
        }
        if (buffer.length() == 0) {
            System.out.println("Empty String");
        } else {
        System.out.println(buffer);
        }
    }
}