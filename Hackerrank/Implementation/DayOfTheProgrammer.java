package Implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DayOfTheProgrammer {

    static void solve(int year){
        if (year <= 1917) {
            if (year %4 == 0) {
                System.out.println("12.09." + year);
            } else {
                System.out.println("13.09." + year);
            }
        } else if (year == 1918) {
            System.out.println("26.09." + year);
        } else {
            if (year%400==0) {
                System.out.println("12.09." + year);
    } else if ((year%100!=0) && year%4 ==0) {
                 System.out.println("12.09." + year);
            } else {
                System.out.println("13.09." + year);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        solve(year);
    }
}