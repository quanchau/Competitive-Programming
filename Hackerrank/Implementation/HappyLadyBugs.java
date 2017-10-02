package Implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HappyLadyBugs {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Q = in.nextInt();
        for(int a0 = 0; a0 < Q; a0++){
            int n = in.nextInt();
            String b = in.next();
            String c = b.replace("_", "");
            HashMap<String, Integer> list = new HashMap<String, Integer>();
            for (int i = 0; i < c.length(); i++) {
                String str = "" + c.charAt(i);
                if (!list.containsKey(str)) {
                    list.put(str, 1);
                } else {
                    int num = list.get(str) + 1;
                    list.put(str, num);
                }
            }
            Set<String> keyset = list.keySet();
           ArrayList<String> keys = new ArrayList<String>();
            keys.addAll(keyset);
 
            int odd = 0;

            for (String key : keys) {
                if (list.get(key) == 1) {
                    odd++;
                }
            }
            if (odd > 0) {
                System.out.println("NO");
            } else if (c.length() == b.length()) {
                ArrayList<Integer> intList = new ArrayList<Integer>();
                boolean cont = true;
                int count = 1;
                for (int i = 1; i < c.length(); i++) {
                    String current = "" + c.charAt(i);
                    String previous = "" + c.charAt(i-1);
                    if (current.equals(previous)) {
                        count++;
                    } else {
                        intList.add(count);
                        count = 1;
                    }
                }
                for (int num : intList) {
                    if (num == 1) {
                        System.out.println("NO");
                        cont = false;
                        break;
                    }
                } 
        
                if (cont) {
                    System.out.println("YES");
                }
            } else {
                System.out.println("YES");
            }
        }
        
    }
}

