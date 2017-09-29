import java.util.*;
public class SecretMessage {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i_t = 0; i_t < t; i_t++) {
			String s =in.next();
			int l = s.length();
			double m = l;
			while(Math.sqrt(m)%1 != 0) {
				m++;
			}
			int k = (int) Math.sqrt(m);
			char[][] arr = new char[k][k];
			int ind = 0;
			for (int i = 0; i < k; i++) {
				for (int j = 0; j < k; j++) {
					if (ind < s.length()) {
						arr[i][j] = s.charAt(ind);
						ind++;
					} else{
						arr[i][j] = '*';
					}
				}
			}
			for (int i = 0; i <k; i++) {
				for (int j = k-1; j>=0; j--) {
					if (arr[j][i] != '*') {
					System.out.print(arr[j][i]);
					}
				}
			}
			System.out.println();
		}
	}
}
