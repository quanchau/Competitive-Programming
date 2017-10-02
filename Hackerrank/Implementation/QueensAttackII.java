package Implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class QueensAttackII {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int rQueen = in.nextInt();
        int cQueen = in.nextInt();
         int up = n+1;
        int  down = 0;
        int closerLeftRow = 0;
        int closerRightRow = n+1;
        int upRight = Math.min(n - cQueen, n - rQueen) + 1;
         int downRight = Math.min(n - cQueen, rQueen -1) + 1;
         int upLeft = Math.min(cQueen -1, n - rQueen) +1;
         int downLeft = Math.min(cQueen -1, rQueen -1) +1;
        for(int a0 = 0; a0 < k; a0++){
            int rObstacle = in.nextInt();
            int cObstacle = in.nextInt();
            int first = cObstacle - cQueen;
            int second = rObstacle - rQueen;
            if (rObstacle == rQueen) {
                if (cObstacle < cQueen && cObstacle > closerLeftRow) {
                    closerLeftRow = cObstacle;
                    
                } else if (cObstacle > cQueen && cObstacle < closerRightRow) {
                    closerRightRow = cObstacle;
                }
            } else if (cObstacle == cQueen) {
                if (rObstacle < rQueen && rObstacle > down) {
                    down = rObstacle;
                    
                } else if (rObstacle > rQueen && rObstacle < up) {
                    up = rObstacle;
                }
            }
            
            else if (Math.abs(first) == Math.abs(second)) {
                if (second > 0) {
                    if (first > 0) {
                        if (first < upRight)
                        upRight = first;
                    } else {
                        if (Math.abs(first) < upLeft) {
                          upLeft = Math.abs(first);
                        }
                    }
                } else {
                    if (first > 0) {
                        if (first < downRight) {
                            downRight= first;
                        }
                    }else {
                            if (Math.abs(second) < downLeft) {
                                downLeft = Math.abs(second);
                            }
                        }
                    }
                }
            
                
            }
        
        
        int realUp = up- rQueen -1;
      
        int realDown = rQueen -1- down;
      
        int realLeft = cQueen - closerLeftRow - 1;
       
        int realRight = closerRightRow - cQueen - 1;
     
        int realUpRight = upRight -1;
      
        int realUpLeft = upLeft - 1;
      
        int realDownRight = downRight -1;
        int realDownLeft= downLeft - 1;
        
        System.out.println(realUp + realDown + realLeft + realRight + realUpRight + realUpLeft + realDownRight + realDownLeft);
        

    }
}
