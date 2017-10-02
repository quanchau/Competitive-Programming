package Implementation;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ChocolateFeast {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int c = in.nextInt();
            int m = in.nextInt();
            int num = n/c;
            int numWrappers = num;
            while (numWrappers >= m) {
                num += numWrappers/m;
                numWrappers = numWrappers%m + numWrappers/m;
            }
            
            System.out.println(num);
        }
    }
}

