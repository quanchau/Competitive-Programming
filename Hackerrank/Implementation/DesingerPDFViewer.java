package Implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DesingerPDFViewer {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for(int h_i=0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        int height = 0;
        int width = 0;
        for (int i = 0; i < word.length(); i++) {
            width++;
;
            int num = ((int) word.charAt(i)) -96;
            if (h[num-1] > height) {
                height = h[num-1];
            }
        }
        System.out.println(width*height);
    }
}

