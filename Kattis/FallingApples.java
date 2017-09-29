package KattisPractice;

import java.util.Scanner;

public class FallingApples {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		char[][] arr = new char[n][m];
		for (int i = 0; i < n; i++){
			String s = in.next();
			for (int j = 0; j < s.length(); j++) {
				arr[i][j] = s.charAt(j);
			}
		}
		int c = 0;
		while (c < m) {
			int min = n-1;
			for (int i = n-1; i >=0; i--) {
				if (arr[i][c] == '#') min = i-1;
				else if (arr[i][c] == 'a') {
					arr[i][c] = '.';
					arr[min][c] = 'a';
					min--;
				}
			}
			c++;
		}
		for (int i = 0; i < n; i++) {
			StringBuffer res = new StringBuffer();
			for (int j = 0; j < m; j++) {
				res.append(arr[i][j]);
			}
			System.out.println(res);
		}
		
	}
}
