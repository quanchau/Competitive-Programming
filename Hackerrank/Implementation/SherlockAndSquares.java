package Implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SherlockAndSquares {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i< n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int aRoot = (int) Math.ceil(Math.sqrt(a));
            int bRoot = (int) Math.floor(Math.sqrt(b));

            System.out.println((bRoot - aRoot +1));
        }
    }
}
