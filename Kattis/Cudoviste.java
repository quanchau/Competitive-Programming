import java.util.*;
public class Cudoviste {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[][] arr = new int[n][m];
		for (int i = 0; i < n; i++) {
			String s = in.next();
			for (int j =0; j < m; j++) {
				char c = s.charAt(j);
				if (c == '#') arr[i][j] = 2;
				else if (c == 'X') arr[i][j] = 1;
	
			}
		}
		int[] res = new int[5];
		for (int i = 0; i < n; i++) {
			for (int j =0; j < m; j++) {
				int count = 0;
				if (i+1 >= n || j+1 >= m) continue;
				else {
					for (int s = i; s <= i+1; s++) {
						boolean done = false;
						for (int r = j; r <= j+1; r++) {
							if (arr[s][r] == 2) {
								count = -1;
								done = true;
								break;
							} else if (arr[s][r] == 1) {
								count++;
							}
							
						}
						if (done) break;
					}
					if (count >= 0 && count <=4) res[count]++;
				}
			}
			
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(res[i]);
		}
	}
}
