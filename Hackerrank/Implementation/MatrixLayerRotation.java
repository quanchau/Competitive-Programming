package Implementation;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MatrixLayerRotation {

    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int h = in.nextInt();
        int w = in.nextInt();
        int r = in.nextInt();
        int[][] arr = new int[h][w];
        for (int i = 0; i <h; i++) {
            for (int j  = 0; j< w; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        
        boolean[][] visited = new boolean[h][w];
        int minX = 0;
        int minY = 0;
        int maxX = w-1;
        int maxY = h-1;
        while (!visited[minX][minY]) {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            temp.add(arr[minY][minX]);
            visited[minY][minX] = true;
            int x = minX +1;
            int y = minY;
            while(x != minX || y != minY) {
                visited[y][x] = true;
                temp.add(arr[y][x]);
                if (y == minY && x < maxX) {
                    x++;
                } else if (x == maxX && y < maxY) {
                    y++;
                } else if (y == maxY && x > minX) {
                    x--;
                } else if (x == minX && y > minY) {
                    y--;
                }
            }
            int tempR = r%temp.size();
            int num =0;
            arr[minY][minX] = temp.get(((num + tempR)% temp.size()));
            x = minX +1;
            y = minY;
            num++;
            while(x != minX || y != minY) {
                arr[y][x] = temp.get(((num + tempR)% temp.size()));
                if (y == minY && x < maxX) {
                    x++;
                } else if (x == maxX && y < maxY) {
                    y++;
                } else if (y == maxY && x > minX) {
                    x--;
                } else if (x == minX && y > minY) {
                    y--;
                }
                num++;
            }
            minX++;
            minY++;
            maxX--;
            maxY--;
           
        }
          for (int i = 0; i <h; i++) {
            for (int j  = 0; j< w; j++) {
                System.out.print(arr[i][j] + " ");
            }
               System.out.println();
        }
        
    }
}
