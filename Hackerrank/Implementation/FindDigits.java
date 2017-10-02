package Implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FindDigits {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            String str = "" + n;
            int count = 0;
            for (int i = 0; i< str.length(); i++) {
                String num = "" +str.charAt(i);
                int thatNum = Integer.parseInt(num);
                if (thatNum!= 0 && n% thatNum== 0) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
