package Implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AbsolutePermutation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            HashSet<Integer> visited = new HashSet<Integer>();
            int pos = 1;
            StringBuffer str = new StringBuffer("");
            while (pos <= n) { 
                int count = 0;
                int num1 = pos -k;
                int num2 = k+ pos;
                int num = 0;
                if (num1 > 0 && num1 < num2 && !visited.contains(num1) && num1 <= n) {
                    visited.add(num1);
                    str.append(num1 + " ");
                } else if (!visited.contains(num2) && num2 <=n) {
                    visited.add(num2);
                    str.append(num2 + " ");
                } else {
                    str = null;
                    break;
                }
                pos++;
            }
            if (str==null) {
                System.out.print(-1);
            } else {
            System.out.print(str);
            }
            System.out.println();
        }
    }
}

