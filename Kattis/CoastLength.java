/**
 * Created by Bom on 6/12/2017.
 */
import java.util.*;
public class CoastLength {
    static int[][] arr;
    static boolean[][] visited;
    static int res;
    static int n;
    static int m;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        res = 0;
        arr = new int[n][m];
        for (int i =0; i <n ; i++) {
        	String s = in.next();
            for (int j = 0; j<m; j++) {
                arr[i][j] = Integer.parseInt("" + s.charAt(j));
            }
        }
        visited = new boolean[n][m];
        int num = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i][num] && arr[i][num] == 0) {
                generate(i, num);
            } else if (arr[i][num] == 1) {
                res++;
            }
        }
        for (int i = 0; i < m; i++) {
            if (!visited[num][i] && arr[num][i] == 0) {
                generate(num, i);
            } else if (arr[num][i] == 1) {
                res++;
            }
        }

        num = n-1;
        for (int i = 0; i < m; i++) {
            if (!visited[num][i] && arr[num][i] == 0) {
                generate(num, i);
            } else if (arr[num][i] == 1) {
                res++;
            }
        }

        num = m-1;
        for (int i = 0; i < n; i++) {
            if (!visited[i][num] && arr[i][num] == 0) {
                generate(i, num);
            } else if (arr[i][num] == 1) {
                res++;
            }
        }

        System.out.println(res);

    }

    public static void generate(int x, int y) {
        if (!visited[x][y]) {
            visited[x][y] = true;
            for (int i = x - 1; i<= x+1; i++) {
                    if(i >=0 && i < n) {
                        if (arr[i][y] == 1) {
                            res++;
                        } else {    
                            generate(i, y);
                        	
                        }
                    }
                
            }
            
            for (int i = y - 1; i<= y+1; i++) {
                if(i >=0 && i < m) {
                    if (arr[x][i] == 1) {
                        res++;
                    } else {    
                        generate(x, i);
                    	
                    }
                }
            
        }
        }
    }
}
