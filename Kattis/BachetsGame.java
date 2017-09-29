import java.util.*;
public class BachetsGame {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	while (in.hasNext()) {
		int n = in.nextInt();
		int m = in.nextInt();
		int[] arr = new int[m];
		for (int i = 0; i < m; i++) {
			arr[i] = in.nextInt();
		}
		boolean[] dp = new boolean[1000001];
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < m; j++) {
				if (i >= arr[j] && !dp[i-arr[j]]) {
					dp[i] = true;
					break;
				}
			}
		}
		if (dp[n]) {
			System.out.println("Stan wins");
		} else {
			System.out.println("Ollie wins");
		}
		
	}
	}
}
