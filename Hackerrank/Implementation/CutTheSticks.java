package Implementation;

import java.io.*;
import java.util.*;

public class CutTheSticks {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int j = 0; j<n; j++) {
            int num = in.nextInt();
            list.add(num);
        }
        while (list.size() > 0) {
            System.out.println(list.size());
            int min = Collections.min(list);
            for (int i = 0; i<list.size(); i++) {
                int num = list.get(i);
                list.remove(i);
                list.add(i,num-min);
         }
         
         while(list.remove((Integer)0)) {
             
         }
            }
        }
    }
