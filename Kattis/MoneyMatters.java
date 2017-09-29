import java.util.*;
public class MoneyMatters {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		list = new int[n];
		for (int i = 0; i < n; i++) {
			list[i] = i;
		}
		for (int i = 0; i < m; i++) {
			int u = in.nextInt();
			int v = in.nextInt();
			union(u,v);
		}

		boolean possible = true;
		boolean[] visited = new boolean[n];
		for (int i = 0; i < n; i++) {
			if (!visited[i]) {
			visited[i] = true;
			int sum = arr[i];
			int num = find(i);
			for (int j = i+1; j < n; j++) {
				if (!visited[j] && find(j) == num) {
					visited[j] = true;
					sum+= arr[j];
				}
			}
			if (sum != 0) {
				possible = false;
				break;
			}
			}
		}
		if (!possible) {
			System.out.println("IMPOSSIBLE");
		} else {
			System.out.println("POSSIBLE");
		}
		
		
	}
	static int[] list;
	public static int find(int i) {
		if (list[i] == i) return i;
		else {
			list[i] = find(list[i]);
			return list[i];
		}
	}
	
	public static void union(int x, int y) {
		list[find(x)] = find(y);
	}
}
