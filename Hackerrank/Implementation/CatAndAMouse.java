package Implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CatAndAMouse {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            int num1 = Math.abs(x-z);
            int num2 = Math.abs(y-z);
            if (num1 > num2) {
                System.out.println("Cat B");
            } else if (num1 == num2) {
                System.out.println("Mouse C");
               
            } else {
                System.out.println("Cat A");
            }
        }
        
    }
}

