package Implementation;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SockMerchant {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        System.out.println(countPairs(c));
    }
    
    public static int countPairs(int[] sockList) {
        int count = 0;
        int num = 100;
        for (int i = 0; i < sockList.length; i++) {
            for (int j= 0; j< sockList.length; j++) {
                if (i!= j && sockList[i] == sockList[j]) {
                    count++;
                    num++;
                    sockList[i] = num;
                    num++;
                    sockList[j] = num;
                }
            }
        }
        return count;
    }
        
}


