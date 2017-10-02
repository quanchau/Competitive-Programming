package Implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AppendAndDelete {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int k = in.nextInt();
        int ind = 0;
        int dif = 0;
        while (ind <s.length() && ind<t.length()) {
            if (s.charAt(ind) != t.charAt(ind)) {
                break;
            }
            ind++;
        }
        
        dif = s.length() - ind + (t.length() - ind);

        if (k < dif) {
            System.out.println("No");
        } else if (k == dif) {
            System.out.println("Yes");
        } else {
            if ((k-dif)%2 == 0) {
                System.out.println("Yes");
            }else if ((k) > (s.length() + t.length())) {
                 System.out.println("Yes");
            } else {
                 System.out.println("No");
            }
        }
        } 
}

