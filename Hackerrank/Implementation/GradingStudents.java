package Implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GradingStudents {

    static void solve(int[] grades){
        for (int i : grades) {
            if (i >= 38) {
                if ((i+1)%5 == 0) {
                    System.out.println(i+1);
                } else if ((i+2)%5 == 0) {
                    System.out.println(i+2);
                } else {
                    System.out.println(i);
                }
            } else {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        solve(grades);
     
    }
}
